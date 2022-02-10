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
public class ClientesTiempos {
    public int id;
    public int llegada;
    public int servicio;
    public int salida;

    public ClientesTiempos(int id, int llegada) {
        this.id = id;
        this.llegada = llegada;
        servicio=0;
        salida=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLlegada() {
        return llegada;
    }

    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }
    
    
    
}
