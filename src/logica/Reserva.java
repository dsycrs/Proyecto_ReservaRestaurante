/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Daisy Ccaceres
 */
public class Reserva {
   private static int contadorID = 0; 
    private int idReserva;
    private Cliente cliente;
    private Mesa mesa;
    private String horario;

    public Reserva(Cliente cliente, Mesa mesa, String horario) {
        if (cliente == null || mesa == null || horario == null || horario.isEmpty()) {
            System.out.println("Error: Cliente, mesa y horario son necesarios");
            return; 
        }
        this.idReserva = ++contadorID; 
        this.cliente = cliente;
        this.mesa = mesa;
        this.horario = horario;
    }

    // Métodos getter
    public int getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public String getHorario() {
        return horario;
    }
 
    public void setHorario(String horario) {
        if (horario == null || horario.isEmpty()) {
            System.out.println("Error: La hora no puede estar vacia");
            return; 
        }
        this.horario = horario;
    }
        //metodo sobrecargado
        public void setHorario(int hora, int minutos) {
        this.horario = hora + ":" + minutos; // asigna el horario sin formatos
    }
    
    public void mostrarReserva() {
    System.out.printf("Reserva ID: %d | Cliente: %s | Mesa: %d | Horario: %s%n", 
                       idReserva, cliente.getNombre(), mesa.getNumeroMesa(), horario);
    }

    @Override
    public String toString() {
        return "Reserva ID: " + idReserva + " | " + cliente + " | Mesa: " + mesa.getNumeroMesa() + " | Horario: " + horario;
    }
}    

