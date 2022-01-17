/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author Noel Roberto
 */
public class VisualizarSimulacion extends javax.swing.JPanel {
    JTable tabla;
    String []colums;
    String[][]filas;

    /**
     * Creates new form VisualizarSimulacion
     */
    public VisualizarSimulacion() {
        cargarColumnas();
        cargarFilas();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setMinimumSize(new java.awt.Dimension(980, 589));

        table.setModel(new javax.swing.table.DefaultTableModel(
            filas,
            colums
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("Simular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    public void cargarColumnas(){
       List<String> lista = new ArrayList<String>();
       lista.add("NEvento");
       lista.add("Tipo");
       lista.add("N Cliente");
       lista.add("TM");
        for (int i = 0; i < Simulacion.nServidores; i++) {
            lista.add("SS"+(i+1));
        }
        lista.add("WL");
        lista.add("Cl Sistema");
        lista.add("AT");
        for (int i = 0; i < Simulacion.nServidores; i++) {
            lista.add("DT"+(i+1));
        }
        lista.add("N. Aletorio Tell");
        lista.add("TELL");
        lista.add("N. Aleatorio TS");
        lista.add("TS");
        int tamaño=11+(Simulacion.nServidores*2);
        colums= new String[tamaño];
        int i=0;
        for(String e:lista){
            colums[i]=e;
            i++;
        }
    }
    public void cargarFilas(){
        int tamaño1=11+(Simulacion.nServidores*2);
        filas=new String[Simulacion.tabla.size()][tamaño1];
        int j=0;
        for (Renglon renglon : Simulacion.tabla) {
            int i=0;
            filas[j][i]=renglon.getNum().toString();
            i++;
            filas[j][i]=Character.toString(renglon.getTipo());
            i++;
            filas[j][i]=renglon.getCliente().toString();
            i++;
            filas[j][i]=renglon.gettM().toString();
            for (int k = 0; k < Simulacion.nServidores; k++) {
                i++;
                filas[j][i]=renglon.getSSPosi(k).toString();
            }
            i++;
            filas[j][i]=renglon.getwL().toString();
            i++;
            filas[j][i]=renglon.getcSistema().toString();
            i++;
            filas[j][i]=renglon.getaT().toString();
            for (int k = 0; k < Simulacion.nServidores; k++) {
                i++;
                filas[j][i]=renglon.getDTPosi(k).toString();
            }
            i++;
            filas[j][i]=renglon.getnAleatorioTELL().toString();
            i++;
            filas[j][i]=renglon.getTiempoTELL().toString();
            i++;
            filas[j][i]=renglon.getnAleatorioTS().toString();
            i++;
            filas[j][i]=renglon.gettServicio().toString();
            j++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}