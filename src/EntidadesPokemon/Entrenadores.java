/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesPokemon;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Entrenadores {
    String nombre;
    Pokemon[] equipo = new Pokemon[6];
    ArrayList<Objetos> mochila = new ArrayList<Objetos>();

    public Entrenadores() {
    }

    public Entrenadores(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Entrenadores{" + "nombre=" + nombre + ", equipo=" + equipo + ", mochila=" + mochila + '}';
    }
    
    
}
