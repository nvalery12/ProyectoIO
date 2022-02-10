/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noel Roberto
 */
public class Reporte extends javax.swing.JPanel {

    /**
     * Creates new form Reporte
     */
    public Reporte() {
        initComponents();
        llenar();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPorcentaje = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 255, 255));
        setMinimumSize(new java.awt.Dimension(980, 589));

        jLabel1.setText("Cantidad de clientes que no esperan:");

        jTextField1.setEditable(false);

        jLabel2.setText("Cantidad de clientes que se van sin ser atendidos:");

        jTextField2.setEditable(false);

        jLabel3.setText("Probabilidad de esperar:");

        jTextField3.setEditable(false);

        jLabel4.setText("Cantidad promedio de clientes en cola: ");

        jTextField4.setEditable(false);

        jLabel5.setText("Cantidad promedio de clientes en sistema: ");

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tiempo promedio de un cliente en cola:");

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Tiempo promedio de un cliente en sistema:");

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        jLabel8.setText("Tiempo promedio de espera del cliente que hace cola:");

        jTextField9.setEditable(false);

        jLabel9.setText("Tiempo promedio adicional que se trabaja despues de cerrar:");

        jLabel10.setText("Porcentaje de utilizacion de cada servidor y general:");

        tablaPorcentaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servidor", "Utilizacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPorcentaje);
        if (tablaPorcentaje.getColumnModel().getColumnCount() > 0) {
            tablaPorcentaje.getColumnModel().getColumn(0).setResizable(false);
            tablaPorcentaje.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel11.setText("Costo Servicios:");

        jTextField10.setEditable(false);

        jLabel12.setText("Costo Espera/Demora Cliente:");

        jTextField11.setEditable(false);

        jLabel13.setText("Costo del Sistema:");

        jTextField12.setEditable(false);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("NombreArchivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField11))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField10)))
                                        .addGap(217, 217, 217))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 222, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VisualizarSimulacion p4 = new VisualizarSimulacion();
               p4.setSize(980, 589);
                p4.setLocation(0, 0);
                removeAll();
                add(p4,BorderLayout.CENTER);
                revalidate();
                repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tablaPorcentaje;
    // End of variables declaration//GEN-END:variables
    public Integer cantidadClientesNoEsperan(){
        //Listo
        Integer clientes=0;
        for (Renglon e : Inicio.renglones) {
            for (int i = 0; i < e.getsS().length; i++) {
                if ((e.getCliente()==e.getSSPosi(i))&&(e.getCliente()!=0)) {
                    clientes++;
                }
            }
        }
        return clientes;
    }
    
    public Integer clientesSinSerAtendidos(){
        return Inicio.renglones.get(Inicio.renglones.size()-1).getwL();
    }
    public float probEsperar(){
        //Listo
        float clientes=0;
        float clientWL=0;
        int tmA=0;
        int wL=0;
        char l='n';
        boolean bandera=false;
        for (Renglon renglone : Inicio.renglones) {
            if(renglone.getTipo()=='l'){
                clientes++;
            }
            if ((renglone.getNum()!=0)&&(renglone.getNum()!=1)) {
                
                for (int i = 0; i < renglone.getsS().length; i++) {
                    if(renglone.getCliente()==renglone.getSSPosi(i)){
                        bandera=true;
                        break;
                    }
                }
                if(!bandera&&(renglone.getTipo()=='l')){
                    clientWL++;
                }
                if((l=='l')&&(renglone.gettM()==tmA)&&(renglone.getwL()==0)&&(wL==1)){
                    clientWL--;
                }
            }
            tmA=renglone.gettM();
            wL=renglone.getwL();
            l=renglone.getTipo();
            bandera=false;
        }
        return clientWL/clientes;
    }
    
    public float clientesPromedioSistema(){
        int maximo=0;
        for (Renglon renglone : Inicio.renglones) {
            if(maximo<renglone.getcSistema()){
                maximo=renglone.getcSistema();
            }
        }
        float acumulador1=0;
        for (int i = maximo; i > 0; i--) {
            float acumulador2=0;
            int tiempoCuandoSeLlegoALaCantidad=0;
            boolean bandera=false;
            for (Renglon renglone : Inicio.renglones) {
                if((!bandera)&&(renglone.getcSistema()==i)){
                    tiempoCuandoSeLlegoALaCantidad=renglone.gettM();
                    bandera=true;
                }
                if((bandera)&&(renglone.getcSistema()!=i)){
                    acumulador2=acumulador2+renglone.gettM()-tiempoCuandoSeLlegoALaCantidad;
                    bandera=false;
                }
            }
            acumulador1=acumulador1+(i*acumulador2);
        }
        int tiempo=Inicio.renglones.get(Inicio.renglones.size()-1).gettM();
        return acumulador1/tiempo;
    }
    public float clientesPromedioCola(){
        //Listo
        int maximo=0;
        for (Renglon renglone : Inicio.renglones) {
            if(maximo<renglone.getwL()){
                maximo=renglone.getwL();
            }
        }
        float acumulador1=0;
        for (int i = maximo; i > 0; i--) {
            float acumulador2=0;
            int tiempoCuandoSeLlegoALaCantidad=0;
            boolean bandera=false;
            for (Renglon renglone : Inicio.renglones) {
                if((!bandera)&&(renglone.getwL()==i)){
                    tiempoCuandoSeLlegoALaCantidad=renglone.gettM();
                    bandera=true;
                }
                if((bandera)&&(renglone.getwL()!=i)){
                    acumulador2=acumulador2+renglone.gettM()-tiempoCuandoSeLlegoALaCantidad;
                    bandera=false;
                }
            }
            acumulador1=acumulador1+(i*acumulador2);
        }
        int tiempo=Inicio.renglones.get(Inicio.renglones.size()-1).gettM();
        return acumulador1/tiempo;
    }
    
    public float []promedioUsoServidor(){
        //Listo
        float []promedios=new float[Inicio.nServs];
        float []tiempo_uso_sev= new float[Inicio.nServs];
        for (int i = 0; i < Inicio.nServs; i++) {
            tiempo_uso_sev[i]=0;
            promedios[i]=0;
        }
        
        for (int i = 0; i < Inicio.nServs; i++) {
            int momentoInicial=0;
            boolean bandera=false;
            for (Renglon renglone : Inicio.renglones) {
                if ((renglone.getSSPosi(i)==0)&&(bandera)) {
                    tiempo_uso_sev[i]=tiempo_uso_sev[i]+renglone.gettM()-momentoInicial;
                    momentoInicial=0;
                    bandera=false;
                } 
                if((renglone.getSSPosi(i)!=0)&&(!bandera)){
                    momentoInicial=renglone.gettM();
                    bandera=true;
                }
            }
            if (bandera) {
                tiempo_uso_sev[i]=tiempo_uso_sev[i]+Inicio.tiempo-momentoInicial;
            }
            float tiempo=Inicio.tiempo;
            promedios[i]=tiempo_uso_sev[i]/tiempo;
        }
        return promedios;
    }
    public float promedioUsoSistema(){
        //Listo
        float []promedios=new float[Inicio.nServs];
        float []tiempo_uso_sev= new float[Inicio.nServs];
        for (int i = 0; i < Inicio.nServs; i++) {
            tiempo_uso_sev[i]=0;
            promedios[i]=0;
        }
        
        for (int i = 0; i < Inicio.nServs; i++) {
            int momentoInicial=0;
            boolean bandera=false;
            for (Renglon renglone : Inicio.renglones) {
                if ((renglone.getSSPosi(i)==0)&&(bandera)) {
                    tiempo_uso_sev[i]=tiempo_uso_sev[i]+renglone.gettM()-momentoInicial;
                    momentoInicial=0;
                    bandera=false;
                } 
                if((renglone.getSSPosi(i)!=0)&&(!bandera)){
                    momentoInicial=renglone.gettM();
                    bandera=true;
                }
            }
            if (bandera) {
                tiempo_uso_sev[i]=tiempo_uso_sev[i]+Inicio.tiempo-momentoInicial;
            }
            float tiempo=Inicio.tiempo;
            promedios[i]=tiempo_uso_sev[i]/tiempo;
        }
        float prom=0;
        for (int i = 0; i < Inicio.nServs; i++) {
            prom=prom+promedios[i];
        }
        float cantidad=Inicio.nServs;
        return prom / cantidad;
        
    }
    public float tiempoPromedioDespuesCerrar(){
        //Listo
        List<Integer>quedan= new ArrayList<Integer>();
        for (int i = 0; i < Inicio.nServs; i++) {
            if (Inicio.renglones.get(Inicio.renglones.size()-1).getSSPosi(i)!=0) {
                quedan.add(Inicio.renglones.get(Inicio.renglones.size()-1).getDTPosi(i)-Inicio.tiempo);
            }
        }
        float acumulador=0;
        for (Integer inte : quedan) {
            acumulador=acumulador + inte;
        }
        float servidores=Inicio.nServs;
        return acumulador/servidores;
        
    }
    
    public float tiempoPromedioClienteSistema(){
        //Listo
        int ultimoCliente=0;
        float max;
        for (Renglon renglone : Inicio.renglones) {
            if (renglone.getCliente()>ultimoCliente) {
                ultimoCliente=renglone.getCliente();
            }
        }
        float acumulador=0;
        max=ultimoCliente;
        for (int i = ultimoCliente; i > 0; i--) {
            float llegada=0;
            for (Renglon e : Inicio.renglones) {
                
                if ((e.getCliente()==i)&&(e.getTipo()=='l')) {
                    llegada=e.gettM();
                }
                if ((e.getCliente()==i)&&(e.getTipo()=='s')) {
                    acumulador=acumulador+e.gettM()-llegada;
                }
            }
        }
        return acumulador/max;
    }
    
    public float tiempoPromedioClientesCola(){
        //Listo
        int ultimoCliente=0;
        float max;
        for (Renglon renglone : Inicio.renglones) {
            if (renglone.getCliente()>ultimoCliente) {
                ultimoCliente=renglone.getCliente();
            }
        }
        float acumulador=0;
        max=ultimoCliente;
        for (int i = ultimoCliente; i > 0; i--) {
            float llegada=0;
            boolean bandera=false;
            for (Renglon e : Inicio.renglones) {
                
                if ((e.getCliente()==i)&&(e.getTipo()=='l')) {
                    llegada=e.gettM();
                }
                for (int j = 0; j < Inicio.nServs; j++) {
                    if ((!bandera)&&(e.getSSPosi(j)==i)) {
                        bandera=true;
                        acumulador=acumulador+e.gettM()-llegada;
                    }
                }
            }
        }
        return acumulador/max;
    }
    
    public float costoSistema(){
        //Listo
        float acumulador=0;
        int mayor=0;
        for (int i = 0; i < Inicio.nServs; i++) {
            if (Inicio.renglones.get(Inicio.renglones.size()-1).getSSPosi(i)!=0) {
                if (Inicio.renglones.get(Inicio.renglones.size()-1).getDTPosi(i)>mayor) {
                    mayor=Inicio.renglones.get(Inicio.renglones.size()-1).getDTPosi(i);
                }
            }
        }
        if (mayor>0) {
            mayor=mayor-Inicio.tiempo;
        }
        
        acumulador=acumulador+(Inicio.tiempo*Inicio.costoSistemaN);
        
        acumulador=acumulador+(Inicio.costoSistemaTE*mayor);
        
        return acumulador;
    }
    
    public float costoCliente(){
        //Listo
        int ultimoCliente=0;
        for (Renglon renglone : Inicio.renglones) {
            if ((renglone.getTipo()=='l')&&(ultimoCliente<renglone.getCliente())) {
                ultimoCliente=renglone.getCliente();
            }
        }
        float acumulador=0;
        for (int i = ultimoCliente; i > 0; i--) {
            int llegada=0;
            boolean bandera=false;
            for (Renglon renglone : Inicio.renglones) {
                
                
                if ((renglone.getCliente()==i)&&(renglone.getTipo()=='l')) {
                    llegada=renglone.gettM();
                }
                for (int j = 0; j < Inicio.nServs; j++) {
                    if ((renglone.getSSPosi(j)==i)&&(!bandera)) {
                        acumulador=acumulador+((renglone.gettM()-llegada)*Inicio.costoEC);
                        acumulador=acumulador+((renglone.getDTPosi(j)-renglone.gettM())*Inicio.costoTSC);
                        bandera=true;
                    }
                }
                
            }
        }
        return acumulador;
    }
    
    public float costoServidor(){
        //Listo
        float suma[]=new float[Inicio.nServs];
        for (int i = 0; i < Inicio.nServs; i++) {
            suma[i]=0;
        }
        float ocupado=0;
        for (int i = 0; i < Inicio.nServs; i++) {
            boolean bandera=false;
            int llegada=0;
            for (Renglon renglone : Inicio.renglones) {
                if ((renglone.getSSPosi(i)==0)&&(!bandera)) {
                    llegada=renglone.gettM();
                    bandera=true;
                }
                if ((renglone.getSSPosi(i)!=0)&&(bandera)) {
                    suma[i]=suma[i]+renglone.gettM()-llegada;
                    bandera=false;
                }
            }
            ocupado=ocupado + Inicio.tiempo-suma[i];
        }
        float desocupado=0;
        for (int i = 0; i < Inicio.nServs; i++) {
            desocupado=desocupado+suma[i];
        }
        float extra=0;
        for (int i = 0; i < Inicio.nServs; i++) {
            if (Inicio.renglones.get(Inicio.renglones.size()-1).getDTPosi(i)!=0) {
                extra=extra+Inicio.renglones.get(Inicio.renglones.size()-1).getDTPosi(i)-Inicio.tiempo;
            }
        }
        desocupado=desocupado*Inicio.costoServD;
        ocupado=ocupado*Inicio.costoSerO;
        extra=extra*Inicio.costoServTE;
        return desocupado+ocupado+extra;
    }
    
    public void llenar(){
        jTextField1.setText(String.valueOf(Inicio.clientesNoEsperan));
        jTextField2.setText(String.valueOf(Inicio.clientesNoatendidos));
        jTextField3.setText(String.format("%.2f",Inicio.probabilidadEsperar));
        jTextField4.setText(String.format("%.2f",Inicio.clientesPromCola));
        jTextField5.setText(String.format("%.2f",Inicio.clientesPromSistema));
        jTextField6.setText(String.format("%.2f",Inicio.tiempPromClieCola));
        jTextField7.setText(String.format("%.2f",Inicio.tiempoPromClientesSistema));
        jTextField8.setText(String.format("%.2f",Inicio.prometioclientescola));
        DefaultTableModel table =(DefaultTableModel)this.tablaPorcentaje.getModel();
        table.addRow(new Object[]{
            "Sistema",String.format("%.2f",Inicio.usoServ)
        });
        float usos[]=promedioUsoServidor();
        for (int i = 0; i < Inicio.nServs; i++) {
            int id=i+1;
            table.addRow(new Object[]{
                id,String.format("%.2f",Inicio.promUso[i])
            });
        }
        jTextField9.setText(String.format("%.2f",Inicio.tiempoextra));
        jTextField10.setText(String.format("%.2f",(Inicio.costoServidoresDeso+Inicio.costoServidoresOcu+Inicio.costoServidoresExtra)));
        jTextField11.setText(String.format("%.2f",(Inicio.costoCliente+Inicio.costoClienteCola)));
        jTextField12.setText(String.format("%.2f",Inicio.costoServidoresDeso+Inicio.costoServidoresOcu+Inicio.costoServidoresExtra+Inicio.costoCliente+Inicio.costoClienteCola));
    }
    public void guardar(){
        String directorio = System.getProperty("user.dir");
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(directorio+"/"+jTextField13.getText()+".txt");
            pw = new PrintWriter(fichero);

            pw.println(jLabel1.getText()+" "+jTextField1.getText());
            pw.println(jLabel2.getText()+" "+jTextField2.getText());
            pw.println(jLabel3.getText()+" "+jTextField3.getText());
            pw.println(jLabel4.getText()+" "+jTextField4.getText());
            pw.println(jLabel5.getText()+" "+jTextField5.getText());
            pw.println(jLabel6.getText()+" "+jTextField6.getText());
            pw.println(jLabel7.getText()+" "+jTextField7.getText());
            pw.println(jLabel8.getText()+" "+jTextField8.getText());
            pw.println(jLabel9.getText()+" "+jTextField9.getText());
            pw.println("Porcentaje de utilizacion del sistema: "+promedioUsoSistema());
            float prom[]=promedioUsoServidor();
            for (int i = 0; i < Inicio.nServs; i++) {
                pw.println("Porcentaje de utilizacion del servidor "+(i+1)+": "+prom[i]);
            }
            pw.println(jLabel11.getText()+" "+jTextField10.getText());
            pw.println(jLabel12.getText()+" "+jTextField11.getText());
            pw.println(jLabel13.getText()+" "+jTextField12.getText());
            
            JOptionPane.showMessageDialog(null, "Su archivo fue guardado en: "+directorio);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
        int select=JOptionPane.showConfirmDialog(null, "¿Desea volver al menu principal?", null, JOptionPane.YES_NO_OPTION);
        if (select==JOptionPane.YES_OPTION) {
            DecisionArchivo pantalla = new DecisionArchivo();
               pantalla.setSize(980, 589);
                pantalla.setLocation(0, 0);
                removeAll();
                add(pantalla,BorderLayout.CENTER);
                revalidate();
                repaint();
        }
        
    }
}
