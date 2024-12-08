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
public class Mesa {
    private static Random random = new Random();
    private static int contadorID = 0;  //contador para id
    private int idMesa;
    private int numeroMesa;
    private int capacidad;
    private boolean disponible;


    public Mesa(int numeroMesa, int capacidad) {
         if (capacidad <= 0) {
            System.out.println("Error: La capacidad de la mesa debe ser mayor que 0");
            this.capacidad = 1;  // asigna un valor por defecto si no esta valida
        } else {
            this.capacidad = capacidad;
        }
         
        this.idMesa = contadorID++;  // genera un id unico
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.disponible = true; // cuando inicia esta disponible
    }

    public int getIdMesa() {
        return idMesa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }
        public Mesa(int capacidad) {
        this.numeroMesa = random.nextInt(100); //asigna numero de mesa aleatorio
    }

    @Override
    public String toString() {
        return "ID Mesa: " + idMesa + " / Numero: " + numeroMesa + " / Capacidad: " + capacidad + " / Disponible: " + disponible;
    }
}


