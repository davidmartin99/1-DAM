package practica_Interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class InterfazMenu_1 extends javax.swing.JFrame {

         private JTextArea textArea;
         private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         
         public InterfazMenu_1() {
                  initComponents();
                  textArea = taResultados; // Asigna el JTextArea adecuado aquí

                  // Asegúrate de que el textArea esté habilitado y editable
                  textArea.setEditable(true);
                  textArea.setEnabled(true);

         }

         private void agregarEmpleado() {
                  JTextField nombreField = new JTextField();
                  JTextField apellidoField = new JTextField();
                  JTextField fechaNacimientoField = new JTextField();
                  JTextField fechaIngresoField = new JTextField();
                  JTextField puestoField = new JTextField();
                  JTextField salarioField = new JTextField();

                  Object[] message = {
                           "Nombre:", nombreField,
                           "Apellido:", apellidoField,
                           "Fecha de Nacimiento (dd-mm-aaaa):", fechaNacimientoField,
                           "Fecha de Ingreso (dd-mm-aaaa):", fechaIngresoField,
                           "Puesto:", puestoField,
                           "Salario:", salarioField,};

                  int option = JOptionPane.showConfirmDialog(null, message, "Añadir empleado", JOptionPane.OK_CANCEL_OPTION);
                  if (option == JOptionPane.OK_OPTION) {
                           try {
                                    String nombre = nombreField.getText();
                                    String apellido = apellidoField.getText();
                                    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoField.getText(), formatter);
                                    LocalDate fechaIngreso = LocalDate.parse(fechaIngresoField.getText(), formatter);
                                    String puesto = puestoField.getText();
                                    double salario = Double.parseDouble(salarioField.getText());

                                    FuncionesEmpleados.agregarEmpleado(nombre, apellido, fechaNacimiento, fechaIngreso, puesto, salario);

                                    textArea.append("Empleado añadido correctamente.\n");
                           } catch (Exception e) {
                                    textArea.append("Error al añadir empleado: " + e.getMessage() + "\n");
                           }
                  }
         }

         private void eliminarEmpleado() {
                  String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del empleado a eliminar:");
                  String apellido = JOptionPane.showInputDialog(this, "Ingrese el apellido del empleado a eliminar:");

                  try {
                           FuncionesEmpleados.eliminarEmpleado(nombre, apellido);
                           textArea.append("Empleado eliminado correctamente.\n");
                  } catch (Exception e) {
                           textArea.append("Error al eliminar empleado: " + e.getMessage() + "\n");
                  }
         }

         private void buscarEmpleado() {
                  String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del empleado a buscar:");
                  String apellido = JOptionPane.showInputDialog(this, "Ingrese el apellido del empleado a buscar:");

                  try {
                           String resultado = FuncionesEmpleados.buscarEmpleado(nombre, apellido);
                           textArea.append("Resultado de la búsqueda:\n" + resultado + "\n");
                  } catch (Exception e) {
                           textArea.append("Error al buscar empleado: " + e.getMessage() + "\n");
                  }
         }

         private void ordenarEmpleados() {
                  String[] options = {"Antigüedad", "Salario", "Apellido"};
                  int choice = JOptionPane.showOptionDialog(this, "Seleccione el criterio de ordenamiento:", "Ordenar empleados",
                          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                  if (choice != -1) {
                           try {
                                    String criterio = options[choice].toLowerCase();
                                    String resultado = FuncionesEmpleados.ordenarEmpleados(criterio);
                                    textArea.append("Empleados ordenados por " + criterio + ":\n" + resultado + "\n");
                           } catch (Exception e) {
                                    textArea.append("Error al ordenar empleados: " + e.getMessage() + "\n");
                           }
                  }
         }

         private void calcularSumaSalarios() {
                  try {
                           double totalSalarios = FuncionesEmpleados.calcularSumaSalarios();
                           textArea.append("El gasto total en salarios es: " + totalSalarios + " euros.\n");
                  } catch (Exception e) {
                           textArea.append("Error al calcular el gasto total de salarios: " + e.getMessage() + "\n");
                  }
         }
         
         private void mostrarEmpleadosAntiguos() {
                  try {
                           String resultado1 = FuncionesEmpleados.mostrarEmpleadosAntiguos();
                           textArea.append("Empleados antiguos:\n" + resultado1 + "\n");
                  } catch (Exception e) {
                           textArea.append("Error al mostrar empleados antiguos: " + e.getMessage() + "\n");
                  }
         }
         
         @SuppressWarnings("unchecked")
         // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
         private void initComponents() {

                  jColorChooser1 = new javax.swing.JColorChooser();
                  btnAgregarEmpleado = new javax.swing.JButton();
                  btnEliminarEmpleado = new javax.swing.JButton();
                  btnBuscarEmpleado = new javax.swing.JButton();
                  btnOrdenarEmpleados = new javax.swing.JButton();
                  btnCalcularGastoTotal = new javax.swing.JButton();
                  btnMostrarAntiguos = new javax.swing.JButton();
                  jButton2 = new javax.swing.JButton();
                  jScrollPane1 = new javax.swing.JScrollPane();
                  taResultados = new javax.swing.JTextArea();

                  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                  setTitle("Menu Principal");
                  setAlwaysOnTop(true);
                  setAutoRequestFocus(false);
                  setBackground(new java.awt.Color(153, 255, 204));
                  setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                  setForeground(new java.awt.Color(153, 153, 255));
                  setIconImage(getIconImage());
                  addWindowListener(new java.awt.event.WindowAdapter() {
                           public void windowClosed(java.awt.event.WindowEvent evt) {
                                    formWindowClosed(evt);
                           }
                  });

                  btnAgregarEmpleado.setBackground(new java.awt.Color(0, 153, 153));
                  btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
                  btnAgregarEmpleado.setText("1. Añadir Empleado");
                  btnAgregarEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                  btnAgregarEmpleado.setBorderPainted(false);
                  btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btnAgregarEmpleadoActionPerformed(evt);
                           }
                  });

                  btnEliminarEmpleado.setBackground(new java.awt.Color(0, 153, 153));
                  btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
                  btnEliminarEmpleado.setText("2. Eliminar Empleado");
                  btnEliminarEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                  btnEliminarEmpleado.setBorderPainted(false);
                  btnEliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btnEliminarEmpleadoMouseClicked(evt);
                           }
                  });

                  btnBuscarEmpleado.setBackground(new java.awt.Color(0, 153, 153));
                  btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
                  btnBuscarEmpleado.setText("3. Buscar Empleado");
                  btnBuscarEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                  btnBuscarEmpleado.setBorderPainted(false);
                  btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btnBuscarEmpleadoActionPerformed(evt);
                           }
                  });

                  btnOrdenarEmpleados.setBackground(new java.awt.Color(0, 153, 153));
                  btnOrdenarEmpleados.setForeground(new java.awt.Color(255, 255, 255));
                  btnOrdenarEmpleados.setText("4. Ordenar Empleados");
                  btnOrdenarEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                  btnOrdenarEmpleados.setBorderPainted(false);
                  btnOrdenarEmpleados.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btnOrdenarEmpleadosActionPerformed(evt);
                           }
                  });

                  btnCalcularGastoTotal.setBackground(new java.awt.Color(0, 153, 153));
                  btnCalcularGastoTotal.setForeground(new java.awt.Color(255, 255, 255));
                  btnCalcularGastoTotal.setText("5. Gasto Total");
                  btnCalcularGastoTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                  btnCalcularGastoTotal.setBorderPainted(false);
                  btnCalcularGastoTotal.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btnCalcularGastoTotalActionPerformed(evt);
                           }
                  });

                  btnMostrarAntiguos.setBackground(new java.awt.Color(0, 153, 153));
                  btnMostrarAntiguos.setForeground(new java.awt.Color(255, 255, 255));
                  btnMostrarAntiguos.setText("6. Mostrar Antiguos Empleados");
                  btnMostrarAntiguos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                  btnMostrarAntiguos.setBorderPainted(false);
                  btnMostrarAntiguos.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btnMostrarAntiguosActionPerformed(evt);
                           }
                  });

                  jButton2.setText("jButton2");

                  taResultados.setEditable(false);
                  taResultados.setBackground(new java.awt.Color(255, 255, 255));
                  taResultados.setColumns(20);
                  taResultados.setRows(5);
                  taResultados.setToolTipText("");
                  taResultados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
                  taResultados.setDisabledTextColor(new java.awt.Color(0, 0, 0));
                  taResultados.setEnabled(false);
                  taResultados.setRequestFocusEnabled(false);
                  jScrollPane1.setViewportView(taResultados);

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addGroup(layout.createSequentialGroup()
                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                               .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                               .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addGap(18, 18, 18)
                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                               .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                               .addComponent(btnOrdenarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addGap(18, 18, 18)
                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                               .addComponent(btnMostrarAntiguos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                               .addComponent(btnCalcularGastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(17, Short.MAX_VALUE))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(btnCalcularGastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(btnOrdenarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(btnMostrarAntiguos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                    .addContainerGap())
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
                  // TODO add your handling code here:
         }//GEN-LAST:event_formWindowClosed

         private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
                  // TODO add your handling code here:
                  agregarEmpleado();
         }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

         private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
                  // TODO add your handling code here:
                  buscarEmpleado();
         }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

         private void btnOrdenarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarEmpleadosActionPerformed
                  // TODO add your handling code here:
                  ordenarEmpleados();
         }//GEN-LAST:event_btnOrdenarEmpleadosActionPerformed

         private void btnCalcularGastoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularGastoTotalActionPerformed
                  // TODO add your handling code here:
                  calcularSumaSalarios();
         }//GEN-LAST:event_btnCalcularGastoTotalActionPerformed

         private void btnMostrarAntiguosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAntiguosActionPerformed
                  // TODO add your handling code here:
                  mostrarEmpleadosAntiguos();
         }//GEN-LAST:event_btnMostrarAntiguosActionPerformed

         private void btnEliminarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoMouseClicked
                  // TODO add your handling code here:
                  eliminarEmpleado();
         }//GEN-LAST:event_btnEliminarEmpleadoMouseClicked

         /**
          * @param args the command line arguments
          */
         public static void main(String args[]) {
                  /* Set the Nimbus look and feel */
                  //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                  /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                   */
                  try {
                           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                    if ("Nimbus".equals(info.getName())) {
                                             javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                             break;
                                    }
                           }
                  } catch (ClassNotFoundException ex) {
                           java.util.logging.Logger.getLogger(InterfazMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(InterfazMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(InterfazMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(InterfazMenu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>
                  //</editor-fold>

                  /* Create and display the form */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    new InterfazMenu_1().setVisible(true);
                           }
                  });
         }

         // Variables declaration - do not modify//GEN-BEGIN:variables
         private javax.swing.JButton btnAgregarEmpleado;
         private javax.swing.JButton btnBuscarEmpleado;
         private javax.swing.JButton btnCalcularGastoTotal;
         private javax.swing.JButton btnEliminarEmpleado;
         private javax.swing.JButton btnMostrarAntiguos;
         private javax.swing.JButton btnOrdenarEmpleados;
         private javax.swing.JButton jButton2;
         private javax.swing.JColorChooser jColorChooser1;
         private javax.swing.JScrollPane jScrollPane1;
         private javax.swing.JTextArea taResultados;
         // End of variables declaration//GEN-END:variables
}

