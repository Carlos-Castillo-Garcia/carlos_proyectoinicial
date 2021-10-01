/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesPokemon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author Manuel
 */
public class AventuraPokemon {

    Entrenadores prota = new Entrenadores();
    Entrenadores[] LideresGimnasio = new Entrenadores[8];
    Entrenadores[] AltoMando = new Entrenadores[4];
    Entrenadores Campeon = new Entrenadores();
    String[] tipos = new String[2];
    Movimientos[] set = new Movimientos[4];
    ArrayList<Pokemon> Pokedex = new ArrayList<Pokemon>();
    ArrayList<Objetos> objeto = new ArrayList<Objetos>();

    public AventuraPokemon() {
    }

    public AventuraPokemon(Entrenadores prota) {
        this.prota = prota;
    }

    public void InicioAventura() throws IOException {
        Introduccion();
        inicializar();
        UsarObjetos();
    }

    public void Introduccion() {
        System.out.println("Bienvenido al nuevo mundo de los pokemons, crea tu personaje"
                + ", elige a tus pokemon y comienza tu maravillosa aventura en este mundo.");
    }

    public void CrearPersonaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre: ");
        prota.nombre = sc.nextLine();
    }

    public void ElegirPokemons() {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        for (int i = 0; i < prota.equipo.length; i++) {
            System.out.println("Pokemon numero 1: " + Pokedex.get(i).nombre);
            System.out.println("¿Quieres tener este pokemon en tu equipo? \n 1:si 2:no");
            respuesta = Integer.parseInt(sc.nextLine());
            if (respuesta == 1) {
                prota.equipo[i] = Pokedex.get(i);
                System.out.println(prota.equipo[i].nombre);
            }
        }
    }

    public void UsarObjetos() {
        Scanner sc = new Scanner(System.in);
        int pokemon = 0;
        System.out.println("Los objetos solo los puedes una vez por combate");
        System.out.println("1. Max Pocion\n2. Max Revivir\n3. Max PP");
        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1:
                System.out.println("¿A que pokemon quieres recuperar la vida?");
                for (int i = 0; i < prota.equipo.length; i++) {
                    System.out.println(i + "." + prota.equipo[i].nombre);
                }
                pokemon = Integer.parseInt(sc.nextLine());
                prota.equipo[pokemon].ps = prota.equipo[pokemon].psiniciales;
                System.out.println("Usaste Max Pocion, recuperaste todos lo ps de tu " + prota.equipo[pokemon].nombre);
                break;
            case 2:
                System.out.println("¿Que pokemon quieres revivir?");
                for (int i = 0; i < prota.equipo.length; i++) {
                    System.out.println(i + "." + prota.equipo[i].nombre);
                }
                pokemon = Integer.parseInt(sc.nextLine());
                if (prota.equipo[pokemon].ps >= 0) {
                    prota.equipo[pokemon].ps = prota.equipo[pokemon].psiniciales;
                } else {
                    System.out.println("no es posible usar Max revivir en este pokemon");
                }
                System.out.println("Usaste Max Revivir, reviviste tu " + prota.equipo[pokemon].nombre + " con toda la vida");
                break;
            case 3:
                int movimiento = 0;
                System.out.println("¿A que pokemon quieres recuperarle los pp?");
                for (int i = 0; i < prota.equipo.length; i++) {
                    System.out.println(i + "." + prota.equipo[i].nombre);
                }
                pokemon = Integer.parseInt(sc.nextLine());
                System.out.println("¿Que ataque quieres recuperar?");
                for (int i = 0; i < prota.equipo[pokemon].set.length; i++) {
                    System.out.println(i + "." + prota.equipo[i].set[i].nombre);
                }
                movimiento = Integer.parseInt(sc.nextLine());
                prota.equipo[movimiento].set[movimiento].pp = prota.equipo[movimiento].set[movimiento].ppiniciales;
                System.out.println("Usaste Max PP, recuperaste todos los pp de " + prota.equipo[movimiento].set[movimiento].nombre
                        + " de tu" + prota.equipo[pokemon].nombre + " con toda la vida");
                break;
        }
    }

    public void inicializar() throws FileNotFoundException, IOException {
        File archivojson = new File("D:\\Repositorios_Carlos\\carlos_proyectoinicial\\src\\decidueye.json");
        JSONObject json = new JSONObject();
        String cadena;
        FileReader f = new FileReader(archivojson);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            json = new JSONObject(cadena);
        }
        


        

        for (int i = 0; i < json.getJSONArray("pokemons").length(); i++) {
        tipos[0] = json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("types").getJSONObject(0).getJSONObject("type").getString("name");
        tipos[1] = json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("types").getJSONObject(1).getJSONObject("type").getString("name");
            for (int j = 0; j < json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").length(); j++) {
                 set[j] = new Movimientos(json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getString("name"),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getNumber("dano")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getNumber("preci")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getNumber("pp")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getNumber("pp")));
            }
       
            Pokedex.add(new Pokemon(
                json.getJSONArray("pokemons").getJSONObject(i).getString("name"),
                
                tipos,
                json.getJSONArray("pokemons").getJSONObject(i).getJSONObject("ability").getString("name"),
                set,
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("stats").getJSONObject(0).getNumber("base_stat_hp")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("stats").getJSONObject(0).getNumber("base_stat_hp")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("stats").getJSONObject(1).getNumber("base_stat_attack")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("stats").getJSONObject(2).getNumber("base_stat_defense")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("stats").getJSONObject(3).getNumber("base_stat_special_attack")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("stats").getJSONObject(4).getNumber("base_stat_special_defense")),
                (int) (json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("stats").getJSONObject(5).getNumber("base_stat_speed")),
                json.getJSONArray("pokemons").getJSONObject(i).getBoolean("mega")));
        }
        
    }

}
