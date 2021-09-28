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
    Objetos[] objeto = new Objetos[3];

    public AventuraPokemon() {
    }
    
    public AventuraPokemon(Entrenadores prota) {
        this.prota = prota;
    }
    
    public void InicioAventura(){
        objeto[0].nombre = "Max Pocion";
        
        Introduccion();
        CrearPersonaje();    
    }
    
    public void Introduccion(){
        System.out.println("Bienvenido al nuevo mundo de los pokemons, crea tu personaje"
                + ", elige a tus pokemon y comienza tu maravillosa aventura en este mundo.");
    }
    
    public void CrearPersonaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre: ");
        prota.nombre = sc.nextLine();
    }   
    
    public void ElegirPokemons(){
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        for (int i = 0; i < prota.equipo.length; i++) {
            System.out.println("Pokemon numero 1: " /*pokemon.getnombre()*/);
            System.out.println("¿Quieres tener este pokemon en tu equipo? \n 1:si 2:no");
            respuesta = Integer.parseInt(sc.nextLine());
            if(respuesta == 1){
                //insertar el pokemon en el equipo
            }
        }
    }
    
    public void UsarObjetos(){
        Scanner sc = new Scanner(System.in);
        int pokemon = 0;
        int opcion = Integer.parseInt(sc.nextLine());
        System.out.println("Los objetos solo los puedes una vez por combate");
        System.out.println("1. Max Pocion\n2. Max Revivir\n3. Max PP");
        switch(opcion){
            case 1:
                System.out.println("¿A que pokemon quieres recuperar la vida?");
                /*mostrar listado de los nombres de los pokemons ordenados con numeros*/
                pokemon = Integer.parseInt(sc.nextLine());
                /*recuperar la vida del pokemon*/
                System.out.println("Usaste Max Pocion, recuperaste todos lo ps de tu " /*pokemon.getnombre()*/);
                break;
            case 2:
                System.out.println("¿Que pokemon quieres revivir?");
                /*mostrar listado de los nombres de los pokemons ordenados con numeros*/
                pokemon = Integer.parseInt(sc.nextLine());
                /*revivir pokemon*/
                System.out.println("Usaste Max Revivir, reviviste tu "/*pokemon.getnombre()*/+" con toda la vida" );
                break;
            case 3:
                int movimiento = 0;
                System.out.println("¿A que pokemon quieres recuperarle los pp?");
                /*mostrar listado de los nombres de los pokemons ordenados con numeros*/
                pokemon = Integer.parseInt(sc.nextLine());
                System.out.println("¿que ataque quieres recuperar?");
                /*sacar listado de los ataque del pokemon elegido ordenado por numeros*/
                movimiento = Integer.parseInt(sc.nextLine());
                /*recuperar los pp del movimiento*/
                System.out.println("Usaste Max Revivir, reviviste tu "/*pokemon.getnombre()*/+" con toda la vida" );
                break;
        }
    }
        
}
