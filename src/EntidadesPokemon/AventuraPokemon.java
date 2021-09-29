/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesPokemon;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class AventuraPokemon {
    Entrenadores prota = new Entrenadores();
    Entrenadores[] LideresGimnasio = new Entrenadores[8];
    Entrenadores[] AltoMando = new Entrenadores[4];
    Entrenadores Campeon = new Entrenadores();
    Pokemon[] Pokedex = new Pokemon[78];
    Objetos[] objeto = new Objetos[3];

    public AventuraPokemon() {
    }
    
    public AventuraPokemon(Entrenadores prota) {
        this.prota = prota;
    }
    
    public void InicioAventura(){
        Introduccion();
        inicializar();
        CrearPersonaje(); 
        ElegirPokemons();
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
            System.out.println("Pokemon numero 1: " + Pokedex[i].nombre);
            System.out.println("¿Quieres tener este pokemon en tu equipo? \n 1:si 2:no");
            respuesta = Integer.parseInt(sc.nextLine());
            if(respuesta == 1){
                prota.equipo[i] = Pokedex[i];
                System.out.println(prota.equipo[i].nombre);
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
        Pokedex[0].nombre = "Decidueye";Pokedex[0].tipos[0] = "planta";Pokedex[0].tipos[1] = "fantasma";Pokedex[0].habilidad = "Espesura";Pokedex[0].ps =78;Pokedex[0].psiniciales =78 ;Pokedex[0].at =107 ;Pokedex[0].def =75 ;Pokedex[0].ae =100 ;Pokedex[0].dep =100 ;Pokedex[0].ve =70 ;Pokedex[0].posibilidadmega = false;
        Pokedex[1].nombre = "metagross";Pokedex[1].tipos[0] = "acero";Pokedex[1].tipos[1] = "psiquico";Pokedex[1].habilidad = "metal liviano";Pokedex[1].ps =80;Pokedex[1].psiniciales =80 ;Pokedex[1].at =135 ;Pokedex[1].def =130 ;Pokedex[1].ae =95 ;Pokedex[1].dep =90 ;Pokedex[1].ve =70 ;Pokedex[1].posibilidadmega = true;
        Pokedex[2].nombre = "flareon";Pokedex[2].tipos[0] = "fuego";Pokedex[2].tipos[1] = "fuego";Pokedex[2].habilidad = "absorbe fuego";Pokedex[2].ps =65;Pokedex[2].psiniciales =65 ;Pokedex[2].at =130 ;Pokedex[2].def =60 ;Pokedex[2].ae =95 ;Pokedex[2].dep =110;Pokedex[2].ve =65 ;Pokedex[2].posibilidadmega = false;
        Pokedex[3].nombre = "kommo-o";Pokedex[3].tipos[0] = "dragon";Pokedex[3].tipos[1] = "lucha";Pokedex[3].habilidad = "funda";Pokedex[3].ps =75;Pokedex[3].psiniciales =75 ;Pokedex[3].at =110;Pokedex[3].def =125 ;Pokedex[3].ae =100 ;Pokedex[3].dep =105 ;Pokedex[3].ve =85 ;Pokedex[3].posibilidadmega = false;
        Pokedex[4].nombre = "milotic";Pokedex[4].tipos[0] = "agua";Pokedex[4].tipos[1] = "agua";Pokedex[4].habilidad = "escama especial";Pokedex[4].ps =95;Pokedex[4].psiniciales =95 ;Pokedex[4].at =60 ;Pokedex[4].def =79 ;Pokedex[4].ae =100 ;Pokedex[4].dep =125 ;Pokedex[4].ve =81 ;Pokedex[4].posibilidadmega = false;
        Pokedex[5].nombre = "krookodile";Pokedex[5].tipos[0] = "tierra";Pokedex[5].tipos[1] = "sinestro";Pokedex[5].habilidad = "intimidacion";Pokedex[5].ps =95;Pokedex[5].psiniciales =95 ;Pokedex[5].at =117 ;Pokedex[5].def =80 ;Pokedex[5].ae =65 ;Pokedex[5].dep =70 ;Pokedex[5].ve =92;Pokedex[5].posibilidadmega = false;
        Pokedex[6].nombre = "blaziken";Pokedex[6].tipos[0] = "fuego";Pokedex[6].tipos[1] = "lucha";Pokedex[6].habilidad = "mar llamas";Pokedex[6].ps =80;Pokedex[6].psiniciales =80 ;Pokedex[6].at =120 ;Pokedex[6].def =70 ;Pokedex[6].ae =110 ;Pokedex[6].dep =70 ;Pokedex[6].ve =80 ;Pokedex[6].posibilidadmega = true;
        Pokedex[7].nombre = "snorlax";Pokedex[7].tipos[0] = "normal";Pokedex[7].tipos[1] = "normal";Pokedex[7].habilidad = "inmunidad";Pokedex[7].ps =160;Pokedex[7].psiniciales =160 ;Pokedex[7].at =110 ;Pokedex[7].def =65 ;Pokedex[7].ae =65 ;Pokedex[7].dep =110 ;Pokedex[7].ve =30 ;Pokedex[7].posibilidadmega = true;
        Pokedex[8].nombre = "tyranitar";Pokedex[8].tipos[0] = "roca";Pokedex[8].tipos[1] = "siniestro";Pokedex[8].habilidad = "nerviosismo";Pokedex[8].ps =100;Pokedex[8].psiniciales =100 ;Pokedex[8].at =134 ;Pokedex[8].def =110 ;Pokedex[8].ae =95 ;Pokedex[8].dep =100 ;Pokedex[8].ve =61 ;Pokedex[8].posibilidadmega = false;
        Pokedex[9].nombre = "salamence";Pokedex[9].tipos[0] = "dragon";Pokedex[9].tipos[1] = "volador";Pokedex[9].habilidad = "intimidacion";Pokedex[9].ps =95;Pokedex[9].psiniciales =95 ;Pokedex[9].at =135 ;Pokedex[9].def =80 ;Pokedex[9].ae =110 ;Pokedex[9].dep =80 ;Pokedex[9].ve =100 ;Pokedex[9].posibilidadmega = true;
        Pokedex[10].nombre = "ferrothorn";Pokedex[10].tipos[0] = "planta";Pokedex[10].tipos[1] = "acero";Pokedex[10].habilidad = "anticipacion";Pokedex[10].ps =74;Pokedex[10].psiniciales =74 ;Pokedex[10].at =94 ;Pokedex[10].def =131 ;Pokedex[10].ae =54 ;Pokedex[10].dep =116 ;Pokedex[10].ve =20 ;Pokedex[10].posibilidadmega = false;
        Pokedex[11].nombre = "azumarill";Pokedex[11].tipos[0] = "agua";Pokedex[11].tipos[1] = "hada";Pokedex[11].habilidad = "potencia";Pokedex[11].ps =78;Pokedex[11].psiniciales =78 ;Pokedex[11].at =107 ;Pokedex[11].def =75 ;Pokedex[11].ae =100 ;Pokedex[11].dep =100 ;Pokedex[11].ve =70 ;Pokedex[11].posibilidadmega = false;
        Pokedex[12].nombre = "Decidueye";Pokedex[12].tipos[0] = "planta";Pokedex[12].tipos[1] = "fantasma";Pokedex[12].habilidad = "Espesura";Pokedex[12].ps =78;Pokedex[12].psiniciales =78 ;Pokedex[12].at =107 ;Pokedex[12].def =75 ;Pokedex[12].ae =100 ;Pokedex[12].dep =100 ;Pokedex[12].ve =70 ;Pokedex[12].posibilidadmega = false;
        Pokedex[13].nombre = "Decidueye";Pokedex[13].tipos[0] = "planta";Pokedex[13].tipos[1] = "fantasma";Pokedex[13].habilidad = "Espesura";Pokedex[13].ps =78;Pokedex[13].psiniciales =78 ;Pokedex[13].at =107 ;Pokedex[13].def =75 ;Pokedex[13].ae =100 ;Pokedex[13].dep =100 ;Pokedex[13].ve =70 ;Pokedex[13].posibilidadmega = false;
        Pokedex[14].nombre = "Decidueye";Pokedex[14].tipos[0] = "planta";Pokedex[14].tipos[1] = "fantasma";Pokedex[14].habilidad = "Espesura";Pokedex[14].ps =78;Pokedex[14].psiniciales =78 ;Pokedex[14].at =107 ;Pokedex[14].def =75 ;Pokedex[14].ae =100 ;Pokedex[14].dep =100 ;Pokedex[14].ve =70 ;Pokedex[14].posibilidadmega = false;
        Pokedex[15].nombre = "Decidueye";Pokedex[15].tipos[0] = "planta";Pokedex[15].tipos[1] = "fantasma";Pokedex[15].habilidad = "Espesura";Pokedex[15].ps =78;Pokedex[15].psiniciales =78 ;Pokedex[15].at =107 ;Pokedex[15].def =75 ;Pokedex[15].ae =100 ;Pokedex[15].dep =100 ;Pokedex[15].ve =70 ;Pokedex[15].posibilidadmega = false;
        Pokedex[16].nombre = "Decidueye";Pokedex[16].tipos[0] = "planta";Pokedex[16].tipos[1] = "fantasma";Pokedex[16].habilidad = "Espesura";Pokedex[16].ps =78;Pokedex[16].psiniciales =78 ;Pokedex[16].at =107 ;Pokedex[16].def =75 ;Pokedex[16].ae =100 ;Pokedex[16].dep =100 ;Pokedex[16].ve =70 ;Pokedex[16].posibilidadmega = false;
        Pokedex[17].nombre = "Decidueye";Pokedex[17].tipos[0] = "planta";Pokedex[17].tipos[1] = "fantasma";Pokedex[17].habilidad = "Espesura";Pokedex[17].ps =78;Pokedex[17].psiniciales =78 ;Pokedex[17].at =107 ;Pokedex[17].def =75 ;Pokedex[17].ae =100 ;Pokedex[17].dep =100 ;Pokedex[17].ve =70 ;Pokedex[17].posibilidadmega = false;
        Pokedex[18].nombre = "Decidueye";Pokedex[18].tipos[0] = "planta";Pokedex[18].tipos[1] = "fantasma";Pokedex[18].habilidad = "Espesura";Pokedex[18].ps =78;Pokedex[18].psiniciales =78 ;Pokedex[18].at =107 ;Pokedex[18].def =75 ;Pokedex[18].ae =100 ;Pokedex[18].dep =100 ;Pokedex[18].ve =70 ;Pokedex[18].posibilidadmega = false;
        Pokedex[19].nombre = "Decidueye";Pokedex[19].tipos[0] = "planta";Pokedex[19].tipos[1] = "fantasma";Pokedex[19].habilidad = "Espesura";Pokedex[19].ps =78;Pokedex[19].psiniciales =78 ;Pokedex[19].at =107 ;Pokedex[19].def =75 ;Pokedex[19].ae =100 ;Pokedex[19].dep =100 ;Pokedex[19].ve =70 ;Pokedex[19].posibilidadmega = false;
        Pokedex[20].nombre = "Decidueye";Pokedex[20].tipos[0] = "planta";Pokedex[20].tipos[1] = "fantasma";Pokedex[20].habilidad = "Espesura";Pokedex[20].ps =78;Pokedex[20].psiniciales =78 ;Pokedex[20].at =107 ;Pokedex[20].def =75 ;Pokedex[20].ae =100 ;Pokedex[20].dep =100 ;Pokedex[20].ve =70 ;Pokedex[20].posibilidadmega = false;
        Pokedex[21].nombre = "Decidueye";Pokedex[21].tipos[0] = "planta";Pokedex[21].tipos[1] = "fantasma";Pokedex[21].habilidad = "Espesura";Pokedex[21].ps =78;Pokedex[21].psiniciales =78 ;Pokedex[21].at =107 ;Pokedex[21].def =75 ;Pokedex[21].ae =100 ;Pokedex[21].dep =100 ;Pokedex[21].ve =70 ;Pokedex[21].posibilidadmega = false;
        Pokedex[22].nombre = "Decidueye";Pokedex[22].tipos[0] = "planta";Pokedex[22].tipos[1] = "fantasma";Pokedex[22].habilidad = "Espesura";Pokedex[22].ps =78;Pokedex[22].psiniciales =78 ;Pokedex[22].at =107 ;Pokedex[22].def =75 ;Pokedex[22].ae =100 ;Pokedex[22].dep =100 ;Pokedex[22].ve =70 ;Pokedex[22].posibilidadmega = false;
        Pokedex[23].nombre = "Decidueye";Pokedex[23].tipos[0] = "planta";Pokedex[23].tipos[1] = "fantasma";Pokedex[23].habilidad = "Espesura";Pokedex[23].ps =78;Pokedex[23].psiniciales =78 ;Pokedex[23].at =107 ;Pokedex[23].def =75 ;Pokedex[23].ae =100 ;Pokedex[23].dep =100 ;Pokedex[23].ve =70 ;Pokedex[23].posibilidadmega = false;
        Pokedex[24].nombre = "Decidueye";Pokedex[24].tipos[0] = "planta";Pokedex[24].tipos[1] = "fantasma";Pokedex[24].habilidad = "Espesura";Pokedex[24].ps =78;Pokedex[24].psiniciales =78 ;Pokedex[24].at =107 ;Pokedex[24].def =75 ;Pokedex[24].ae =100 ;Pokedex[24].dep =100 ;Pokedex[24].ve =70 ;Pokedex[24].posibilidadmega = false;
        Pokedex[25].nombre = "Decidueye";Pokedex[25].tipos[0] = "planta";Pokedex[25].tipos[1] = "fantasma";Pokedex[25].habilidad = "Espesura";Pokedex[25].ps =78;Pokedex[25].psiniciales =78 ;Pokedex[25].at =107 ;Pokedex[25].def =75 ;Pokedex[25].ae =100 ;Pokedex[25].dep =100 ;Pokedex[25].ve =70 ;Pokedex[25].posibilidadmega = false;
        Pokedex[26].nombre = "Decidueye";Pokedex[26].tipos[0] = "planta";Pokedex[26].tipos[1] = "fantasma";Pokedex[26].habilidad = "Espesura";Pokedex[26].ps =78;Pokedex[26].psiniciales =78 ;Pokedex[26].at =107 ;Pokedex[26].def =75 ;Pokedex[26].ae =100 ;Pokedex[26].dep =100 ;Pokedex[26].ve =70 ;Pokedex[26].posibilidadmega = false;
        Pokedex[27].nombre = "Decidueye";Pokedex[27].tipos[0] = "planta";Pokedex[27].tipos[1] = "fantasma";Pokedex[27].habilidad = "Espesura";Pokedex[27].ps =78;Pokedex[27].psiniciales =78 ;Pokedex[27].at =107 ;Pokedex[27].def =75 ;Pokedex[27].ae =100 ;Pokedex[27].dep =100 ;Pokedex[27].ve =70 ;Pokedex[27].posibilidadmega = false;
        Pokedex[28].nombre = "Decidueye";Pokedex[28].tipos[0] = "planta";Pokedex[28].tipos[1] = "fantasma";Pokedex[28].habilidad = "Espesura";Pokedex[28].ps =78;Pokedex[28].psiniciales =78 ;Pokedex[28].at =107 ;Pokedex[28].def =75 ;Pokedex[28].ae =100 ;Pokedex[28].dep =100 ;Pokedex[28].ve =70 ;Pokedex[28].posibilidadmega = false;
        Pokedex[29].nombre = "Decidueye";Pokedex[29].tipos[0] = "planta";Pokedex[29].tipos[1] = "fantasma";Pokedex[29].habilidad = "Espesura";Pokedex[29].ps =78;Pokedex[29].psiniciales =78 ;Pokedex[29].at =107 ;Pokedex[29].def =75 ;Pokedex[29].ae =100 ;Pokedex[29].dep =100 ;Pokedex[29].ve =70 ;Pokedex[29].posibilidadmega = false;
        Pokedex[30].nombre = "Decidueye";Pokedex[30].tipos[0] = "planta";Pokedex[30].tipos[1] = "fantasma";Pokedex[30].habilidad = "Espesura";Pokedex[30].ps =78;Pokedex[30].psiniciales =78 ;Pokedex[30].at =107 ;Pokedex[30].def =75 ;Pokedex[30].ae =100 ;Pokedex[30].dep =100 ;Pokedex[30].ve =70 ;Pokedex[30].posibilidadmega = false;
        Pokedex[31].nombre = "Decidueye";Pokedex[31].tipos[0] = "planta";Pokedex[31].tipos[1] = "fantasma";Pokedex[31].habilidad = "Espesura";Pokedex[31].ps =78;Pokedex[31].psiniciales =78 ;Pokedex[31].at =107 ;Pokedex[31].def =75 ;Pokedex[31].ae =100 ;Pokedex[31].dep =100 ;Pokedex[31].ve =70 ;Pokedex[31].posibilidadmega = false;
        Pokedex[32].nombre = "Decidueye";Pokedex[32].tipos[0] = "planta";Pokedex[32].tipos[1] = "fantasma";Pokedex[32].habilidad = "Espesura";Pokedex[32].ps =78;Pokedex[32].psiniciales =78 ;Pokedex[32].at =107 ;Pokedex[32].def =75 ;Pokedex[32].ae =100 ;Pokedex[32].dep =100 ;Pokedex[32].ve =70 ;Pokedex[32].posibilidadmega = false;
        Pokedex[33].nombre = "Decidueye";Pokedex[33].tipos[0] = "planta";Pokedex[33].tipos[1] = "fantasma";Pokedex[33].habilidad = "Espesura";Pokedex[33].ps =78;Pokedex[33].psiniciales =78 ;Pokedex[33].at =107 ;Pokedex[33].def =75 ;Pokedex[33].ae =100 ;Pokedex[33].dep =100 ;Pokedex[33].ve =70 ;Pokedex[33].posibilidadmega = false;
        Pokedex[34].nombre = "Decidueye";Pokedex[34].tipos[0] = "planta";Pokedex[34].tipos[1] = "fantasma";Pokedex[34].habilidad = "Espesura";Pokedex[34].ps =78;Pokedex[34].psiniciales =78 ;Pokedex[34].at =107 ;Pokedex[34].def =75 ;Pokedex[34].ae =100 ;Pokedex[34].dep =100 ;Pokedex[34].ve =70 ;Pokedex[34].posibilidadmega = false;
        Pokedex[35].nombre = "Decidueye";Pokedex[35].tipos[0] = "planta";Pokedex[35].tipos[1] = "fantasma";Pokedex[35].habilidad = "Espesura";Pokedex[35].ps =78;Pokedex[35].psiniciales =78 ;Pokedex[35].at =107 ;Pokedex[35].def =75 ;Pokedex[35].ae =100 ;Pokedex[35].dep =100 ;Pokedex[35].ve =70 ;Pokedex[35].posibilidadmega = false;
        Pokedex[36].nombre = "Decidueye";Pokedex[36].tipos[0] = "planta";Pokedex[36].tipos[1] = "fantasma";Pokedex[36].habilidad = "Espesura";Pokedex[36].ps =78;Pokedex[36].psiniciales =78 ;Pokedex[36].at =107 ;Pokedex[36].def =75 ;Pokedex[36].ae =100 ;Pokedex[36].dep =100 ;Pokedex[36].ve =70 ;Pokedex[36].posibilidadmega = false;
        Pokedex[37].nombre = "Decidueye";Pokedex[37].tipos[0] = "planta";Pokedex[37].tipos[1] = "fantasma";Pokedex[37].habilidad = "Espesura";Pokedex[37].ps =78;Pokedex[37].psiniciales =78 ;Pokedex[37].at =107 ;Pokedex[37].def =75 ;Pokedex[37].ae =100 ;Pokedex[37].dep =100 ;Pokedex[37].ve =70 ;Pokedex[37].posibilidadmega = false;
        Pokedex[38].nombre = "Decidueye";Pokedex[38].tipos[0] = "planta";Pokedex[38].tipos[1] = "fantasma";Pokedex[38].habilidad = "Espesura";Pokedex[38].ps =78;Pokedex[38].psiniciales =78 ;Pokedex[38].at =107 ;Pokedex[38].def =75 ;Pokedex[38].ae =100 ;Pokedex[38].dep =100 ;Pokedex[38].ve =70 ;Pokedex[38].posibilidadmega = false;
        Pokedex[39].nombre = "Decidueye";Pokedex[39].tipos[0] = "planta";Pokedex[39].tipos[1] = "fantasma";Pokedex[39].habilidad = "Espesura";Pokedex[39].ps =78;Pokedex[39].psiniciales =78 ;Pokedex[39].at =107 ;Pokedex[39].def =75 ;Pokedex[39].ae =100 ;Pokedex[39].dep =100 ;Pokedex[39].ve =70 ;Pokedex[39].posibilidadmega = false;
        Pokedex[40].nombre = "Decidueye";Pokedex[40].tipos[0] = "planta";Pokedex[40].tipos[1] = "fantasma";Pokedex[40].habilidad = "Espesura";Pokedex[40].ps =78;Pokedex[40].psiniciales =78 ;Pokedex[40].at =107 ;Pokedex[40].def =75 ;Pokedex[40].ae =100 ;Pokedex[40].dep =100 ;Pokedex[40].ve =70 ;Pokedex[40].posibilidadmega = false;
        Pokedex[41].nombre = "Decidueye";Pokedex[41].tipos[0] = "planta";Pokedex[41].tipos[1] = "fantasma";Pokedex[41].habilidad = "Espesura";Pokedex[41].ps =78;Pokedex[41].psiniciales =78 ;Pokedex[41].at =107 ;Pokedex[41].def =75 ;Pokedex[41].ae =100 ;Pokedex[41].dep =100 ;Pokedex[41].ve =70 ;Pokedex[41].posibilidadmega = false;
        Pokedex[42].nombre = "Decidueye";Pokedex[42].tipos[0] = "planta";Pokedex[42].tipos[1] = "fantasma";Pokedex[42].habilidad = "Espesura";Pokedex[42].ps =78;Pokedex[42].psiniciales =78 ;Pokedex[42].at =107 ;Pokedex[42].def =75 ;Pokedex[42].ae =100 ;Pokedex[42].dep =100 ;Pokedex[42].ve =70 ;Pokedex[42].posibilidadmega = false;
        Pokedex[43].nombre = "Decidueye";Pokedex[43].tipos[0] = "planta";Pokedex[43].tipos[1] = "fantasma";Pokedex[43].habilidad = "Espesura";Pokedex[43].ps =78;Pokedex[43].psiniciales =78 ;Pokedex[43].at =107 ;Pokedex[43].def =75 ;Pokedex[43].ae =100 ;Pokedex[43].dep =100 ;Pokedex[43].ve =70 ;Pokedex[43].posibilidadmega = false;
        Pokedex[44].nombre = "Decidueye";Pokedex[44].tipos[0] = "planta";Pokedex[44].tipos[1] = "fantasma";Pokedex[44].habilidad = "Espesura";Pokedex[44].ps =78;Pokedex[44].psiniciales =78 ;Pokedex[44].at =107 ;Pokedex[44].def =75 ;Pokedex[44].ae =100 ;Pokedex[44].dep =100 ;Pokedex[44].ve =70 ;Pokedex[44].posibilidadmega = false;
        Pokedex[45].nombre = "Decidueye";Pokedex[45].tipos[0] = "planta";Pokedex[45].tipos[1] = "fantasma";Pokedex[45].habilidad = "Espesura";Pokedex[45].ps =78;Pokedex[45].psiniciales =78 ;Pokedex[45].at =107 ;Pokedex[45].def =75 ;Pokedex[45].ae =100 ;Pokedex[45].dep =100 ;Pokedex[45].ve =70 ;Pokedex[45].posibilidadmega = false;
        Pokedex[46].nombre = "Decidueye";Pokedex[46].tipos[0] = "planta";Pokedex[46].tipos[1] = "fantasma";Pokedex[46].habilidad = "Espesura";Pokedex[46].ps =78;Pokedex[46].psiniciales =78 ;Pokedex[46].at =107 ;Pokedex[46].def =75 ;Pokedex[46].ae =100 ;Pokedex[46].dep =100 ;Pokedex[46].ve =70 ;Pokedex[46].posibilidadmega = false;
        Pokedex[47].nombre = "Decidueye";Pokedex[47].tipos[0] = "planta";Pokedex[47].tipos[1] = "fantasma";Pokedex[47].habilidad = "Espesura";Pokedex[47].ps =78;Pokedex[47].psiniciales =78 ;Pokedex[47].at =107 ;Pokedex[47].def =75 ;Pokedex[47].ae =100 ;Pokedex[47].dep =100 ;Pokedex[47].ve =70 ;Pokedex[47].posibilidadmega = false;
        Pokedex[48].nombre = "Decidueye";Pokedex[48].tipos[0] = "planta";Pokedex[48].tipos[1] = "fantasma";Pokedex[48].habilidad = "Espesura";Pokedex[48].ps =78;Pokedex[48].psiniciales =78 ;Pokedex[48].at =107 ;Pokedex[48].def =75 ;Pokedex[48].ae =100 ;Pokedex[48].dep =100 ;Pokedex[48].ve =70 ;Pokedex[48].posibilidadmega = false;
        Pokedex[49].nombre = "Decidueye";Pokedex[49].tipos[0] = "planta";Pokedex[49].tipos[1] = "fantasma";Pokedex[49].habilidad = "Espesura";Pokedex[49].ps =78;Pokedex[49].psiniciales =78 ;Pokedex[49].at =107 ;Pokedex[49].def =75 ;Pokedex[49].ae =100 ;Pokedex[49].dep =100 ;Pokedex[49].ve =70 ;Pokedex[49].posibilidadmega = false;
        Pokedex[50].nombre = "Decidueye";Pokedex[50].tipos[0] = "planta";Pokedex[50].tipos[1] = "fantasma";Pokedex[50].habilidad = "Espesura";Pokedex[50].ps =78;Pokedex[50].psiniciales =78 ;Pokedex[50].at =107 ;Pokedex[50].def =75 ;Pokedex[50].ae =100 ;Pokedex[50].dep =100 ;Pokedex[50].ve =70 ;Pokedex[50].posibilidadmega = false;
        Pokedex[51].nombre = "Decidueye";Pokedex[51].tipos[0] = "planta";Pokedex[51].tipos[1] = "fantasma";Pokedex[51].habilidad = "Espesura";Pokedex[51].ps =78;Pokedex[51].psiniciales =78 ;Pokedex[51].at =107 ;Pokedex[51].def =75 ;Pokedex[51].ae =100 ;Pokedex[51].dep =100 ;Pokedex[51].ve =70 ;Pokedex[51].posibilidadmega = false;
        Pokedex[52].nombre = "Decidueye";Pokedex[52].tipos[0] = "planta";Pokedex[52].tipos[1] = "fantasma";Pokedex[52].habilidad = "Espesura";Pokedex[52].ps =78;Pokedex[52].psiniciales =78 ;Pokedex[52].at =107 ;Pokedex[52].def =75 ;Pokedex[52].ae =100 ;Pokedex[52].dep =100 ;Pokedex[52].ve =70 ;Pokedex[52].posibilidadmega = false;
        Pokedex[53].nombre = "Decidueye";Pokedex[53].tipos[0] = "planta";Pokedex[53].tipos[1] = "fantasma";Pokedex[53].habilidad = "Espesura";Pokedex[53].ps =78;Pokedex[53].psiniciales =78 ;Pokedex[53].at =107 ;Pokedex[53].def =75 ;Pokedex[53].ae =100 ;Pokedex[53].dep =100 ;Pokedex[53].ve =70 ;Pokedex[53].posibilidadmega = false;
        Pokedex[54].nombre = "Decidueye";Pokedex[54].tipos[0] = "planta";Pokedex[54].tipos[1] = "fantasma";Pokedex[54].habilidad = "Espesura";Pokedex[54].ps =78;Pokedex[54].psiniciales =78 ;Pokedex[54].at =107 ;Pokedex[54].def =75 ;Pokedex[54].ae =100 ;Pokedex[54].dep =100 ;Pokedex[54].ve =70 ;Pokedex[54].posibilidadmega = false;
        Pokedex[55].nombre = "Decidueye";Pokedex[55].tipos[0] = "planta";Pokedex[55].tipos[1] = "fantasma";Pokedex[55].habilidad = "Espesura";Pokedex[55].ps =78;Pokedex[55].psiniciales =78 ;Pokedex[55].at =107 ;Pokedex[55].def =75 ;Pokedex[55].ae =100 ;Pokedex[55].dep =100 ;Pokedex[55].ve =70 ;Pokedex[55].posibilidadmega = false;
        Pokedex[56].nombre = "Decidueye";Pokedex[56].tipos[0] = "planta";Pokedex[56].tipos[1] = "fantasma";Pokedex[56].habilidad = "Espesura";Pokedex[56].ps =78;Pokedex[56].psiniciales =78 ;Pokedex[56].at =107 ;Pokedex[56].def =75 ;Pokedex[56].ae =100 ;Pokedex[56].dep =100 ;Pokedex[56].ve =70 ;Pokedex[56].posibilidadmega = false;
        Pokedex[57].nombre = "Decidueye";Pokedex[57].tipos[0] = "planta";Pokedex[57].tipos[1] = "fantasma";Pokedex[57].habilidad = "Espesura";Pokedex[57].ps =78;Pokedex[57].psiniciales =78 ;Pokedex[57].at =107 ;Pokedex[57].def =75 ;Pokedex[57].ae =100 ;Pokedex[57].dep =100 ;Pokedex[57].ve =70 ;Pokedex[57].posibilidadmega = false;
        Pokedex[58].nombre = "Decidueye";Pokedex[58].tipos[0] = "planta";Pokedex[58].tipos[1] = "fantasma";Pokedex[58].habilidad = "Espesura";Pokedex[58].ps =78;Pokedex[58].psiniciales =78 ;Pokedex[58].at =107 ;Pokedex[58].def =75 ;Pokedex[58].ae =100 ;Pokedex[58].dep =100 ;Pokedex[58].ve =70 ;Pokedex[58].posibilidadmega = false;
        Pokedex[59].nombre = "Decidueye";Pokedex[59].tipos[0] = "planta";Pokedex[59].tipos[1] = "fantasma";Pokedex[59].habilidad = "Espesura";Pokedex[59].ps =78;Pokedex[59].psiniciales =78 ;Pokedex[59].at =107 ;Pokedex[59].def =75 ;Pokedex[59].ae =100 ;Pokedex[59].dep =100 ;Pokedex[59].ve =70 ;Pokedex[59].posibilidadmega = false;
        Pokedex[60].nombre = "Decidueye";Pokedex[60].tipos[0] = "planta";Pokedex[60].tipos[1] = "fantasma";Pokedex[60].habilidad = "Espesura";Pokedex[60].ps =78;Pokedex[60].psiniciales =78 ;Pokedex[60].at =107 ;Pokedex[60].def =75 ;Pokedex[60].ae =100 ;Pokedex[60].dep =100 ;Pokedex[60].ve =70 ;Pokedex[60].posibilidadmega = false;
        Pokedex[61].nombre = "Decidueye";Pokedex[61].tipos[0] = "planta";Pokedex[61].tipos[1] = "fantasma";Pokedex[61].habilidad = "Espesura";Pokedex[61].ps =78;Pokedex[61].psiniciales =78 ;Pokedex[61].at =107 ;Pokedex[61].def =75 ;Pokedex[61].ae =100 ;Pokedex[61].dep =100 ;Pokedex[61].ve =70 ;Pokedex[61].posibilidadmega = false;
        Pokedex[62].nombre = "Decidueye";Pokedex[62].tipos[0] = "planta";Pokedex[62].tipos[1] = "fantasma";Pokedex[62].habilidad = "Espesura";Pokedex[62].ps =78;Pokedex[62].psiniciales =78 ;Pokedex[62].at =107 ;Pokedex[62].def =75 ;Pokedex[62].ae =100 ;Pokedex[62].dep =100 ;Pokedex[62].ve =70 ;Pokedex[62].posibilidadmega = false;
        Pokedex[63].nombre = "Decidueye";Pokedex[63].tipos[0] = "planta";Pokedex[63].tipos[1] = "fantasma";Pokedex[63].habilidad = "Espesura";Pokedex[63].ps =78;Pokedex[63].psiniciales =78 ;Pokedex[63].at =107 ;Pokedex[63].def =75 ;Pokedex[63].ae =100 ;Pokedex[63].dep =100 ;Pokedex[63].ve =70 ;Pokedex[63].posibilidadmega = false;
        Pokedex[64].nombre = "Decidueye";Pokedex[64].tipos[0] = "planta";Pokedex[64].tipos[1] = "fantasma";Pokedex[64].habilidad = "Espesura";Pokedex[64].ps =78;Pokedex[64].psiniciales =78 ;Pokedex[64].at =107 ;Pokedex[64].def =75 ;Pokedex[64].ae =100 ;Pokedex[64].dep =100 ;Pokedex[64].ve =70 ;Pokedex[64].posibilidadmega = false;
        Pokedex[65].nombre = "Decidueye";Pokedex[65].tipos[0] = "planta";Pokedex[65].tipos[1] = "fantasma";Pokedex[65].habilidad = "Espesura";Pokedex[65].ps =78;Pokedex[65].psiniciales =78 ;Pokedex[65].at =107 ;Pokedex[65].def =75 ;Pokedex[65].ae =100 ;Pokedex[65].dep =100 ;Pokedex[65].ve =70 ;Pokedex[65].posibilidadmega = false;
        Pokedex[66].nombre = "Decidueye";Pokedex[66].tipos[0] = "planta";Pokedex[66].tipos[1] = "fantasma";Pokedex[66].habilidad = "Espesura";Pokedex[66].ps =78;Pokedex[66].psiniciales =78 ;Pokedex[66].at =107 ;Pokedex[66].def =75 ;Pokedex[66].ae =100 ;Pokedex[66].dep =100 ;Pokedex[66].ve =70 ;Pokedex[66].posibilidadmega = false;
        Pokedex[67].nombre = "Decidueye";Pokedex[67].tipos[0] = "planta";Pokedex[67].tipos[1] = "fantasma";Pokedex[67].habilidad = "Espesura";Pokedex[67].ps =78;Pokedex[67].psiniciales =78 ;Pokedex[67].at =107 ;Pokedex[67].def =75 ;Pokedex[67].ae =100 ;Pokedex[67].dep =100 ;Pokedex[67].ve =70 ;Pokedex[67].posibilidadmega = false;
        Pokedex[68].nombre = "Decidueye";Pokedex[68].tipos[0] = "planta";Pokedex[68].tipos[1] = "fantasma";Pokedex[68].habilidad = "Espesura";Pokedex[68].ps =78;Pokedex[68].psiniciales =78 ;Pokedex[68].at =107 ;Pokedex[68].def =75 ;Pokedex[68].ae =100 ;Pokedex[68].dep =100 ;Pokedex[68].ve =70 ;Pokedex[68].posibilidadmega = false;
        Pokedex[69].nombre = "Decidueye";Pokedex[69].tipos[0] = "planta";Pokedex[69].tipos[1] = "fantasma";Pokedex[69].habilidad = "Espesura";Pokedex[69].ps =78;Pokedex[69].psiniciales =78 ;Pokedex[69].at =107 ;Pokedex[69].def =75 ;Pokedex[69].ae =100 ;Pokedex[69].dep =100 ;Pokedex[69].ve =70 ;Pokedex[69].posibilidadmega = false;
        Pokedex[70].nombre = "Decidueye";Pokedex[70].tipos[0] = "planta";Pokedex[70].tipos[1] = "fantasma";Pokedex[70].habilidad = "Espesura";Pokedex[70].ps =78;Pokedex[70].psiniciales =78 ;Pokedex[70].at =107 ;Pokedex[70].def =75 ;Pokedex[70].ae =100 ;Pokedex[70].dep =100 ;Pokedex[70].ve =70 ;Pokedex[70].posibilidadmega = false;
        Pokedex[71].nombre = "Decidueye";Pokedex[71].tipos[0] = "planta";Pokedex[71].tipos[1] = "fantasma";Pokedex[71].habilidad = "Espesura";Pokedex[71].ps =78;Pokedex[71].psiniciales =78 ;Pokedex[71].at =107 ;Pokedex[71].def =75 ;Pokedex[71].ae =100 ;Pokedex[71].dep =100 ;Pokedex[71].ve =70 ;Pokedex[71].posibilidadmega = false;
        Pokedex[72].nombre = "Decidueye";Pokedex[72].tipos[0] = "planta";Pokedex[72].tipos[1] = "fantasma";Pokedex[72].habilidad = "Espesura";Pokedex[72].ps =78;Pokedex[72].psiniciales =78 ;Pokedex[72].at =107 ;Pokedex[72].def =75 ;Pokedex[72].ae =100 ;Pokedex[72].dep =100 ;Pokedex[72].ve =70 ;Pokedex[72].posibilidadmega = false;
        Pokedex[73].nombre = "Decidueye";Pokedex[73].tipos[0] = "planta";Pokedex[73].tipos[1] = "fantasma";Pokedex[73].habilidad = "Espesura";Pokedex[73].ps =78;Pokedex[73].psiniciales =78 ;Pokedex[73].at =107 ;Pokedex[73].def =75 ;Pokedex[73].ae =100 ;Pokedex[73].dep =100 ;Pokedex[73].ve =70 ;Pokedex[73].posibilidadmega = false;
        Pokedex[74].nombre = "Decidueye";Pokedex[74].tipos[0] = "planta";Pokedex[74].tipos[1] = "fantasma";Pokedex[74].habilidad = "Espesura";Pokedex[74].ps =78;Pokedex[74].psiniciales =78 ;Pokedex[74].at =107 ;Pokedex[74].def =75 ;Pokedex[74].ae =100 ;Pokedex[74].dep =100 ;Pokedex[74].ve =70 ;Pokedex[74].posibilidadmega = false;
        Pokedex[75].nombre = "Decidueye";Pokedex[75].tipos[0] = "planta";Pokedex[75].tipos[1] = "fantasma";Pokedex[75].habilidad = "Espesura";Pokedex[75].ps =78;Pokedex[75].psiniciales =78 ;Pokedex[75].at =107 ;Pokedex[75].def =75 ;Pokedex[75].ae =100 ;Pokedex[75].dep =100 ;Pokedex[75].ve =70 ;Pokedex[75].posibilidadmega = false;
        Pokedex[76].nombre = "Decidueye";Pokedex[76].tipos[0] = "planta";Pokedex[76].tipos[1] = "fantasma";Pokedex[76].habilidad = "Espesura";Pokedex[76].ps =78;Pokedex[76].psiniciales =78 ;Pokedex[76].at =107 ;Pokedex[76].def =75 ;Pokedex[76].ae =100 ;Pokedex[76].dep =100 ;Pokedex[76].ve =70 ;Pokedex[76].posibilidadmega = false;
        Pokedex[77].nombre = "Decidueye";Pokedex[77].tipos[0] = "planta";Pokedex[77].tipos[1] = "fantasma";Pokedex[77].habilidad = "Espesura";Pokedex[77].ps =78;Pokedex[77].psiniciales =78 ;Pokedex[77].at =107 ;Pokedex[77].def =75 ;Pokedex[77].ae =100 ;Pokedex[77].dep =100 ;Pokedex[77].ve =70 ;Pokedex[77].posibilidadmega = false;
        Pokedex[78].nombre = "Decidueye";Pokedex[78].tipos[0] = "planta";Pokedex[78].tipos[1] = "fantasma";Pokedex[78].habilidad = "Espesura";Pokedex[78].ps =78;Pokedex[78].psiniciales =78 ;Pokedex[78].at =107 ;Pokedex[78].def =75 ;Pokedex[78].ae =100 ;Pokedex[78].dep =100 ;Pokedex[78].ve =70 ;Pokedex[78].posibilidadmega = false;
        Pokedex[79].nombre = "Decidueye";Pokedex[79].tipos[0] = "planta";Pokedex[79].tipos[1] = "fantasma";Pokedex[79].habilidad = "Espesura";Pokedex[79].ps =78;Pokedex[79].psiniciales =78 ;Pokedex[79].at =107 ;Pokedex[79].def =75 ;Pokedex[79].ae =100 ;Pokedex[79].dep =100 ;Pokedex[79].ve =70 ;Pokedex[79].posibilidadmega = false;
    }
        
}
