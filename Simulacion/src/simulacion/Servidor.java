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
public class Servidor {
    Integer nServidor;
    Integer client;
    Integer dT;

    public Servidor(Integer nServidor) {
        this.nServidor = nServidor;
        client=0;
        dT=999999999;
    }

    public Integer getnServidor() {
        return nServidor;
    }

    public void setnServidor(Integer nServidor) {
        this.nServidor = nServidor;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Integer getdT() {
        return dT;
    }

    public void setdT(Integer dT) {
        this.dT = dT;
    }
    
   public boolean vacio(){
       if (client==0) {
           return true;
       }
       return false;
   } 
   
   public void sacarCliente(){
       client=0;
       dT=999999999;
   }
   
   public void llegaCliente(Integer cliente, Integer dT){
       client=cliente;
       this.dT=dT;
   }
   
}
