/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Noel Roberto
 */
public class Probabilidades {
    Integer []tiempos;
    float []probabilidades;
    Integer []acumulado;
    Integer []min;
    Integer []max;
    Integer cantidad;

    public Probabilidades(Integer cant) {
        tiempos = new Integer[cant];
        probabilidades = new float[cant];
        acumulado = new Integer[cant];
        min = new Integer[cant];
        max = new Integer[cant];
        cantidad=cant;
    }

    public Integer num(Integer random){
        int i=0;
        while(i<tiempos.length){
            if(random>=min[i] && random<=max[i]){
                return tiempos[i];
            }
            i++;
        }
        return 0;
    }
    
    public void setTiempo(Integer tiempo, float probabi,Integer posi){
        tiempos[posi]=tiempo;
        probabilidades[posi]=probabi;
    }
    
    public void completacion(){
        float acumulados=0;
        for (int i = 0; i < tiempos.length; i++) {
            acumulados =acumulados+  probabilidades[i]*100;
            acumulado[i]=Math.round(acumulados);
        }
        min[0]=0;
        max[0]=acumulado[0]-1;
        for (int i = 1; i < acumulado.length; i++) {
            min[i]=acumulado[i-1];
            max[i]=acumulado[i]-1;
        }
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
