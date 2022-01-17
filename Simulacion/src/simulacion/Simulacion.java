/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Noel Roberto
 */
public class Simulacion {

    public static List<Renglon> tabla = new ArrayList<Renglon>();
    public static Integer nServidores = new Integer(0);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer nEvento,undTiempo;
        List<Integer> cola = new ArrayList<Integer>();
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa cantidad de servidores");
        nServidores=lectura.nextInt();
        
        System.out.println("Ingrese tiempo a simular");
        undTiempo=lectura.nextInt();
        
        Servidor []servidores = new Servidor[nServidores];
        for (int i = 0; i < nServidores; i++) {
            servidores[i] = new Servidor(i+1);
        }
        
        System.out.println("Ingrese numero de tiempos de llegada");
        int tiemposLL=lectura.nextInt();
        
        Probabilidades llegada=new Probabilidades(tiemposLL);
        
        for (int i = 0; i < tiemposLL; i++) {
            System.out.println("Ingrese tiempo");
            Integer tiempo = lectura.nextInt();
            System.out.println("Ingrese probabilidad(0 a 1)");
            float probabilidad=lectura.nextFloat();
            llegada.setTiempo(tiempo, probabilidad, i);
        }
        llegada.completacion();
        
        System.out.println("Ingrese numero de tiempos de servicio");
        int tiemposTS=lectura.nextInt();
        
        Probabilidades ts=new Probabilidades(tiemposTS);
        
        for (int i = 0; i < tiemposTS; i++) {
            System.out.println("Ingrese tiempo");
            Integer tiempo = lectura.nextInt();
            System.out.println("Ingrese probabilidad(0 a 1)");
            float probabilidad=lectura.nextFloat();
            ts.setTiempo(tiempo, probabilidad, i);
        }
        ts.completacion();
        
        
        //Inicio de la simulacion
        Integer tM=0; 
        Integer aT=0;
        nEvento=0;
        Integer ultimoC=0;
        char tipo='m';
        Renglon rPrin=new Renglon(nServidores);
        rPrin.setNum(0);
        rPrin.setTipo('n');
        rPrin.setCliente(0);
        rPrin.setaT(aT);
        rPrin.settM(tM);
        for (int i = 0; i < nServidores; i++) {
            rPrin.updateSS(i, 0);
        }
        rPrin.setwL(0);
        rPrin.setcSistema(0);
        for (int i = 0; i < nServidores; i++) {
            rPrin.updateDT(i, 9999);
        }
        rPrin.setnAleatorioTELL(-1);
        rPrin.setTiempoTELL(-1);
        rPrin.setnAleatorioTS(-1);
        rPrin.settServicio(-1);
        tabla.add(new Renglon(rPrin));
        while (tM<=undTiempo) {       
            Boolean cambioTabla=false;
            //Verificar cual es el menor entre el tiempo de llegada y los tiempos de salida de los servidores
            //Caso 1 AT es igual a TM y menor a los DT
            if((aT==tM)){
                cambioTabla=true;
                tipo='l';
                nEvento=nEvento+1;
                ultimoC=ultimoC+1;
                rPrin.setTipo(tipo);
                rPrin.setNum(nEvento);
                rPrin.setCliente(ultimoC);
                rPrin.setcSistema(rPrin.getcSistema()+1);
                boolean bandera=false;
                for (int i = 0; i < servidores.length; i++) {
                    if (servidores[i].vacio()) {
                        bandera=true;
                        Integer lec=new Random().nextInt(99)+ 0;
                        Integer numTs=tM + ts.num(lec);
                        servidores[i].llegaCliente(ultimoC, numTs);
                        rPrin.updateSS(i, ultimoC);
                        rPrin.updateDT(i, numTs);
                        rPrin.setnAleatorioTS(lec);
                        rPrin.settServicio(numTs);
                        break;
                    }
                }
                if(!bandera){
                    cola.add(ultimoC);
                    rPrin.setwL(rPrin.getwL()+1);
                    rPrin.settServicio(-1);
                    rPrin.setnAleatorioTS(-1);
                }
                Integer lec2=new Random().nextInt(99)+ 0;
                Integer numTEL =llegada.num(lec2);
                rPrin.setnAleatorioTELL(lec2);
                rPrin.setTiempoTELL(numTEL);
                aT=numTEL + tM;
                rPrin.setaT(aT);
            }else{
                if(tM==menor(nServidores, servidores)){
                    cambioTabla=true;
                    tipo='s';
                    nEvento=nEvento+1;
                    rPrin.setTipo(tipo);
                    rPrin.setNum(nEvento);
                    Integer saliendo=servidormenor(nServidores, servidores);
                    rPrin.setCliente(servidores[saliendo].getClient());
                    servidores[saliendo].sacarCliente();
                    rPrin.updateSS(saliendo, 0);
                    rPrin.updateDT(saliendo, 9999);
                    rPrin.setnAleatorioTS(-1);
                    rPrin.settServicio(-1);
                    rPrin.setnAleatorioTELL(-1);
                    rPrin.setTiempoTELL(-1);
                    rPrin.setcSistema(rPrin.getcSistema()-1);
                    if(!cola.isEmpty()){
                        Integer prueba=new Random().nextInt(99)+ 0;
                        rPrin.setnAleatorioTS(prueba);
                        Integer numTs=ts.num(prueba);
                        Integer newDT=tM+numTs;
                        servidores[saliendo].llegaCliente(cola.get(0),newDT );
                        rPrin.setnAleatorioTS(prueba);
                        rPrin.settServicio(numTs);
                        rPrin.updateDT(saliendo, newDT);
                        rPrin.updateSS(saliendo, cola.get(0));
                        rPrin.setwL(rPrin.getwL()-1);
                        cola.remove(0);
                    }
                }
            }
            if(cambioTabla){
                rPrin.tM=tM;
                tabla.add(new Renglon(rPrin));
            }
            if((aT!=tM)&&(tM!=menor(nServidores, servidores))){
                tM=tM+1;
            }
            
            
        }
        for(Renglon e:tabla){
            e.print();
            System.out.println("\n");
        }
        
        Inicio interfaz= new Inicio();
        interfaz.setVisible(true);
    }
    
    public static Integer menor(Integer nserv, Servidor[] servidoresact){
        Integer tiempomenor=servidoresact[0].getdT();
        for (int i = 1; i < nserv; i++) {
            if (tiempomenor>servidoresact[i].getdT()) {
                tiempomenor=servidoresact[i].getdT();
            }
        }
        return tiempomenor;
    }
    
    public static Integer servidormenor(Integer nserv, Servidor[] servidoresact){
        Integer tiempomenor=servidoresact[0].getdT();
        Integer servActual=0;
        for (int i = 1; i < nserv; i++) {
            if (tiempomenor>servidoresact[i].getdT()) {
                tiempomenor=servidoresact[i].getdT();
                servActual=i;
            }
        }
        return servActual;
    }
    
}
