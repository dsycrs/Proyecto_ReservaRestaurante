/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import logica.Cliente;
import logica.Mesa;
import logica.Reserva;
/**
 *
 * @author Daisy Ccaceres
 */
public class Menu extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private List<Reserva> reservas;           
    private boolean[][] disponibilidad;      
    private List<Mesa> mesas;
    /**
     * Creates new form Menu
     */
    public Menu() {
    initComponents();
    inicializarVariables();  
    tableModel = new DefaultTableModel();
    tableModel.addColumn("ID Reserva");
    tableModel.addColumn("Nombre Cliente");
    tableModel.addColumn("Mesa");
    tableModel.addColumn("Horario");
    tableModel.addColumn("Dia");

    jTable1.setModel(tableModel);
    }
    
        private void inicializarVariables() {
        // iniciar lista de las reservas
        reservas = new ArrayList<>();

        //iniciar la lista de las mesas 
        mesas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mesas.add(new Mesa(i,4)); // mesas del 0 al 9
        }

        // iniciar la matriz de disponibilidad
        disponibilidad = new boolean[10][24];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 24; j++) {
                disponibilidad[i][j] = true; // todas las mesas al principio esten disponibles
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Reservas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RegistrarReserva = new javax.swing.JButton();
        ModificarReserva = new javax.swing.JButton();
        EliminarReserva = new javax.swing.JButton();
        DisponibilidadReserva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        modificarReserva = new javax.swing.JMenuItem();
        eliminarReserva = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(166, 208, 221));

        Reservas.setBackground(new java.awt.Color(0, 0, 0));
        Reservas.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 65)); // NOI18N
        Reservas.setForeground(new java.awt.Color(0, 0, 0));
        Reservas.setText("RESERVAS LA VIE GOURMET");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giu/download__2_-removebg-preview (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reservas))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        RegistrarReserva.setBackground(new java.awt.Color(0, 0, 0));
        RegistrarReserva.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        RegistrarReserva.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarReserva.setText("Registrar Reserva");
        RegistrarReserva.setBorder(null);
        RegistrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarReservaActionPerformed(evt);
            }
        });

        ModificarReserva.setBackground(new java.awt.Color(0, 0, 0));
        ModificarReserva.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        ModificarReserva.setForeground(new java.awt.Color(255, 255, 255));
        ModificarReserva.setText("Modificar Reserva");
        ModificarReserva.setBorder(null);
        ModificarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarReservaActionPerformed(evt);
            }
        });

        EliminarReserva.setBackground(new java.awt.Color(0, 0, 0));
        EliminarReserva.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        EliminarReserva.setForeground(new java.awt.Color(255, 255, 255));
        EliminarReserva.setText("Eliminar reserva");
        EliminarReserva.setBorder(null);
        EliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarReservaActionPerformed(evt);
            }
        });

        DisponibilidadReserva.setBackground(new java.awt.Color(0, 0, 0));
        DisponibilidadReserva.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        DisponibilidadReserva.setForeground(new java.awt.Color(255, 255, 255));
        DisponibilidadReserva.setText("Disponibilidad Reservas");
        DisponibilidadReserva.setBorder(null);
        DisponibilidadReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponibilidadReservaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(EliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModificarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RegistrarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DisponibilidadReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(EliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(RegistrarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))))
                    .addComponent(DisponibilidadReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModificarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenu4.setText("Reservas");

        modificarReserva.setText("Modificar Reserva");
        modificarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarReservaActionPerformed(evt);
            }
        });
        jMenu4.add(modificarReserva);

        eliminarReserva.setText("Eliminar Reserva");
        eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservaActionPerformed(evt);
            }
        });
        jMenu4.add(eliminarReserva);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Opciones");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu5.add(Salir);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarReservaActionPerformed
     String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
    String telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");

    while (telefono.length() != 8 || !esNumero(telefono)) {
        JOptionPane.showMessageDialog(null, "El telefono debe tener 8 caracteres");
        telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
    }

    int personas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas:"));

    while (personas < 1 || personas > 4) {
        JOptionPane.showMessageDialog(null, "La cantidad de personas debe ser entre 1 y 4");
        personas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas:"));
    }

    Cliente nuevoCliente = new Cliente(nombre, telefono, personas);

    int mesaIndex = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la mesa (1 - 9):"));

    while (mesaIndex < 0 || mesaIndex >= mesas.size()) {
        JOptionPane.showMessageDialog(null, "Numero de mesa no valido. Tiene que ser entre 1 y 9.");
        mesaIndex = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la mesa (1 - 9):"));
    }

    String dia = JOptionPane.showInputDialog("Ingrese el dia de la reserva (Formato: YYYY-MM-DD):");

    // Validar el formato del dia
    while (!fechaValido(dia)) {
        JOptionPane.showMessageDialog(null, "El formato del dia no es valido. Debe ser en formato YYYY-MM-DD.");
        dia = JOptionPane.showInputDialog("Ingrese el dia de la reserva (Formato: YYYY-MM-DD):");
    }

    String horario = JOptionPane.showInputDialog("Ingrese el horario (HH:MM, entre 10:00 y 23:00):");

    while (!esFormatoHoraValido(horario) || !horarioEnRango(horario)) {
        JOptionPane.showMessageDialog(null, "El horario no es valido. Debe estar entre las 10:00 y las 23:00.");
        horario = JOptionPane.showInputDialog("Ingrese el horario (HH:MM, entre 10:00 y 23:00):");
    }

    int horarioIndex = Integer.parseInt(horario.split(":")[0]);
    if (disponibilidad[mesaIndex][horarioIndex]) {
        Mesa mesaSeleccionada = mesas.get(mesaIndex);
        mesaSeleccionada.setDisponible(false);
        disponibilidad[mesaIndex][horarioIndex] = false;

        Reserva nuevaReserva = new Reserva(nuevoCliente, mesaSeleccionada, horario, dia);
        reservas.add(nuevaReserva);

        tableModel.addRow(new Object[]{
            nuevaReserva.getIdReserva(),
            nuevoCliente.getNombre(),
            mesaSeleccionada.getNumeroMesa(),
            horario,
            dia  // Agregar el dia a la tabla
        });

        JOptionPane.showMessageDialog(null, "Reserva realizada");
    } else {
        JOptionPane.showMessageDialog(null, "La mesa no esta disponible en ese horario");
    }
    }                                            
    
  
    // validaciones:
    private boolean esNumero(String cadena) {
    // verifica que los caracteres sean numeros
    for (int i = 0; i < cadena.length(); i++) {
        if (cadena.charAt(i) < '0' || cadena.charAt(i) > '9') {
            return false;
        }
    }
    return true;
    }
    
    private boolean esFormatoHoraValido(String hora) {
    if (hora.length() != 5) return false;

    String[] partes = hora.split(":");
    if (partes.length != 2) return false;

    int horas = 0;
    int minutos = 0;

    for (int i = 0; i < partes[0].length(); i++) {
        if (partes[0].charAt(i) < '0' || partes[0].charAt(i) > '9') return false;
        horas = horas * 10 + (partes[0].charAt(i) - '0');
    }

    for (int i = 0; i < partes[1].length(); i++) {
        if (partes[1].charAt(i) < '0' || partes[1].charAt(i) > '9') return false;
        minutos = minutos * 10 + (partes[1].charAt(i) - '0');
    }

    return horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60;
    }

    private int obtenerHoraIndex(String hora) {
    String[] partes = hora.split(":");
    return Integer.parseInt(partes[0]);
    }
    
    private boolean horarioEnRango(String hora) {
    int horas = Integer.parseInt(hora.split(":")[0]);
    int minutos = Integer.parseInt(hora.split(":")[1]);

     // Verifica que este entre las 10:00 y las 23:00
        if (horas < 10 || (horas >= 23 && minutos > 0)) {
            return false;
        }
        return true;
    }
   
    private boolean fechaValido(String fecha) {
    // verificar que la fecha tenga exactamente 10 caracteres 
    if (fecha.length() != 10) {
        return false;
    }

    // comprueba que los caracteres en las posiciones 4 y 7 sean guiones 
    if (fecha.charAt(4) != '-' || fecha.charAt(7) != '-') {
        return false;
    }

    // Extraer el anio, mes y dia de la fecha
    String anio = fecha.substring(0, 4);
    String mes = fecha.substring(5, 7);
    String dia = fecha.substring(8, 10);

    // Verificar que el anio, mes y dia sean numericos
    if (!esNumero(anio) || !esNumero(mes) || !esNumero(dia)) {
        return false;
    }

    // convertir los valores a enteros
    int anioInt = Integer.parseInt(anio);
    int mesInt = Integer.parseInt(mes);
    int diaInt = Integer.parseInt(dia);

    // Validar que el mes este en el rango 1-12
    if (mesInt < 1 || mesInt > 12) {
        return false;
    }

    // Validar que el dia sea valido segun el mes y anio 
        int diasEnMes = obtenerDiasEnMes(mesInt);
        if (diaInt < 1 || diaInt > diasEnMes) {
            return false;
        }

        return true;
    } 
        private int obtenerDiasEnMes(int mes) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasPorMes[mes - 1];
    }//GEN-LAST:event_RegistrarReservaActionPerformed

    private void EliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarReservaActionPerformed
        // TODO add your handling code here: 
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        // obtener el ID de la reserva 
        int idReserva = (int) tableModel.getValueAt(filaSeleccionada, 0);
        Reserva reservaAEliminar = null;

        // busca la reserva 
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                reservaAEliminar = reserva;
                break;
            }
        }

        if (reservaAEliminar != null) {
            // libera la mesa y la disponibilidad
            int mesaIndex = reservaAEliminar.getMesa().getNumeroMesa();
            int horarioIndex = Integer.parseInt(reservaAEliminar.getHorario().split(":")[0]);

            // restaura la disponibilidad
            disponibilidad[mesaIndex][horarioIndex] = true;

            // eliminar la reserva de la lista y actualizar la tabla
            reservas.remove(reservaAEliminar);
            tableModel.removeRow(filaSeleccionada);  // elimina la fila de la tabla

            JOptionPane.showMessageDialog(null, "Reserva eliminada");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una reserva para eliminar");
    }
    }//GEN-LAST:event_EliminarReservaActionPerformed

    private void DisponibilidadReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilidadReservaActionPerformed
        // TODO add your handling code here:
    String mesaStr = JOptionPane.showInputDialog("Ingrese el numero de la mesa (1 - 9):");
    String horarioStr = JOptionPane.showInputDialog("Ingrese el horario (HH:MM, entre 10:00 y 23:00):");

    // Valida horarios
    int mesaIndex = Integer.parseInt(mesaStr);
    int horarioIndex = Integer.parseInt(horarioStr.split(":")[0]);

    // Verifica disponibilidad
    if (disponibilidad[mesaIndex][horarioIndex]) {
        JOptionPane.showMessageDialog(null, "La mesa esta disponible en ese horario");
    } else {
        JOptionPane.showMessageDialog(null, "La mesa no esta disponible en ese horario");
    }
    }//GEN-LAST:event_DisponibilidadReservaActionPerformed

    private void ModificarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarReservaActionPerformed
        // TODO add your handling code here:
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        int idReserva = (int) tableModel.getValueAt(filaSeleccionada, 0);
        Reserva reservaAModificar = null;

        // buscar la reserva a modificar
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                reservaAModificar = reserva;
                break;
            }
        }

        if (reservaAModificar != null) {
            // preguntar al usuario que desea modificar
            String[] opciones = {"Hora", "Mesa", "Ambas"};
            int eleccion = JOptionPane.showOptionDialog(null, 
                "¿Que desea modificar?", 
                "Modificar Reserva", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, opciones, opciones[0]);

            // Variables auxiliares
            String nuevoHorario = reservaAModificar.getHorario();
            int nuevaMesa = reservaAModificar.getMesa().getNumeroMesa();
            boolean esValido = true;

            // Modificar segun la opcion 
            if (eleccion == 0 || eleccion == 2) { // modificar hora o ambas
                do {
                    nuevoHorario = JOptionPane.showInputDialog("Ingrese el nuevo horario (HH:MM, 10:00 a 23:00):");
                    esValido = esFormatoHoraValido(nuevoHorario) && horarioEnRango(nuevoHorario);
                    if (!esValido) {
                        JOptionPane.showMessageDialog(null, "Horario invalido. Intente de nuevo.");
                    }
                } while (!esValido);
            }

            if (eleccion == 1 || eleccion == 2) { // modificar mesa o ambas
                do {
                    nuevaMesa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la nueva mesa:"));
                    if (nuevaMesa < 0 || nuevaMesa >= disponibilidad.length) {
                        JOptionPane.showMessageDialog(null, "Numero de mesa invalido. Intente de nuevo.");
                        esValido = false;
                    } else {
                        // verifica si la nueva mesa esta disponible en el horario que se solicita
                        int horarioIndex = Integer.parseInt(nuevoHorario.split(":")[0]);
                        if (!disponibilidad[nuevaMesa][horarioIndex]) {
                            JOptionPane.showMessageDialog(null, "La mesa no esta disponible en ese horario. Intente con otra.");
                            esValido = false;
                        } else {
                            esValido = true;
                        }
                    }
                } while (!esValido);
            }

            // actualizar reserva
            if (eleccion >= 0) { 
                // libera la disponibilidad anterior
                int horarioAnteriorIndex = Integer.parseInt(reservaAModificar.getHorario().split(":")[0]);
                disponibilidad[reservaAModificar.getMesa().getNumeroMesa()][horarioAnteriorIndex] = true;

                // actualiza los datos de la reserva
                reservaAModificar.setHorario(nuevoHorario);
                reservaAModificar.getMesa().setNumeroMesa(nuevaMesa);

                // actualiza disponibilidad
                int nuevoHorarioIndex = Integer.parseInt(nuevoHorario.split(":")[0]);
                disponibilidad[nuevaMesa][nuevoHorarioIndex] = false;

                // actualiza tabla
                tableModel.setValueAt(nuevoHorario, filaSeleccionada, 3);
                tableModel.setValueAt(nuevaMesa, filaSeleccionada, 2);

                JOptionPane.showMessageDialog(null, "Reserva modificada correctamente.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una reserva para modificar.");
    }
    }//GEN-LAST:event_ModificarReservaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que desea salir?");
    if (confirmacion == JOptionPane.YES_OPTION) {
        System.exit(0);  
    }
    }//GEN-LAST:event_SalirActionPerformed

    private void modificarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarReservaActionPerformed
        // TODO add your handling code here:
    ModificarReservaActionPerformed(evt);
    }//GEN-LAST:event_modificarReservaActionPerformed

    private void eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaActionPerformed
        // TODO add your handling code here:
    EliminarReservaActionPerformed(evt);
    }//GEN-LAST:event_eliminarReservaActionPerformed

    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisponibilidadReserva;
    private javax.swing.JButton EliminarReserva;
    private javax.swing.JButton ModificarReserva;
    private javax.swing.JButton RegistrarReserva;
    private javax.swing.JLabel Reservas;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem eliminarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem modificarReserva;
    // End of variables declaration//GEN-END:variables
}
