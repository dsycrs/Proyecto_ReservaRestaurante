/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Daisy Ccaceres
 */
public class Cliente {
   private String nombre;
   private String telefono;
   private int personas;

    
    public Cliente(String nombre, String telefono, int personas) {
        this.nombre = nombre;
        this.telefono = telefono;
        setPersonas(personas);  
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        if (personas <= 0) {
            System.out.println("Error: El numero de personas debe ser mayor que 0");
            return;  
        }
        this.personas = personas;
    }
        //metodo recursivo
        public int calcularFactorial(int numero) {
        if (numero <= 1) {
            return 1;
        }
        return numero * calcularFactorial(numero - 1);
    }
    // muestra los datos del cliente
    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Telefono: " + telefono + ", Personas: " + personas;
    }

    
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Telefono: " + telefono + ", Personas: " + personas;
    }
}    

