package Tema13_Interfaces;

import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Ejemplo01 extends javax.swing.JPanel {

         public Ejemplo01() {
                  initComponents();
         }

         @SuppressWarnings("unchecked")
         // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
         private void initComponents() {

                  bt_Musica = new javax.swing.JButton();
                  bt_Deportes = new javax.swing.JButton();
                  bt_Reset = new javax.swing.JButton();
                  Label_Aficiones = new javax.swing.JLabel();
                  tf_Resultado = new javax.swing.JTextField();

                  setBackground(new java.awt.Color(204, 204, 255));
                  setForeground(new java.awt.Color(204, 255, 204));

                  bt_Musica.setBackground(new java.awt.Color(51, 153, 255));
                  bt_Musica.setForeground(new java.awt.Color(255, 255, 255));
                  bt_Musica.setText("MUSICA");
                  bt_Musica.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    bt_MusicaMouseClicked(evt);
                           }
                  });
                  bt_Musica.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bt_MusicaActionPerformed(evt);
                           }
                  });

                  bt_Deportes.setBackground(new java.awt.Color(51, 153, 255));
                  bt_Deportes.setForeground(new java.awt.Color(255, 255, 255));
                  bt_Deportes.setText("DEPORTES");
                  bt_Deportes.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    bt_DeportesMouseClicked(evt);
                           }
                           public void mousePressed(java.awt.event.MouseEvent evt) {
                                    bt_DeportesMousePressed(evt);
                           }
                  });
                  bt_Deportes.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bt_DeportesActionPerformed(evt);
                           }
                  });

                  bt_Reset.setBackground(new java.awt.Color(255, 153, 51));
                  bt_Reset.setForeground(new java.awt.Color(51, 51, 51));
                  bt_Reset.setText("RESET");
                  bt_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mouseEntered(java.awt.event.MouseEvent evt) {
                                    bt_ResetMouseEntered(evt);
                           }
                  });
                  bt_Reset.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bt_ResetActionPerformed(evt);
                           }
                  });

                  Label_Aficiones.setBackground(new java.awt.Color(153, 255, 153));
                  Label_Aficiones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                  Label_Aficiones.setText("AFICIONES");

                  tf_Resultado.setBackground(new java.awt.Color(204, 255, 204));
                  tf_Resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                  tf_Resultado.setText("¿Cuál es tu afición?");
                  tf_Resultado.setEnabled(false);
                  tf_Resultado.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    tf_ResultadoActionPerformed(evt);
                           }
                  });

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                  this.setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addContainerGap(95, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                      .addComponent(bt_Musica, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addGap(85, 85, 85)
                                                      .addComponent(bt_Deportes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addGap(73, 73, 73))
                                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                      .addComponent(Label_Aficiones)
                                                      .addGap(183, 183, 183))
                                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                      .addComponent(bt_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addGap(186, 186, 186))))
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(154, 154, 154)
                                    .addComponent(tf_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(149, 149, 149)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(bt_Deportes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(bt_Musica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addComponent(Label_Aficiones)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(bt_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(63, Short.MAX_VALUE))
                  );
         }// </editor-fold>//GEN-END:initComponents

         // Para que el boton haga lo que quiera
         private void bt_MusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MusicaActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_bt_MusicaActionPerformed

         private void bt_DeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DeportesActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_bt_DeportesActionPerformed

         private void bt_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResetActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_bt_ResetActionPerformed

         private void tf_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ResultadoActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_tf_ResultadoActionPerformed

         
         // Lo que hace cuando hago click en el boton MUSICA
         private void bt_MusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_MusicaMouseClicked
                  // TODO add your handling code here:
                  // Cada vez que haga click sobre el boton MUSICA pondrá "MUSICA" en el resultado
                  this.tf_Resultado.setText("MUSICA");
         }//GEN-LAST:event_bt_MusicaMouseClicked

         private void bt_DeportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_DeportesMouseClicked
                  // TODO add your handling code here:
         }//GEN-LAST:event_bt_DeportesMouseClicked

         private void bt_DeportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_DeportesMousePressed
                  // TODO add your handling code here:
                  // Igual que con el boton Musica pero ahora es Pressed y no Clicked
                  this.tf_Resultado.setText("DEPORTES");
         }//GEN-LAST:event_bt_DeportesMousePressed

         // Para el boton RESET
         private void bt_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ResetMouseEntered
                  // TODO add your handling code here:
                  // Cuando pulse RESET se resetea el tf_Resultado y vuelve a poner lo de antes.
                  this.tf_Resultado.setText("¿Cuál es tu afición?");
         }//GEN-LAST:event_bt_ResetMouseEntered

         
          // Para que se ejecute el programa
         public static void main(String[] args) {
                  java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run(){
                           JFrame frame = new JFrame("Ejemplo01");
                           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           frame.add(new Ejemplo01());
                           frame.pack();
                           frame.setLocationRelativeTo(null); // Centrar la ventana
                           frame.setVisible(true);                  }
                  });
         }//Fin main
         
         
         // Como lo hizo el profe en clase no muestra el panel
         /*
         // Para que se ejecute el programa
         public static void main(String[] args) {
                  java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run(){
                           new Ejemplo01().setVisible(true);
                  }
                  });
         }//Fin main
         */

         // Variables declaration - do not modify//GEN-BEGIN:variables
         private javax.swing.JLabel Label_Aficiones;
         private javax.swing.JButton bt_Deportes;
         private javax.swing.JButton bt_Musica;
         private javax.swing.JButton bt_Reset;
         private javax.swing.JTextField tf_Resultado;
         // End of variables declaration//GEN-END:variables



}//Fin class
