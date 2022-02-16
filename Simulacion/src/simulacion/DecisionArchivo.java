/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import static simulacion.Simulacion.menor;
import static simulacion.Simulacion.servidormenor;

/**
 *
 * @author Noel Roberto
 */
public class DecisionArchivo extends javax.swing.JPanel {

    /**
     * Creates new form DecisionArchivo
     */
    public DecisionArchivo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 589));
        setMinimumSize(new java.awt.Dimension(980, 589));
        setPreferredSize(new java.awt.Dimension(980, 589));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Que desea hacer con la funcion de los archivos?");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Leer");
        jButton2.setPreferredSize(new java.awt.Dimension(94, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CrearArchivo p2 = new CrearArchivo();
        p2.setSize(980, 589);
        p2.setLocation(0, 0);
        removeAll();
        add(p2, BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!Inicio.renglones.isEmpty()) {
            Inicio.renglones.clear();
        }
        Inicio.archivo=null;
        Inicio.fr=null;
        try {
            String directorio = System.getProperty("user.dir");
            Inicio.archivo = new File(directorio+"/Datos.txt");
            Inicio.fr = new FileReader(Inicio.archivo);
            Inicio.fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe crear el documento en Crear");
        }
        //simular();
        simulacion2();
        VisualizarSimulacion p4 = new VisualizarSimulacion();
        p4.setSize(980, 589);
        p4.setLocation(0, 0);
        removeAll();
        add(p4, BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Si no precargo el documento en Crear o Leer se inicializaran los datos en vacio");
        Inicio.modificar=true;
        CrearArchivo p2 = new CrearArchivo();
        p2.setSize(980, 589);
        p2.setLocation(0, 0);
        removeAll();
        add(p2, BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public static void simular(){
        Integer nEvento;
        List<Integer> cola = new ArrayList<Integer>();
        
        String directorio = System.getProperty("user.dir");
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File(directorio+"/Datos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            Inicio.nServs=Integer.parseInt(br.readLine());
            Servidor []servidores = new Servidor[Inicio.nServs];
            for (int i = 0; i < Inicio.nServs; i++) {
                servidores[i] = new Servidor(i+1);
            }
            Inicio.tiempo=Integer.parseInt(br.readLine());
            Integer topeTell=Integer.parseInt(br.readLine());
            Inicio.llegadas=new Probabilidades(topeTell);
            for (int i = 0; i < topeTell; i++) {
                Integer tiempo=Integer.parseInt(br.readLine());
                float probabilidad= Float.parseFloat(br.readLine());
                Inicio.llegadas.setTiempo(tiempo, probabilidad, i);
            }
            Integer topeTS = Integer.parseInt(br.readLine());
            Inicio.servicios= new Probabilidades(topeTS);
            for (int i = 0; i < topeTS; i++) {
                Integer tiempo = Integer.parseInt(br.readLine());
                float proba= Float.parseFloat(br.readLine());
                Inicio.servicios.setTiempo(tiempo, proba, i);
            }
            Inicio.llegadas.completacion();
            Inicio.servicios.completacion();
            Inicio.unidad=br.readLine();
            Inicio.clientesPermitidos=Integer.valueOf(br.readLine());
            Inicio.costoTSC=Float.parseFloat(br.readLine());
            Inicio.costoEC=Float.parseFloat(br.readLine());
            Inicio.costoSerO=Float.parseFloat(br.readLine());
            Inicio.costoServD=Float.parseFloat(br.readLine());
            Inicio.costoServTE=Float.parseFloat(br.readLine());
            Inicio.costoSistemaN=Float.parseFloat(br.readLine());
            Inicio.costoSistemaTE=Float.parseFloat(br.readLine());
            //Inicio de la simulacion
            Integer tM=0; 
            Integer aT=0;
            nEvento=0;
            Integer ultimoC=0;
            char tipo='m';
            Renglon rPrin=new Renglon(Inicio.nServs);
            rPrin.setNum(0);
            rPrin.setTipo('n');
            rPrin.setCliente(0);
            rPrin.setaT(aT);
            rPrin.settM(tM);
            for (int i = 0; i < Inicio.nServs; i++) {
                rPrin.updateSS(i, 0);
            }
            rPrin.setwL(0);
            rPrin.setcSistema(0);
            for (int i = 0; i < Inicio.nServs; i++) {
                rPrin.updateDT(i, 9999);
            }
            rPrin.setnAleatorioTELL(-1);
            rPrin.setTiempoTELL(-1);
            rPrin.setnAleatorioTS(-1);
            rPrin.settServicio(-1);
            Inicio.renglones.add(new Renglon(rPrin));
            if (Inicio.clientesNoEsperan!=0) {
                Inicio.clientesNoEsperan=0;
            }
            double clientesEntraron=0;
            int tmAnterior=0;
            double clientesPromedioSistema=0;
            double clientesPromedioCola=0;
            int tmCola=0;
            Inicio.promUso= new double[Inicio.nServs];
            for (int i = 0; i < Inicio.nServs; i++) {
                Inicio.promUso[i]=0;
            }
            double []usosServ = new double[Inicio.nServs];
            double []tiempoSer= new double[Inicio.nServs];
            for (int i = 0; i < Inicio.nServs; i++) {
                tiempoSer[i]=0;
                tiempoSer[i]=0;
            }
            List<ClientesTiempos> listaClientes= new ArrayList<ClientesTiempos>();
            double []tiemposServidores= new double[Inicio.nServs];
            double clientescola=0;
            Inicio.clientesNoEsperan=0;
            listaClientes.add(new ClientesTiempos(0,0));
            listaClientes.get(0).setServicio(0);
            listaClientes.get(0).setSalida(0);
            while (tM<=Inicio.tiempo) {       
                Boolean cambioTabla=false;
                System.out.println("Tiempo: "+tM);
                //Verificar cual es el menor entre el tiempo de llegada y los tiempos de salida de los servidores
                //Caso 1 AT es igual a TM y menor a los DT
                if((aT==tM)){
                    cambioTabla=true;
                    clientesEntraron++;
                    clientesPromedioSistema=clientesPromedioSistema+(rPrin.getcSistema()*(tM-tmAnterior));
                    tmAnterior=tM;
                    tipo='l';
                    nEvento=nEvento+1;
                    ultimoC=ultimoC+1;
                    rPrin.setTipo(tipo);
                    rPrin.setNum(nEvento);
                    rPrin.setCliente(ultimoC);
                    rPrin.setcSistema(rPrin.getcSistema()+1);
                    listaClientes.add(new ClientesTiempos(ultimoC,tM));
                    boolean bandera=false;
                    for (int i = 0; i < servidores.length; i++) {
                        if (servidores[i].vacio()) {
                            Inicio.clientesNoEsperan=Inicio.clientesNoEsperan+1;
                            listaClientes.get(ultimoC).setServicio(tM);
                            tiempoSer[i]=tM;
                            bandera=true;
                            Integer lec=new Random().nextInt(99)+ 0;
                            Integer numTs=tM + Inicio.servicios.num(lec);
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
                        clientescola++;
                        clientesPromedioCola=clientesPromedioCola+(rPrin.getwL()*(tM-tmCola));
                        tmCola=tM;
                        rPrin.setwL(rPrin.getwL()+1);
                        rPrin.settServicio(-1);
                        rPrin.setnAleatorioTS(-1);
                    }
                    Integer lec2=new Random().nextInt(99)+ 0;
                    Integer numTEL =Inicio.llegadas.num(lec2);
                    rPrin.setnAleatorioTELL(lec2);
                    rPrin.setTiempoTELL(numTEL);
                    aT=numTEL + tM;
                    rPrin.setaT(aT);
                }else{
                    if(tM==menor(Inicio.nServs, servidores)){
                        cambioTabla=true;
                        clientesPromedioSistema=clientesPromedioSistema+(rPrin.getcSistema()*(tM-tmAnterior));
                        tmAnterior=tM;
                        tipo='s';
                        nEvento=nEvento+1;
                        rPrin.setTipo(tipo);
                        rPrin.setNum(nEvento);
                        Integer saliendo=servidormenor(Inicio.nServs, servidores);
                        rPrin.setCliente(servidores[saliendo].getClient());
                        listaClientes.get(rPrin.getCliente()).setSalida(tM);
                        servidores[saliendo].sacarCliente();
                        rPrin.updateSS(saliendo, 0);
                        rPrin.updateDT(saliendo, 999999999);
                        rPrin.setnAleatorioTS(-1);
                        rPrin.settServicio(-1);
                        rPrin.setnAleatorioTELL(-1);
                        rPrin.setTiempoTELL(-1);
                        rPrin.setcSistema(rPrin.getcSistema()-1);
                        if (cola.isEmpty()) {
                            usosServ[saliendo]=usosServ[saliendo]+tM-tiempoSer[saliendo];
                        }
                        if(!cola.isEmpty()){
                            clientesPromedioCola=clientesPromedioCola+(rPrin.getwL()*(tM-tmCola));
                            tmCola=tM;
                            Integer prueba=new Random().nextInt(99)+ 0;
                            rPrin.setnAleatorioTS(prueba);
                            Integer numTs=Inicio.servicios.num(prueba);
                            Integer newDT=tM+numTs;
                            servidores[saliendo].llegaCliente(cola.get(0),newDT );
                            rPrin.setnAleatorioTS(prueba);
                            rPrin.settServicio(numTs);
                            rPrin.updateDT(saliendo, newDT);
                            rPrin.updateSS(saliendo, cola.get(0));
                            listaClientes.get(cola.get(0)).setServicio(tM);
                            rPrin.setwL(rPrin.getwL()-1);
                            cola.remove(0);
                        }
                    }
                }
                if(cambioTabla){
                    if (rPrin.getNum()<=20) {
                        rPrin.tM=tM;
                        Inicio.renglones.add(new Renglon(rPrin));
                    }
                }
                if((aT!=tM)&&(tM!=menor(Inicio.nServs, servidores))){
                    if (aT<menor(Inicio.nServs, servidores)) {
                        tM=aT;
                    }else{
                        tM=menor(Inicio.nServs, servidores);
                    }
                }


            }
            Inicio.clientesNoatendidos=rPrin.getwL();
            Inicio.probabilidadEsperar=1-(Inicio.clientesNoEsperan/clientesEntraron);
            if(Inicio.clientesPromSistema!=0){
                Inicio.clientesPromSistema=0;
            }
            double tmdouble=tM;
            Inicio.clientesPromSistema=clientesPromedioSistema/tmdouble;
            if (Inicio.clientesPromCola!=0) {
                Inicio.clientesPromCola=0;
            }
            Inicio.prometioclientescola=clientesPromedioCola/clientescola;
            
            Inicio.clientesPromCola=clientesPromedioCola/tmdouble;
            for (int i = 0; i < Inicio.nServs; i++) {
                if (rPrin.sS[i]!=0) {
                    usosServ[i]=usosServ[i]+tM-tiempoSer[i];
                }
            }
            double tiempoSim=tM;
            Inicio.promUso= new double[Inicio.nServs];
            if (Inicio.usoServ!=0) {
                Inicio.usoServ=0;
            }
            if (Inicio.tiempoPromCerrar!=0) {
                Inicio.tiempoPromCerrar=0;
            }
            for (int i = 0; i < Inicio.nServs; i++) {
                Inicio.promUso[i]=usosServ[i]/tiempoSim;
                Inicio.usoServ=Inicio.usoServ+Inicio.promUso[i];
                if (rPrin.getSSPosi(i)!=0) {
                    Inicio.tiempoPromCerrar=Inicio.tiempoPromCerrar+rPrin.getDTPosi(i)-tM;
                }
            }
            Inicio.usoServ=Inicio.usoServ/Inicio.nServs;
            Inicio.tiempoPromCerrar=Inicio.tiempoPromCerrar/Inicio.nServs;
            
                Inicio.tiempoPromClientesSistema=0;
                Inicio.tiempPromClieCola=0;
            
            for (ClientesTiempos listcli : listaClientes) {
                if (listcli.salida!=0) {
                    Inicio.tiempoPromClientesSistema=Inicio.tiempoPromClientesSistema+listcli.getSalida()-listcli.getLlegada();
                    Inicio.tiempPromClieCola=Inicio.tiempPromClieCola+listcli.getServicio()-listcli.getLlegada();
                }
            }
            Inicio.tiempoPromClientesSistema=Inicio.tiempoPromClientesSistema/clientesEntraron;
            Inicio.tiempPromClieCola=Inicio.tiempPromClieCola/clientesEntraron;

            Inicio.costoServidoresDeso=0;
            Inicio.costoServidoresOcu=0;
            Inicio.costoServidoresExtra=0;
            
            for (int i = 0; i < Inicio.nServs; i++) {
                Inicio.costoServidoresOcu=Inicio.costoServidoresOcu+usosServ[i];
                Inicio.costoServidoresDeso=Inicio.costoServidoresDeso+Inicio.tiempo-usosServ[i];
                if (rPrin.getSSPosi(i)!=0) {
                    Inicio.costoServidoresExtra=Inicio.costoServidoresExtra+rPrin.getDTPosi(i)-Inicio.tiempo;
                }
            }
            float ser=Inicio.nServs;
            Inicio.tiempoextra=Inicio.costoServidoresExtra/ser;
            Inicio.costoServidoresDeso=Inicio.costoServidoresDeso*Inicio.costoServD;
            Inicio.costoServidoresOcu=Inicio.costoServidoresOcu*Inicio.costoSerO;
            Inicio.costoServidoresExtra=Inicio.costoServidoresExtra*Inicio.costoServTE;
            Inicio.costoClienteCola=Inicio.tiempPromClieCola*Inicio.costoEC;
            Inicio.costoCliente=Inicio.tiempoPromClientesSistema*Inicio.costoTSC;
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error en cerrado");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en lectura");
        }
    }
    
    public void simulacion2(){
        Integer nEvento;
        List<Integer> cola = new ArrayList<Integer>();
        
        String directorio = System.getProperty("user.dir");
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File(directorio+"/Datos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            Inicio.nServs=Integer.parseInt(br.readLine());
            Servidor []servidores = new Servidor[Inicio.nServs];
            for (int i = 0; i < Inicio.nServs; i++) {
                servidores[i] = new Servidor(i+1);
            }
            Inicio.tiempo=Integer.parseInt(br.readLine());
            Integer topeTell=Integer.parseInt(br.readLine());
            Inicio.llegadas=new Probabilidades(topeTell);
            for (int i = 0; i < topeTell; i++) {
                Integer tiempo=Integer.parseInt(br.readLine());
                float probabilidad= Float.parseFloat(br.readLine());
                Inicio.llegadas.setTiempo(tiempo, probabilidad, i);
            }
            Integer topeTS = Integer.parseInt(br.readLine());
            Inicio.servicios= new Probabilidades(topeTS);
            for (int i = 0; i < topeTS; i++) {
                Integer tiempo = Integer.parseInt(br.readLine());
                float proba= Float.parseFloat(br.readLine());
                Inicio.servicios.setTiempo(tiempo, proba, i);
            }
            Inicio.llegadas.completacion();
            Inicio.servicios.completacion();
            Inicio.unidad=br.readLine();
            if (Inicio.unidad.equals("Segundos")) {
                Inicio.min=Inicio.tiempo;
                Inicio.tiempo=1;
            }else{
                if (Inicio.unidad.equals("Minutos")) {
                    Inicio.min=Inicio.tiempo;
                    Inicio.tiempo=1;

                }else{
                    if (Inicio.unidad.equals("Dias")) {
                        Inicio.min=540;

                    }else{
                        if (Inicio.unidad.equals("Semanas")) {
                            Inicio.min=540;
                            Inicio.tiempo=Inicio.tiempo*7;

                        }else{
                            if (Inicio.unidad.equals("Meses")) {
                                Inicio.min=540;
                                Inicio.tiempo=Inicio.tiempo*30;

                            }else{
                                if (Inicio.unidad.equals("Años")) {
                                     Inicio.min=540;
                                     Inicio.tiempo=Inicio.tiempo*360;

                                }
                            }
                        }
                    }
                }
            }
            Inicio.clientesPermitidos=Integer.valueOf(br.readLine());
            Inicio.costoTSC=Float.parseFloat(br.readLine());
            Inicio.costoEC=Float.parseFloat(br.readLine());
            Inicio.costoSerO=Float.parseFloat(br.readLine());
            Inicio.costoServD=Float.parseFloat(br.readLine());
            Inicio.costoServTE=Float.parseFloat(br.readLine());
            Inicio.costoSistemaN=Float.parseFloat(br.readLine());
            Inicio.costoSistemaTE=Float.parseFloat(br.readLine());
            //Inicio de la simulacion
            Integer tM=0; 
            Integer aT=0;
            nEvento=0;
            Integer ultimoC=0;
            char tipo='m';
            Renglon rPrin=new Renglon(Inicio.nServs);
            rPrin.setNum(0);
            rPrin.setTipo('n');
            rPrin.setCliente(0);
            rPrin.setaT(aT);
            rPrin.settM(tM);
            for (int i = 0; i < Inicio.nServs; i++) {
                rPrin.updateSS(i, 0);
            }
            rPrin.setwL(0);
            rPrin.setcSistema(0);
            for (int i = 0; i < Inicio.nServs; i++) {
                rPrin.updateDT(i, 999999999);
            }
            rPrin.setnAleatorioTELL(-1);
            rPrin.setTiempoTELL(-1);
            rPrin.setnAleatorioTS(-1);
            rPrin.settServicio(-1);
            Inicio.renglones.add(new Renglon(rPrin));
            if (Inicio.clientesNoEsperan!=0) {
                Inicio.clientesNoEsperan=0;
            }
            double clientesEntraron=0;
            int tmAnterior=0;
            double clientesPromedioSistema=0;
            double clientesPromedioCola=0;
            int tmCola=0;
            Inicio.promUso= new double[Inicio.nServs];
            for (int i = 0; i < Inicio.nServs; i++) {
                Inicio.promUso[i]=0;
            }
            double []usosServ = new double[Inicio.nServs];
            double []tiempoSer= new double[Inicio.nServs];
            double []tiempoSer2= new double[Inicio.nServs];
            double []tiempoNormal= new double[Inicio.nServs];
            double []tiempoEx= new double[Inicio.nServs];
            for (int i = 0; i < Inicio.nServs; i++) {
                usosServ[i]=0;
                tiempoSer[i]=0;
                tiempoSer2[i]=0;
                tiempoNormal[i]=0;
                tiempoEx[i]=0;
            }
            List<ClientesTiempos> listaClientes= new ArrayList<ClientesTiempos>();
            double []tiemposServidores= new double[Inicio.nServs];
            double clientescola=0;
            Inicio.clientesNoEsperan=0;
            listaClientes.add(new ClientesTiempos(0,0));
            listaClientes.get(0).setServicio(0);
            listaClientes.get(0).setSalida(0);
            int tMAnos=0;
            double tiempoExtra=0;
            while (tMAnos<Inicio.tiempo) {    
                int tmMin=0;
                tmMin=tM;
                aT=tM;
                while (true) {
                    Boolean cambioTabla=false;
                    System.out.println("Tiempo: "+tM);
                    //Verificar cual es el menor entre el tiempo de llegada y los tiempos de salida de los servidores
                    //Caso 1 AT es igual a TM y menor a los DT
                    if((aT==tM)){
                        cambioTabla=true;
                        clientesEntraron++;
                        clientesPromedioSistema=clientesPromedioSistema+(rPrin.getcSistema()*(tM-tmAnterior));
                        tmAnterior=tM;
                        tipo='l';
                        nEvento=nEvento+1;
                        ultimoC=ultimoC+1;
                        rPrin.setTipo(tipo);
                        rPrin.setNum(nEvento);
                        rPrin.setCliente(ultimoC);
                        rPrin.setcSistema(rPrin.getcSistema()+1);
                        listaClientes.add(new ClientesTiempos(ultimoC,tM));
                        boolean bandera=false;
                        for (int i = 0; i < servidores.length; i++) {
                            if (servidores[i].vacio()) {
                                Inicio.clientesNoEsperan=Inicio.clientesNoEsperan+1;
                                listaClientes.get(ultimoC).setServicio(tM);
                                tiempoSer[i]=tM;
                                bandera=true;
                                Integer lec=new Random().nextInt(99)+ 0;
                                Integer numTs=tM + Inicio.servicios.num(lec);
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
                            clientescola++;
                            clientesPromedioCola=clientesPromedioCola+(rPrin.getwL()*(tM-tmCola));
                            tmCola=tM;
                            rPrin.setwL(rPrin.getwL()+1);
                            rPrin.settServicio(-1);
                            rPrin.setnAleatorioTS(-1);
                        }
                        Integer lec2=new Random().nextInt(99)+ 0;
                        Integer numTEL =Inicio.llegadas.num(lec2);
                        rPrin.setnAleatorioTELL(lec2);
                        rPrin.setTiempoTELL(numTEL);
                        aT=numTEL + tM;
                        rPrin.setaT(aT);
                    }else{
                        if(tM==menor(Inicio.nServs, servidores)){
                            cambioTabla=true;
                            clientesPromedioSistema=clientesPromedioSistema+(rPrin.getcSistema()*(tM-tmAnterior));
                            tmAnterior=tM;
                            tipo='s';
                            nEvento=nEvento+1;
                            rPrin.setTipo(tipo);
                            rPrin.setNum(nEvento);
                            Integer saliendo=servidormenor(Inicio.nServs, servidores);
                            rPrin.setCliente(servidores[saliendo].getClient());
                            listaClientes.get(rPrin.getCliente()).setSalida(tM);
                            servidores[saliendo].sacarCliente();
                            rPrin.updateSS(saliendo, 0);
                            rPrin.updateDT(saliendo, 999999999);
                            rPrin.setnAleatorioTS(-1);
                            rPrin.settServicio(-1);
                            rPrin.setnAleatorioTELL(-1);
                            rPrin.setTiempoTELL(-1);
                            rPrin.setcSistema(rPrin.getcSistema()-1);
                            if (cola.isEmpty()) {
                                usosServ[saliendo]=usosServ[saliendo]+tM-tiempoSer[saliendo];
                                if (tM-tmMin<Inicio.min) {
                                    tiempoNormal[saliendo]=tiempoNormal[saliendo]+tM-tiempoSer[saliendo];
                                }else{
                                    if (tM-tmMin==Inicio.min) {
                                        tiempoNormal[saliendo]=tiempoNormal[saliendo]+tM-tiempoSer[saliendo];
                                    }else{
                                        tiempoEx[saliendo]=tiempoEx[saliendo]+tM-tiempoSer2[saliendo];
                                    }
                                }
                            }
                            if(!cola.isEmpty()){
                                clientesPromedioCola=clientesPromedioCola+(rPrin.getwL()*(tM-tmCola));
                                tmCola=tM;
                                Integer prueba=new Random().nextInt(99)+ 0;
                                rPrin.setnAleatorioTS(prueba);
                                Integer numTs=Inicio.servicios.num(prueba);
                                Integer newDT=tM+numTs;
                                servidores[saliendo].llegaCliente(cola.get(0),newDT );
                                rPrin.setnAleatorioTS(prueba);
                                rPrin.settServicio(numTs);
                                rPrin.updateDT(saliendo, newDT);
                                rPrin.updateSS(saliendo, cola.get(0));
                                listaClientes.get(cola.get(0)).setServicio(tM);
                                rPrin.setwL(rPrin.getwL()-1);
                                cola.remove(0);
                            }
                        }
                    }
                    if(cambioTabla){
                        
                        rPrin.tM=tM;
                        Inicio.renglones.add(new Renglon(rPrin));
                        
                    }
                    if (aT-tmMin>Inicio.min) {
                        aT=999999999;
                        rPrin.setaT(aT);
                    }
                    if (tM-tmMin==Inicio.min) {
                        rPrin.setaT(aT);
                        for (int i = 0; i < Inicio.nServs; i++) {
                            tiempoSer2[i]=tM;
                        }
                    }
                    if ((aT-tmMin>Inicio.min)&&(menor(Inicio.nServs, servidores)==999999999)) {
                        tiempoExtra=tiempoExtra+tM-Inicio.min-tmMin;
                        break;
                    }
                    if((aT!=tM)&&(tM!=menor(Inicio.nServs, servidores))){
                        if (aT<menor(Inicio.nServs, servidores)) {
                            tM=aT;
                        }else{
                            tM=menor(Inicio.nServs, servidores);
                        }
                    }


            
                } 
                    
                
                
                tMAnos++;
            }
            double tiempoSim=tM;
           
            Inicio.clientesPromSistema=clientesPromedioSistema/tiempoSim;
            Inicio.clientesPromCola=clientesPromedioCola/tiempoSim;
            
            Inicio.tiempoPromClientesSistema=0;
            Inicio.tiempPromClieCola=0;
            for (ClientesTiempos lista : listaClientes) {
                if (lista.getSalida()!=0) {
                    Inicio.tiempoPromClientesSistema=Inicio.tiempoPromClientesSistema+lista.getSalida()-lista.getLlegada();
                    Inicio.tiempPromClieCola=Inicio.tiempPromClieCola+lista.getServicio()-lista.getLlegada();
                }
            }
            Inicio.tiempoPromClientesSistema=Inicio.tiempoPromClientesSistema/clientesEntraron;
            Inicio.tiempoclientecola=Inicio.tiempPromClieCola/clientescola;
            Inicio.tiempPromClieCola=Inicio.tiempPromClieCola/clientesEntraron;
            double ex=Inicio.tiempo;
            Inicio.tiempoextra=tiempoExtra/ex;
            Inicio.usoServ=0;
            for (int i = 0; i < Inicio.nServs; i++) {
                Inicio.promUso[i]=usosServ[i]/tiempoSim;
                Inicio.usoServ=Inicio.usoServ+Inicio.promUso[i];
            }
            double serv=Inicio.nServs;
            Inicio.usoServ=Inicio.usoServ/serv;
            Inicio.costoClienteCola=(Inicio.tiempPromClieCola/Inicio.tiempoPromClientesSistema)*Inicio.costoEC;
            Inicio.costoCliente=(Inicio.tiempoPromClientesSistema-Inicio.tiempPromClieCola)*Inicio.costoTSC/Inicio.tiempoPromClientesSistema;
            Inicio.costoServidoresOcu=0;
            Inicio.costoServidoresExtra=0;
            Inicio.costoServidoresDeso=0;
            for (int i = 0; i < Inicio.nServs; i++) {
                Inicio.costoServidoresOcu=Inicio.costoServidoresOcu+tiempoNormal[i];
                Inicio.costoServidoresExtra=Inicio.costoServidoresExtra+tiempoEx[i];
                Inicio.costoServidoresDeso=Inicio.costoServidoresDeso+tM-tiempoNormal[i]-tiempoEx[i];
            }
            Inicio.costoServidoresOcu=Inicio.costoServidoresOcu*Inicio.costoSerO/tiempoSim;
            Inicio.costoServidoresExtra=Inicio.costoServidoresExtra*Inicio.costoServTE/tiempoSim;
            Inicio.costoServidoresDeso=Inicio.costoServD*Inicio.costoServidoresDeso/tiempoSim;
            } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en lectura");
        }
    }
}
