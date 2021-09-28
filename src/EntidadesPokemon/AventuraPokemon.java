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
        Introduccion();
        CrearPersonaje();    
        UsarObjetos();
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
        System.out.println("Los objetos solo los puedes una vez por combate");
        System.out.println("1. Max Pocion\n2. Max Revivir\n3. Max PP");
        int opcion = Integer.parseInt(sc.nextLine());
        switch(opcion){
            case 1:
                System.out.println("¿A que pokemon quieres recuperar la vida?");
                for (int i = 0; i < prota.equipo.length; i++) {
                    System.out.println(i+"."+prota.equipo[i].nombre);
                }
                pokemon = Integer.parseInt(sc.nextLine());
                prota.equipo[pokemon].ps = prota.equipo[pokemon].psiniciales;
                System.out.println("Usaste Max Pocion, recuperaste todos lo ps de tu " + prota.equipo[pokemon].nombre);
                break;
            case 2:
                System.out.println("¿Que pokemon quieres revivir?");
                for (int i = 0; i < prota.equipo.length; i++) {
                    System.out.println(i+"."+prota.equipo[i].nombre);
                }
                pokemon = Integer.parseInt(sc.nextLine());
                if(prota.equipo[pokemon].ps>=0){
                    prota.equipo[pokemon].ps = prota.equipo[pokemon].psiniciales;
                }else{
                    System.out.println("no es posible usar Max revivir en este pokemon");
                }
                System.out.println("Usaste Max Revivir, reviviste tu "+ prota.equipo[pokemon].nombre+" con toda la vida" );
                break;
            case 3:
                int movimiento = 0;
                System.out.println("¿A que pokemon quieres recuperarle los pp?");
                for (int i = 0; i < prota.equipo.length; i++) {
                    System.out.println(i+"."+prota.equipo[i].nombre);
                }
                pokemon = Integer.parseInt(sc.nextLine());
                System.out.println("¿Que ataque quieres recuperar?");
                for (int i = 0; i < prota.equipo[pokemon].set.length; i++) {
                    System.out.println(i+"."+prota.equipo[i].set[i].nombre);
                }
                movimiento = Integer.parseInt(sc.nextLine());
                prota.equipo[movimiento].set[movimiento].pp = prota.equipo[movimiento].set[movimiento].ppiniciales;
                System.out.println("Usaste Max PP, recuperaste todos los pp de "+prota.equipo[movimiento].set[movimiento].nombre+
                        " de tu"+ prota.equipo[pokemon].nombre+" con toda la vida" );
                break;
        }
    }
    
    public void inicializar(){
        objeto[0].nombre = "Max Pocion";
        objeto[1].nombre = "Max Revivir";
        objeto[2].nombre = "Max PP";
        LideresGimnasio.add(prota);
    }
        
}
