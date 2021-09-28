/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesPokemon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class AventuraPokemon {
    Entrenadores prota = new Entrenadores();
    ArrayList<Entrenadores> LideresGimnasio = new ArrayList<Entrenadores>();
    ArrayList<Entrenadores> AltoMando = new ArrayList<Entrenadores>();
    ArrayList<Pokemon> pokemons = new  ArrayList<Pokemon>();

    public AventuraPokemon() {
    }
    
    public AventuraPokemon(Entrenadores prota) {
        this.prota = prota;
    }
    
    public void InicioAventura(){
        Introduccion();
        CrearPersonaje();
//        ElegirPokemons();
        
    }
    
    public void Introduccion(){
        System.out.println("Bienvenido al nuevo mundo de los pokemons, crea tu personaje"
                + ", elige a tus pokemon y comienza tu maravillosa aventura en este mundo.");
    }
    
    public void CrearPersonaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre: ");
        prota.setNombre(sc.nextLine());
    }   
    
    public void ElegirPokemons(){
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        for (int i = 0; i < prota.getEquipo().length; i++) {
            System.out.println("Pokemon numero 1: " /* agregar el nombre del pokemon*/);
            System.out.println("¿Quieres tener este pokemon en tu equipo? \n 1:si 2:no");
            respuesta = Integer.parseInt(sc.nextLine());
            if(respuesta == 1){
                //insertar el pokemon en el equipo
            }
        }
    }
    
    public void Combates(){
        
    }
    
}
