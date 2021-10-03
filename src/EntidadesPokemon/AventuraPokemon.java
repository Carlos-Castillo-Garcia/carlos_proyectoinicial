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
    Entrenadores[] lideresgimnasio = new Entrenadores[8];
    Entrenadores[] altomando = new Entrenadores[4];
    Entrenadores campeones = new Entrenadores();
    Entrenadores teamrocket = new Entrenadores();
    Combates combate = new Combates();

    ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
    Tipos tablaTipos = new Tipos();

    public AventuraPokemon() {
    }

    public AventuraPokemon(Entrenadores prota) {
        this.prota = prota;
    }

    public void InicioAventura() throws IOException {
        Inicializarpokemons();
        InicializarEntrenadores();
        CrearPersonaje();
        Gym();
        Ligapokemon();
    }

    public void CrearPersonaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola.");
        System.out.println("Bienvenido al mundo pokemon.");
        System.out.println("En esta aventura eres un entrenador que fue campeon en la region de Alola");
        System.out.println("y quieres ser campeon en la region de Esparta");
        System.out.println("elige un nombre para empezar la aventura:");
        prota.nombre = sc.nextLine();
        ElegirPokemons();
        System.out.println("muy bien ya tienes todo lista para empezar tu aventura");
        System.out.println("suerte para convertirte en el nuevo campeon de Esparta");

    }

    public void ElegirPokemons() {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        int contador = 0;
        boolean comprobante = false;
        for (int i = 0; contador < 6; i++) {
            if (i == pokedex.size()) {
                i = 0;
            }
            do {
                System.out.print("Pokemon : " + pokedex.get(i).nombre);
                System.out.println("\n¿Quieres tener este pokemon en tu equipo? \n 1:si 2:no");
                respuesta = Integer.parseInt(sc.nextLine());
                switch (respuesta) {
                    default:
                        System.out.println("Opcion no valida");
                        break;
                    case 1:
                        prota.equipo.add(pokedex.get(i));
                        System.out.print("\nHas elegido a :" + pokedex.get(i).nombre + "\n\nSiguente ");
                        comprobante = true;
                        contador++;
                        break;
                    case 2:
                        comprobante = true;
                        break;
                }
            } while (comprobante != true);
        }
    }

    public void Gym(){
        boolean salir = false;
        // 1º gym rika
        do {
            System.out.println("llegaste al gimnasio de pilos");
            System.out.println("te vas a enfretara a Rika");
            System.out.println("Rika: bienvenido al gimnasio de pilos yo soy la lider de gimnasio");
            System.out.println("Rika: podras con mis pokemon de tipo hada");
            System.out.println("Rika: bien pues comenzemos");
            System.out.println("la lider de gimnasio Rika te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[0])) {
                salir = true;
                System.out.println("Rika: vaya es tan fuerte como dicen pero te queda mucho camino por recorer");
                System.out.println("Rika: toma la medalla hada por tu victora");
            }else{
                System.out.println("Rika: la proxima sera no te rindas hazte mas fuerte");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (!salir);
        salir = false;
        // transicion
        if ((int)(Math.random()*2) == 0) {
            Inicializarteamrocket();
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("te encuentras un recruta del team rocket");
            System.out.println("y empiezas a combatir:");
            if (combate.combaterandom(prota, teamrocket)) {
                System.out.println("el recuta sale corriendo");
            }else{
                System.out.println("el recuta sale corriendo incluso ganando");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
        }else{
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("que raro que no haya nadie en este camino");
        }
        // 2º gym corelia
        do {
            System.out.println("llegaste al gimnasio de motone");
            System.out.println("te vas a enfretara a Corelia");
            System.out.println("Corelia: buenas estas listo para perder");
            System.out.println("Corelia: si ya lo veremos a luchar");
            System.out.println("la lider de gimnasio Corelia te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[1])) {
                salir = true;
                System.out.println("Corelia: vaya batalla mas intensa");
                System.out.println("Corelia: toma la medalla lucha por tu victora");
            }else{
                System.out.println("Coralia: jajajaja la proxima lo haras mejor jajaja");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (salir);
        salir = false;
        // transicion
        if ((int)(Math.random()*2) == 0) {
            Inicializarteamrocket();
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("te encuentras un recruta del team rocket");
            System.out.println("y empiezas a combatir:");
            if (combate.combaterandom(prota, teamrocket)) {
                System.out.println("el recuta sale corriendo");
            }else{
                System.out.println("el recuta sale corriendo incluso ganando");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
        }else{
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("que raro que no haya nadie en este camino");
        }
        // 3º Lectro
        do {
            System.out.println("llegaste al gimnasio de asine");
            System.out.println("te vas a enfretara a Lectro");
            System.out.println("Lectro: tu eres el campeon de alola no");
            System.out.println("Lectro: por fin un rival digno de la medalla");
            System.out.println("el lider de gimnasio Lectro te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[2])) {
                salir = true;
                System.out.println("Lectro: no me sorprende tu poder sigue asi y llegaras lejos");
                System.out.println("Lectro: toma la medalla Trueno por tu victora");
            }else{
                System.out.println("Lectro: y tu eres el campeon de alola que decepcionante vuelve cuando tengas nivel para superarme");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (salir);
        salir = false;
        // transicion
        if ((int)(Math.random()*2) == 0) {
            Inicializarteamrocket();
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("te encuentras un recruta del team rocket");
            System.out.println("y empiezas a combatir:");
            if (combate.combaterandom(prota, teamrocket)) {
                System.out.println("el recuta sale corriendo");
            }else{
                System.out.println("el recuta sale corriendo incluso ganando");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
        }else{
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("que raro que no haya nadie en este camino");
        }
        // 4º blanca
        do {
            System.out.println("llegaste al gimnasio de corone");
            System.out.println("te vas a enfretara a Blanca");
            System.out.println("Blanca: vaya otro entrenador");
            System.out.println("Blanca: espero que no te mares con facilidad");
            System.out.println("la lider de gimnasio blanca te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[3])) {
                salir = true;
                System.out.println("Blanca: no es justo mi miltank es imparable como lo hiciste");
                System.out.println("Blanca: toma la medalla normal por tu victora");
            }else{
                System.out.println("Blanca: miltank para de rodar que ya hemos ganados");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (salir);
        salir = false;
        // transicion
        if ((int)(Math.random()*2) == 0) {
            Inicializarteamrocket();
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("te encuentras un recruta del team rocket");
            System.out.println("y empiezas a combatir:");
            if (combate.combaterandom(prota, teamrocket)) {
                System.out.println("el recuta sale corriendo");
            }else{
                System.out.println("el recuta sale corriendo incluso ganando");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
        }else{
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("que raro que no haya nadie en este camino");
        }
        // 5º vito Y leti
        do {
            System.out.println("llegaste al gimnasio de turia");
            System.out.println("te vas a enfretara a Vito y Leti");
            System.out.println("Vito: bienvenido a el gimnasio");
            System.out.println("Leti: de turia estas");
            System.out.println("Vito y Leti: listo para perder");
            System.out.println("los lideres de gimnasio Vito y Leti te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[4])) {
                salir = true;
                System.out.println("Leti: Vito hemos perdido");
                System.out.println("Vito: ya Leti habra de darle la medalla");
                System.out.println("Vito Y Leti: toma la medalla duo por tu victora");
            }else{
                System.out.println("Vito y Leti: sabemos que estas triste por tu derota se siente");
            }
            prota.megas = 1;
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (salir);
        salir = false;
        // transicion
        if ((int)(Math.random()*2) == 0) {
            Inicializarteamrocket();
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("te encuentras un recruta del team rocket");
            System.out.println("y empiezas a combatir:");
            if (combate.combaterandom(prota, teamrocket)) {
                System.out.println("el recuta sale corriendo");
            }else{
                System.out.println("el recuta sale corriendo incluso ganando");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
        }else{
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("que raro que no haya nadie en este camino");
        }
        // 6º roy
        do {
            System.out.println("llegaste al gimnasio de faras");
            System.out.println("te vas a enfretara a roy");
            System.out.println("Roy: mis pokemon de tipo dragon no pierden");
            System.out.println("Roy: si no me crees te lo voy a demostrar");
            System.out.println("el lider de gimnasio Roy te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[5])) {
                salir = true;
                System.out.println("Roy: vaya lionel tenia razon tengo que relajarme de vez en cuando");
                System.out.println("Roy: toma la medalla dragon por tu victora");
            }else{
                System.out.println("Roy: jajaja con entrenadores como tu me subis mas el ego");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (salir);
        salir = false;
        // transicion
        if ((int)(Math.random()*2) == 0) {
            Inicializarteamrocket();
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("te encuentras un recruta del team rocket");
            System.out.println("y empiezas a combatir:");
            if (combate.combaterandom(prota, teamrocket)) {
                System.out.println("el recuta sale corriendo");
            }else{
                System.out.println("el recuta sale corriendo incluso ganando");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
        }else{
            System.out.println("vas en busca del proximo gimnasio");
            System.out.println("que raro que no haya nadie en este camino");
        }
        // 7º millo, maiz y zeo
        do {
            System.out.println("llegaste al gimnasio de cardamile");
            System.out.println("te vas a enfretara a Millo, Maiz y Zeo");
            System.out.println("Millo: con mis tipos planta");
            System.out.println("Maiz: con mis tipo agua");
            System.out.println("Zeo: y mis tipos fuego");
            System.out.println("Millo, Maiz y Zeo: nadie nos parara");
            System.out.println("los lider de gimnasio Millo, Maiz y Zeo te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[6])) {
                salir = true;
                System.out.println("Millo: has marchitado a mis pokemon");
                System.out.println("Maiz: los mios se han evaporado");
                System.out.println("Zeo: los mios se han apagado");
                System.out.println("Millo, Maiz y Zeo: toma la medalla trio por tu victora");
            }else{
                System.out.println("Millo, Maiz y Zeo: somos imparables juntos");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (salir);
        salir = false;
        // transicion
        Inicializarteamrocket();
        System.out.println("vas en busca del proximo gimnasio");
        System.out.println("te encuentras un recruta del team rocket");
        System.out.println("y empiezas a combatir:");
        if (combate.combaterandom(prota, teamrocket)) {
            System.out.println("el recuta sale corriendo");
        }else{
            System.out.println("el recuta sale corriendo incluso ganando");
        }
        for (int i = 0; i < prota.equipo.size(); i++) {
            prota.equipo.get(i).Quitarmega();
        }
        prota.megas = 1;
        System.out.println("entras en la bolsa para recuperar a tus pokemon");
        UsarObjetos();
        
        // 8º giovanni
        do {
            System.out.println("llegaste al gimnasio de talamas");
            System.out.println("te vas a enfretara a Giovanni el lider del team rocket");
            System.out.println("Giovanni: a si que eres tu el que molesta las misiones del team rocket");
            System.out.println("Giovanni: no va a poder parar al team rocket y te lo voy a demostrar");
            System.out.println("el lider de gimnasio y del team rocket Giovanni te desafia a un combate");
            if (combate.combaterandom(prota, lideresgimnasio[7])) {
                salir = true;
                System.out.println("Giovanni: vaya la confianza con tus pokemon es grandiosa");
                System.out.println("Giovanni: me has echo reflexionar como hay que tratar los pokemon voy a disolver el team rocket");
                System.out.println("Giovanni: toma la medalla tierra por tu victora");
            }else{
                System.out.println("Giovanni: vete a tu region que aqui no pintas nada");
            }
            for (int i = 0; i < prota.equipo.size(); i++) {
                prota.equipo.get(i).Quitarmega();
            }
            prota.megas = 1;
            System.out.println("entras en la bolsa para recuperar a tus pokemon");
            UsarObjetos();
            
        } while (salir);
    }

    public void Ligapokemon(){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        String primero = "Nada";
        String segundo = "Nada";
        String tercero = "Nada";
        
        do {
            System.out.println("la fin has conseguido las ocho medallas de la region de esparta");
            System.out.println("ya puedes entrar en la liga pokemon");
            System.out.println("elige un alto mando para combatir:");
            for (int i = 0; i < altomando.length; i++) {
                System.out.println((i+1)+". "+altomando[i].nombre);
            }
            System.out.println("escribe el numero del alto mando a combatir:");
            opcion = Integer.parseInt(sc.nextLine())-1;
            primero = altomando[opcion].nombre;
            System.out.println("Bienvenido a la liga pokemon");
            switch(opcion){
                case 0:
                    System.out.println("Isma: soy Ismael del alto mando y uno de los creadores de este programa");
                    System.out.println("Isma: vamos a luchar dragon vicioso");
                    break;
                case 1:
                    System.out.println("Carlos: soy Carlos del alto mando y uno de los creadores de este programa");
                    System.out.println("Carlos: venga que nos macheteamos");
                    break;
                case 2:
                    System.out.println("Lance: soy Lance el doma dragones y soy miembro del alto mando");
                    System.out.println("Lance: mis dragones y yo nos haremos con la victoria");
                    break;
                case 3:
                    System.out.println("Mayla: soy Mayla miembro del alto mando");
                    System.out.println("Mayla: mis pokemon son duros como el diamante no los venceras");
                    break;
            }
            if (combate.combaterandom(prota, altomando[opcion])) {
                System.out.println("puedes enfretarte al proximo alto mando");
                for (int i = 0; i < prota.equipo.size(); i++) {
                    prota.equipo.get(i).Quitarmega();
                }
                prota.megas = 1;
                System.out.println("entras en la bolsa para recuperar a tus pokemon");
                UsarObjetos();
                System.out.println("elige un alto mando para combatir:");
                for (int i = 0; i < altomando.length; i++) {
                    if (!altomando[i].nombre.equals(primero)) {
                        System.out.println((i+1)+". "+altomando[i].nombre);
                    } 
                }
                System.out.println("escribe el numero del alto mando a combatir:");
                opcion = Integer.parseInt(sc.nextLine())-1;
                segundo = altomando[opcion].nombre;
                switch(opcion){
                    case 0:
                        System.out.println("Isma: soy Ismael del alto mando y uno de los creadores de este programa");
                        System.out.println("Isma: vamos a luchar dragon vicioso");
                        break;
                    case 1:
                        System.out.println("Carlos: soy Carlos del alto mando y uno de los creadores de este programa");
                        System.out.println("Carlos: venga que nos macheteamos");
                        break;
                    case 2:
                        System.out.println("Lance: soy Lance el doma dragones y soy miembro del alto mando");
                        System.out.println("Lance: mis dragones y yo nos haremos con la victoria");
                        break;
                    case 3:
                        System.out.println("Mayla: soy Mayla miembro del alto mando");
                        System.out.println("Mayla: mis pokemon son duros como el diamante no los venceras");
                        break;
                }
                if (combate.combaterandom(prota, altomando[opcion])) {
                    System.out.println("puedes enfretarte al proximo alto mando");
                    for (int i = 0; i < prota.equipo.size(); i++) {
                        prota.equipo.get(i).Quitarmega();
                    }
                    prota.megas = 1;
                    System.out.println("entras en la bolsa para recuperar a tus pokemon");
                    UsarObjetos();
                    System.out.println("elige un alto mando para combatir:");
                    for (int i = 0; i < altomando.length; i++) {
                        if (!altomando[i].nombre.equals(primero) && !altomando[i].nombre.equals(segundo)) {
                            System.out.println((i+1)+". "+altomando[i].nombre);
                        } 
                    }
                    System.out.println("escribe el numero del alto mando a combatir:");
                    opcion = Integer.parseInt(sc.nextLine())-1;
                    tercero = altomando[opcion].nombre;
                    switch(opcion){
                        case 0:
                            System.out.println("Isma: soy Ismael del alto mando y uno de los creadores de este programa");
                            System.out.println("Isma: vamos a luchar dragon vicioso");
                            break;
                        case 1:
                            System.out.println("Carlos: soy Carlos del alto mando y uno de los creadores de este programa");
                            System.out.println("Carlos: venga que nos macheteamos");
                            break;
                        case 2:
                            System.out.println("Lance: soy Lance el doma dragones y soy miembro del alto mando");
                            System.out.println("Lance: mis dragones y yo nos haremos con la victoria");
                            break;
                        case 3:
                            System.out.println("Mayla: soy Mayla miembro del alto mando");
                            System.out.println("Mayla: mis pokemon son duros como el diamante no los venceras");
                            break;
                    }
                    if (combate.combaterandom(prota, altomando[opcion])) {
                        System.out.println("puedes enfretarte al proximo alto mando");
                        for (int i = 0; i < prota.equipo.size(); i++) {
                            prota.equipo.get(i).Quitarmega();
                        }
                        prota.megas = 1;
                        System.out.println("entras en la bolsa para recuperar a tus pokemon");
                        UsarObjetos();
                        System.out.println("elige un alto mando para combatir:");
                        for (int i = 0; i < altomando.length; i++) {
                            if (!altomando[i].nombre.equals(primero) && !altomando[i].nombre.equals(segundo) && !altomando[i].nombre.equals(tercero)) {
                                System.out.println((i+1)+". "+altomando[i].nombre);
                            } 
                        }
                        System.out.println("escribe el numero del alto mando a combatir:");
                        opcion = Integer.parseInt(sc.nextLine())-1;
                        tercero = altomando[opcion].nombre;
                        switch(opcion){
                            case 0:
                                System.out.println("Isma: soy Ismael del alto mando y uno de los creadores de este programa");
                                System.out.println("Isma: vamos a luchar dragon vicioso");
                                break;
                            case 1:
                                System.out.println("Carlos: soy Carlos del alto mando y uno de los creadores de este programa");
                                System.out.println("Carlos: venga que nos macheteamos");
                                break;
                            case 2:
                                System.out.println("Lance: soy Lance el doma dragones y soy miembro del alto mando");
                                System.out.println("Lance: mis dragones y yo nos haremos con la victoria");
                                break;
                            case 3:
                                System.out.println("Mayla: soy Mayla miembro del alto mando");
                                System.out.println("Mayla: mis pokemon son duros como el diamante no los venceras");
                                break;
                        }
                        if (combate.combaterandom(prota, altomando[opcion])) {
                            System.out.println("has vencido a todos los alto mando");
                            for (int i = 0; i < prota.equipo.size(); i++) {
                                prota.equipo.get(i).Quitarmega();
                            }
                            prota.megas = 1;
                            System.out.println("entras en la bolsa para recuperar a tus pokemon");
                            UsarObjetos();
                            System.out.println("ahora te vas a enfretar al los campeones de la liga pokemon");
                            System.out.println("entras en la sala del campeon");
                            System.out.println("Azul: bienvenido a la sala del campeon nosotros somos los actuales campeones");
                            System.out.println("Rojo: ...");
                            System.out.println("Azul: tan hablador como siempre jajajjaja bueno no se diga mas a luchar");
                            if (combate.combaterandom(prota, campeones)) {
                                System.out.println("Azul: a sido una batalla memorable no crees rojo");
                                System.out.println("Rojo: ...");
                                System.out.println("Azul: ven con nosotros que te vamos a registrar en el hall de la fama");
                                Halldefama();
                                System.out.println(prota.nombre+": bueno pues a por otra region");
                                salir = true;
                            }else{
                                System.out.println("Azul: la proxima vez sera");
                                System.out.println("Rojo: ...");
                                for (int i = 0; i < prota.equipo.size(); i++) {
                                    prota.equipo.get(i).Quitarmega();
                                }
                                prota.megas = 1;
                                System.out.println("entras en la bolsa para recuperar a tus pokemon");
                                UsarObjetos();
                                }
                        }else{
                            System.out.println("has perdido vuelve a intentarlo otra vez");
                            for (int i = 0; i < prota.equipo.size(); i++) {
                                prota.equipo.get(i).Quitarmega();
                            }
                            prota.megas = 1;
                            System.out.println("entras en la bolsa para recuperar a tus pokemon");
                            UsarObjetos();
                        }
                    }else{
                        System.out.println("has perdido vuelve a intentarlo otra vez");
                        for (int i = 0; i < prota.equipo.size(); i++) {
                            prota.equipo.get(i).Quitarmega();
                        }
                        prota.megas = 1;
                        System.out.println("entras en la bolsa para recuperar a tus pokemon");
                        UsarObjetos();
                    }
                }else{
                    System.out.println("has perdido vuelve a intentarlo otra vez");
                    for (int i = 0; i < prota.equipo.size(); i++) {
                        prota.equipo.get(i).Quitarmega();
                    }
                    prota.megas = 1;
                    System.out.println("entras en la bolsa para recuperar a tus pokemon");
                    UsarObjetos();
                }
            }else{
                System.out.println("has perdido vuelve a intentarlo otra vez");
                for (int i = 0; i < prota.equipo.size(); i++) {
                    prota.equipo.get(i).Quitarmega();
                }
                prota.megas = 1;
                System.out.println("entras en la bolsa para recuperar a tus pokemon");
                UsarObjetos();
            }
            
            
        } while (!salir);
        
    }

    public void Halldefama() {
        System.out.println("has registrado tus pokemon en el hall de la fama");
        for (int i = 0; i < prota.equipo.size(); i++) {
            System.out.println(prota.equipo.get(i) + " de tipos " + prota.equipo.get(i).tipos[0] + " y " + prota.equipo.get(i).tipos[0]);
        }
        System.out.println("tu " + prota.nombre + " te has combertido en el nuevo campeon de esparta con tus pokemon");
    }

    public void UsarObjetos() {
        Scanner sc = new Scanner(System.in);
        int salir = 0;
        System.out.println("Solo puedes entrar en la bolsa una vez aprobechalo bien");
        do {
            int pokemon = 0;
            System.out.println("Estos son los objetos que tienes");
            System.out.println("1. Max Pocion\n2. Max Revivir\n3. Max PP\n4. Antidoto");
            System.out.println("escribe el numero de tu opcion:");
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("¿A que pokemon quieres recuperar la vida?");
                    for (int i = 0; i < prota.equipo.size(); i++) {
                        if (prota.equipo.get(i).ps < prota.equipo.get(i).psiniciales && prota.equipo.get(i).ps > 0) {
                            System.out.println((i + 1) + ". " + prota.equipo.get(i).nombre);
                        }
                    }
                    System.out.println("Escribe el numero del pokemon a recuperar:");
                    pokemon = Integer.parseInt(sc.nextLine()) - 1;
                    prota.equipo.get(pokemon).ps = prota.equipo.get(pokemon).psiniciales;
                    System.out.println("Usaste Max Pocion, recuperaste todos lo ps de tu " + prota.equipo.get(pokemon).nombre);
                    break;
                case 2:
                    System.out.println("¿Que pokemon quieres revivir?");
                    for (int i = 0; i < prota.equipo.size(); i++) {
                        if (prota.equipo.get(i).ps <= 0) {
                            System.out.println((i + 1) + ". " + prota.equipo.get(i).nombre);
                        }
                    }
                    System.out.println("Escribe el numero del pokemon a recuperar:");
                    pokemon = Integer.parseInt(sc.nextLine()) - 1;
                    prota.equipo.get(pokemon).ps = prota.equipo.get(pokemon).psiniciales;
                    prota.equipo.get(pokemon).problemaestado = "Nada";
                    System.out.println("Usaste Max Revivir, reviviste tu " + prota.equipo.get(pokemon).nombre + " con toda la vida");
                    break;
                case 3:
                    int movimiento = 0;
                    System.out.println("¿A que pokemon quieres recuperarle los pp?");
                    for (int i = 0; i < prota.equipo.size(); i++) {
                        System.out.println((i + 1) + ". " + prota.equipo.get(i).nombre);
                    }
                    pokemon = Integer.parseInt(sc.nextLine()) - 1;
                    System.out.println("¿Que ataque quieres recuperar?");
                    for (int i = 0; i < prota.equipo.get(pokemon).set.length; i++) {
                        System.out.println((i + 1) + ". " + prota.equipo.get(pokemon).set[i].nombre + " PP " + prota.equipo.get(pokemon).set[i].pp);
                    }
                    movimiento = Integer.parseInt(sc.nextLine()) - 1;
                    prota.equipo.get(pokemon).set[movimiento].pp = prota.equipo.get(pokemon).set[movimiento].ppiniciales;
                    System.out.println("Usaste Max PP, recuperaste todos los pp de " + prota.equipo.get(pokemon).set[movimiento].nombre
                            + " de tu" + prota.equipo.get(pokemon).nombre);
                    break;
                case 4:
                    System.out.println("¿A que pokemon quieres quitarle le problema de estado");
                    for (int i = 0; i < prota.equipo.size(); i++) {
                        if (!prota.equipo.get(i).problemaestado.equals("Nada")) {
                            System.out.println((i + 1) + ". " + prota.equipo.get(pokemon).set[i].nombre);
                        }
                    }
                    System.out.println("Escribe el numero del pokemon:");
                    pokemon = Integer.parseInt(sc.nextLine()) - 1;
                    prota.equipo.get(pokemon).problemaestado = "Nada";
                    System.out.println("Usaste un Antidoto, curaste a " + prota.equipo.get(pokemon).nombre);
                    break;
                default:
                    System.out.println("Esta opcion no existe elije otra");
                    break;
            }
            System.out.println("Quieres seguir usando la bolsa");
            System.out.println("1. si\n2. no");
            System.out.println("escribe el numero de la opcion elegida");
            salir = Integer.parseInt(sc.nextLine());
        } while (salir != 2);
    }

    public void Inicializarpokemons() throws FileNotFoundException, IOException {
//      File archivojson = new File("D:\\Repositorios_Carlos\\carlos_proyectoinicial\\src\\decidueye.json");
        File archivojson = new File("C:\\Users\\CARLOS\\Documents\\NetBeansProjects\\carlos_proyectoinicial\\src\\Jsons\\Pokemons.json");
        FileReader fr = new FileReader(archivojson);
        BufferedReader br = new BufferedReader(fr);
        String pokemons = br.readLine();
        JSONObject json = new JSONObject(pokemons);

        for (int i = 0; i < json.getJSONArray("pokemons").length(); i++) {
            String[] tipos = new String[2];
            Movimientos[] set = new Movimientos[4];
            tipos[0] = json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("types").getJSONObject(0).getJSONObject("type").getString("name");
            tipos[1] = json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("types").getJSONObject(1).getJSONObject("type").getString("name");
            for (int j = 0; j < json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").length(); j++) {
                set[j] = new Movimientos(json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getString("name"),
                        json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getString("tipo"),
                        json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getInt("preci"),
                        json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getInt("pp"),
                        json.getJSONArray("pokemons").getJSONObject(i).getJSONArray("moves").getJSONObject(j).getJSONObject("move").getInt("pp"));
            }

            pokedex.add(new Pokemon(
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

    public void InicializarEntrenadores() throws FileNotFoundException, IOException {
        File archivojson = new File("C:\\Users\\CARLOS\\Documents\\NetBeansProjects\\carlos_proyectoinicial\\src\\Jsons\\Entrenadores.json");
        FileReader fr = new FileReader(archivojson);
        BufferedReader br = new BufferedReader(fr);
        String entrenadores = br.readLine();
        JSONObject json = new JSONObject(entrenadores);

        for (int i = 0; i < json.getJSONArray("Lideres").length(); i++) {
            ArrayList<Pokemon> equipopokemon = new ArrayList<Pokemon>();
            for (int j = 0; j < json.getJSONArray("Lideres").getJSONObject(i).getJSONArray("equipo").length(); j++) {
                for (int k = 0; k < pokedex.size(); k++) {
                    if ((json.getJSONArray("Lideres").getJSONObject(i).getJSONArray("equipo").getJSONObject(j).getInt("pokemon" + j) - 1) == k) {
                        equipopokemon.add(pokedex.get(k));
                    }
                }
            }
            lideresgimnasio[i] = new Entrenadores(json.getJSONArray("Lideres").getJSONObject(i).getString("nombre"),
                    equipopokemon,
                    (int) (json.getJSONArray("Lideres").getJSONObject(i).getNumber("mega")));
        }

        for (int i = 0; i < json.getJSONArray("AltoMando").length(); i++) {
            ArrayList<Pokemon> equipopokemon = new ArrayList<Pokemon>();
            for (int j = 0; j < json.getJSONArray("AltoMando").getJSONObject(i).getJSONArray("equipo").length(); j++) {
                for (int k = 0; k < pokedex.size(); k++) {
                    if ((json.getJSONArray("AltoMando").getJSONObject(i).getJSONArray("equipo").getJSONObject(j).getInt("pokemon" + j) - 1) == k) {
                        equipopokemon.add(pokedex.get(k));
                    }
                }
            }
            altomando[i] = new Entrenadores(json.getJSONArray("AltoMando").getJSONObject(i).getString("nombre"), equipopokemon,
                    (int) (json.getJSONArray("AltoMando").getJSONObject(i).getNumber("mega")));
            equipopokemon.clear();
        }

        for (int j = 0; j < json.getJSONObject("Campeones").getJSONArray("equipo").length(); j++) {
            ArrayList<Pokemon> equipopokemon = new ArrayList<Pokemon>();
            for (int k = 0; k < pokedex.size(); k++) {
                if ((json.getJSONObject("Campeones").getJSONArray("equipo").getJSONObject(j).getInt("pokemon" + j) - 1) == k) {
                    equipopokemon.add(pokedex.get(k));
                }
            }
            campeones = new Entrenadores(json.getJSONObject("Campeones").getString("nombre"), equipopokemon,
                    (int) (json.getJSONObject("Campeones").getNumber("mega")));
            equipopokemon.clear();
        }
    }

    public void Inicializarteamrocket(){
        ArrayList<Pokemon> equipo = new ArrayList<Pokemon>();
        
        for (int i = 0; i < 6; i++) {
            int puesto = (int) (Math.random()*63);
            equipo.add(pokedex.get(puesto));
            if (Math.random()*4 == 0) {
                i = 6;
            }
        }
        
        teamrocket = new Entrenadores("recluta del team rocket", equipo, 0);
    }
}
