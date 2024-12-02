/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package logica;
import java.util.Random;
/**
*
* @author Daisy Ccaceres
*/
public class Reserva {

private String nombre;
private String contacto;
private String fecha;
private String hora;
private int personas;
private int id; 


public Reserva(String nombre, String contacto, String fecha, String hora, int personas) {
    this.nombre = nombre;
    this.contacto = contacto;
    this.fecha = fecha;
    this.hora = hora;
    this.personas = personas;
    this.id = generarIdUnico(); 
}

private int generarIdUnico() {
    Random random = new Random();
    return random.nextInt(1000); 
}

public int getId() {
    return id;
}

public String getInfo() {
    return "ID: " + id + " -> Nombre: " + nombre + 
           " - Contacto: " + contacto + " - Fecha: " + fecha + 
           " - Hora: " + hora + " - Personas: " + personas;
}

public boolean esConflicto(Reserva otraReserva) {
    return this.fecha.equals(otraReserva.fecha) && 
           this.hora.equals(otraReserva.hora) && 
           this.personas == otraReserva.personas;
}
}    
