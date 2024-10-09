package Tema13_Interfaces;

import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Ejemplo02 extends javax.swing.JPanel {

         public Ejemplo02() {
                  initComponents();
         }

         
         @SuppressWarnings("unchecked")
         // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
         private void initComponents() {

                  bt_Aceptar = new javax.swing.JButton();
                  bt_Cancelar = new javax.swing.JButton();
                  jScrollPane1 = new javax.swing.JScrollPane();
                  ta_Resultado = new javax.swing.JTextArea();

                  bt_Aceptar.setBackground(new java.awt.Color(204, 204, 255));
                  bt_Aceptar.setText("Aceptar");
                  bt_Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    bt_AceptarMouseClicked(evt);
                           }
                  });

                  bt_Cancelar.setBackground(new java.awt.Color(204, 204, 255));
                  bt_Cancelar.setText("Cancelar");
                  bt_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    bt_CancelarMouseClicked(evt);
                           }
                  });

                  ta_Resultado.setColumns(20);
                  ta_Resultado.setRows(5);
                  jScrollPane1.setViewportView(ta_Resultado);

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                  this.setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                             .addComponent(jScrollPane1)
                                             .addGroup(layout.createSequentialGroup()
                                                      .addComponent(bt_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addGap(232, 232, 232)
                                                      .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(49, Short.MAX_VALUE))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(bt_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(22, Short.MAX_VALUE))
                  );
         }// </editor-fold>//GEN-END:initComponents

         
         private void bt_AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AceptarMouseClicked
                  // TODO add your handling code here:
                  escribir("Click en el boton del raton", evt);
         }//GEN-LAST:event_bt_AceptarMouseClicked

         private void bt_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CancelarMouseClicked
                  // TODO add your handling code here:
                  escribir("Click en el boton del raton", evt);
         }//GEN-LAST:event_bt_CancelarMouseClicked

         void escribir(String eventDescripcion, MouseEvent e){
                  // Escriba en el área de texto la descripcion que se describe como parametro.
                  ta_Resultado.append(eventDescripcion+ ".\n");
                  
                  // Comprobar qué botón ha pulsado
                  if (e.getSource() == bt_Aceptar) {
                           ta_Resultado.append("Es el boton Aceptar.\n");
                  } else if (e.getSource() == bt_Cancelar) {
                           ta_Resultado.append("Es el boton Cancelar.\n");
                  }
         }//Fin escribir

         
         // Para que se ejecute el programa
         public static void main(String[] args) {
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    JFrame frame = new JFrame("Ejemplo02");
                                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    frame.add(new Ejemplo02());
                                    frame.pack();
                                    frame.setLocationRelativeTo(null); // Centrar la ventana
                                    frame.setVisible(true);
                           }
                  });
         }//Fin main
         
         // Variables declaration - do not modify//GEN-BEGIN:variables
         public javax.swing.JButton bt_Aceptar;
         public javax.swing.JButton bt_Cancelar;
         private javax.swing.JScrollPane jScrollPane1;
         private javax.swing.JTextArea ta_Resultado;
         // End of variables declaration//GEN-END:variables

}//Fin class
