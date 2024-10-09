
package practica_Interfaces;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author david
 */
public class InterfazMenu_2 extends javax.swing.JFrame {

         private JTextArea textArea;
         private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

         public InterfazMenu_2() {
                  setSize(500, 400);
                  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  setLocationRelativeTo(null);
                  setLayout(new BorderLayout());

                  JPanel buttonPanel = new JPanel(new GridLayout(6, 1, 10, 10));
                  textArea = new JTextArea();
                  textArea.setEditable(false);
                  JScrollPane scrollPane = new JScrollPane(textArea);

                  JButton btnAgregarEmpleado = new JButton("1.- Añadir empleado");
                  JButton btnEliminarEmpleado = new JButton("2.- Eliminar empleado");
                  JButton btnBuscarEmpleado = new JButton("3.- Buscar empleado");
                  JButton btnOrdenarEmpleados = new JButton("4.- Imprimir empleados ordenados por:");
                  JButton btnCalcularGastoTotal = new JButton("5.- Calcular el gasto total de los empleados");
                  JButton btnMostrarAntiguos = new JButton("6.- Mostrar emplados antiguos");
                  
                  JButton btnSalir = new JButton("Salir");

                  buttonPanel.add(btnAgregarEmpleado);
                  buttonPanel.add(btnEliminarEmpleado);
                  buttonPanel.add(btnBuscarEmpleado);
                  buttonPanel.add(btnOrdenarEmpleados);
                  buttonPanel.add(btnCalcularGastoTotal);
                  buttonPanel.add(btnMostrarAntiguos);
                  buttonPanel.add(btnSalir);

                  add(buttonPanel, BorderLayout.WEST);
                  add(scrollPane, BorderLayout.CENTER);

                  btnAgregarEmpleado.addActionListener(new ActionListener() {
                           public void actionPerformed(ActionEvent e) {
                                    agregarEmpleado();
                           }
                  });

                  btnEliminarEmpleado.addActionListener(new ActionListener() {
                           public void actionPerformed(ActionEvent e) {
                                    eliminarEmpleado();
                           }
                  });

                  btnBuscarEmpleado.addActionListener(new ActionListener() {
                           public void actionPerformed(ActionEvent e) {
                                    buscarEmpleado();
                           }
                  });

                  btnOrdenarEmpleados.addActionListener(new ActionListener() {
                           public void actionPerformed(ActionEvent e) {
                                    ordenarEmpleados();
                           }
                  });

                  btnCalcularGastoTotal.addActionListener(new ActionListener() {
                           public void actionPerformed(ActionEvent e) {
                                    calcularSumaSalarios();
                           }
                  });

                  btnSalir.addActionListener(new ActionListener() {
                           public void actionPerformed(ActionEvent e) {
                                    System.exit(0);
                           }
                  });
                  
                  btnMostrarAntiguos.addActionListener(new ActionListener() {
                           public void actionPerformed(ActionEvent e) {
                                    mostrarEmpleadosAntiguos();
                           }
                  });

                  
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

         /**
          * This method is called from within the constructor to initialize the
          * form. WARNING: Do NOT modify this code. The content of this method
          * is always regenerated by the Form Editor.
          */
         @SuppressWarnings("unchecked")
         // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
         private void initComponents() {

                  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                  setTitle("Menu Opciones");
                  setBackground(new java.awt.Color(255, 255, 0));

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGap(0, 400, Short.MAX_VALUE)
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGap(0, 154, Short.MAX_VALUE)
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         /**
          * @param args the command line arguments
          */
         public static void main(String[] args) {
                  // Crear y mostrar la ventana
                  SwingUtilities.invokeLater(new Runnable() {
                           public void run() {
                                    new InterfazMenu_2().setVisible(true);
                           }
                  });
         }//Fin main

         // Variables declaration - do not modify//GEN-BEGIN:variables
         // End of variables declaration//GEN-END:variables
}
