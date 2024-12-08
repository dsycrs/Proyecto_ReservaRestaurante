/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Daisy Ccaceres
 */
public class gestorReservas {
  boolean[][] disponibilidad;

    
    public gestorReservas(int numeroMesas, int numeroHorarios) {
        if (numeroMesas <= 0 || numeroHorarios <= 0) {
            System.out.println("Error: El numero de mesas y horarios debe ser mayor a 0");
            return;
        }

        disponibilidad = new boolean[numeroMesas][numeroHorarios];
        for (int i = 0; i < numeroMesas; i++) {
            for (int j = 0; j < numeroHorarios; j++) {
                disponibilidad[i][j] = true; 
            }
        }
    }

    // metodo publico para tener la disponibilidad
    public boolean[][] getDisponibilidad() {
        return disponibilidad;
    }

    // consulta la disponibilidad en una hora especifica
    public boolean consultarDisponibilidad(int mesa, int horario) {
        if (mesa < 0 || mesa >= disponibilidad.length) {
            System.out.println("Error: Mesa fuera de rango");
            return false; 
        }
        if (horario < 0 || horario >= disponibilidad[0].length) {
            System.out.println("Error: Horario fuera de rango");
            return false; 
        }
        return disponibilidad[mesa][horario];
    }

    public void actualizarDisponibilidad(int mesa, int horario, boolean estado) {
        if (mesa < 0 || mesa >= disponibilidad.length) {
            System.out.println("Error: Mesa fuera de rango.");
            return; 
        }
        if (horario < 0 || horario >= disponibilidad[0].length) {
            System.out.println("Error: Hora fuera de rango");
            return; // no actualizamos si el horario es invalido
        }
        disponibilidad[mesa][horario] = estado;
    }

    // Mostrar estado general de disponibilidad
    public void mostrarDisponibilidad() {
        for (int i = 0; i < disponibilidad.length; i++) {
            System.out.print("Mesa " + i + ": ");
            for (int j = 0; j < disponibilidad[i].length; j++) {
                System.out.print((disponibilidad[i][j] ? "Disponible" : "Ocupada") + " ");
            }
            System.out.println();
        }
    }
    //arreglo unidimensional
      public String[] obtenerHorariosDisponibles() {
     String[] horarios = new String[disponibilidad[0].length];
     for (int j = 0; j < horarios.length; j++) {
        horarios[j] = disponibilidad[0][j] ? "Disponible" : "Ocupada";
        }
        return horarios;
    }    
}
