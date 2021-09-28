/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesPokemon;

/**
 *
 * @author Manuel
 */
public class Objetos {
    String nombre;
    int efecto;

    public Objetos() {
    }

    public Objetos(String nombre, int dano) {
        this.nombre = nombre;
        this.efecto = dano;
    }

    @Override
    public String toString() {
        return "Objetos{" + "nombre=" + nombre + ", dano=" + efecto + '}';
    }

    
}
