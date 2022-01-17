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
public class Renglon {
    Integer num;
    char tipo;
    Integer cliente;
    Integer tM;
    Integer []sS;
    Integer wL;
    Integer cSistema;
    Integer aT;
    Integer []dT;
    Integer nAleatorioTELL;
    Integer tiempoTELL;
    Integer nAleatorioTS;
    Integer tServicio;

    public Renglon(Integer cantidad) {
        dT=new Integer[cantidad];
        sS= new Integer[cantidad];
        
    }

    public Renglon(Renglon sub) {
        this.num=sub.num;
        tipo=sub.tipo;
        cliente=sub.cliente;
        tM=sub.tM;
        wL=sub.wL;
        cSistema=sub.cSistema;
        aT=sub.aT;
        dT= new Integer[sub.dT.length];
        for (int i = 0; i < sub.dT.length; i++) {
            dT[i]=sub.dT[i];
        }
        sS= new Integer[sub.sS.length];
        for (int i = 0; i < sub.sS.length; i++) {
            sS[i]=sub.sS[i];
        }
        nAleatorioTELL=sub.nAleatorioTELL;
        tiempoTELL=sub.tiempoTELL;
        nAleatorioTS=sub.nAleatorioTS;
        tServicio=sub.tServicio;
        
    }
    

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer gettM() {
        return tM;
    }

    public void settM(Integer tM) {
        this.tM = tM;
    }

    public Integer[] getsS() {
        return sS;
    }

    public void setsS(Integer[] sS) {
        this.sS = sS;
    }

    public Integer getwL() {
        return wL;
    }

    public void setwL(Integer wL) {
        this.wL = wL;
    }

    public Integer getcSistema() {
        return cSistema;
    }

    public void setcSistema(Integer cSistema) {
        this.cSistema = cSistema;
    }

    public Integer getaT() {
        return aT;
    }

    public void setaT(Integer aT) {
        this.aT = aT;
    }

    public Integer[] getdT() {
        return dT;
    }

    public void setdT(Integer[] dT) {
        this.dT = dT;
    }

    public Integer getnAleatorioTELL() {
        return nAleatorioTELL;
    }

    public void setnAleatorioTELL(Integer nAleatorioTELL) {
        this.nAleatorioTELL = nAleatorioTELL;
    }

    public Integer getTiempoTELL() {
        return tiempoTELL;
    }

    public void setTiempoTELL(Integer tiempoTELL) {
        this.tiempoTELL = tiempoTELL;
    }

    public Integer getnAleatorioTS() {
        return nAleatorioTS;
    }

    public void setnAleatorioTS(Integer nAleatorioTS) {
        this.nAleatorioTS = nAleatorioTS;
    }

    public Integer gettServicio() {
        return tServicio;
    }

    public void settServicio(Integer tServicio) {
        this.tServicio = tServicio;
    }
    
    public void updateSS(Integer posicion,Integer valor){
        this.sS[posicion]=valor;
    }
    
    public void updateDT(Integer posicion,Integer valor){
        this.dT[posicion]=valor;
    }
    
    public void print(){
        String imprim="N°: "+num+" Tipo: "+tipo+" Cliente: "+cliente+" TM: "+tM+" ";
        for (int i = 0; i < sS.length; i++) {
            imprim=imprim+"SS"+(i+1)+": "+sS[i]+" ";
        }
        imprim=imprim+"WL: "+wL+" CS: "+cSistema+" AT: "+aT+" ";
        for (int i = 0; i < dT.length; i++) {
            imprim=imprim+"DT"+(i+1)+": "+dT[i]+" ";
        }
        imprim=imprim+"NATELL: "+nAleatorioTELL+" TELL: "+tiempoTELL+" NATS: "+nAleatorioTS+" TS: "+tServicio+".";
        System.out.println(imprim);
    }
    
}
