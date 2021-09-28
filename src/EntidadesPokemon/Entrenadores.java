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
    private String nombre;
    private Pokemon[] equipo = new Pokemon[6];
    private ArrayList<Objetos> mochila = new ArrayList<Objetos>();

    public Entrenadores() {
    }

    public Entrenadores(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the equipo
     */
    public Pokemon[] getEquipo() {
        return equipo;
    }

    /**
     * @return the mochila
     */
    public ArrayList<Objetos> getMochila() {
        return mochila;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(Pokemon[] equipo) {
        this.equipo = equipo;
    }

    /**
     * @param mochila the mochila to set
     */
    public void setMochila(ArrayList<Objetos> mochila) {
        this.mochila = mochila;
    }

    @Override
    public String toString() {
        return "Entrenadores{" + "nombre=" + nombre + ", equipo=" + equipo + ", mochila=" + mochila + '}';
    }
    
    
}
