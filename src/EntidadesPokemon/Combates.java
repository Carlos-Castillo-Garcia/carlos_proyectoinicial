package EntidadesPokemon;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Combates {
    
    public boolean combaterandom(Entrenadores prota, Entrenadores npc){
        Scanner sc = new Scanner(System.in);
        boolean ganar = true;
        int bajasprota = 0;
        int bajasnpc = 0;
        do {
            boolean salir = false;
            int pokemonprota;
            int pokemonnpc;
            do {
                System.out.println("Estos son tus pokemon:");
                for (int i = 0; i < prota.equipo.size(); i++) {
                    System.out.println((i+1)+". "+prota.equipo.get(i).nombre+" ps: "+prota.equipo.get(i).ps);
                }
                System.out.println("escribe el numero del pokemon elegido:");
                pokemonprota = Integer.parseInt(sc.nextLine()) - 1;
                if (prota.equipo.get(pokemonprota).ps > 0) {
                    salir = true;
                }else{
                    System.out.println("este pokemon esta debilitado elige otro");
                }
            } while (!salir);
            salir = false;
            do{
                pokemonnpc = (int) (Math.random()*npc.equipo.size());
                if (npc.equipo.get(pokemonnpc).ps > 0) {
                    salir = true;
                }
            }while(!salir);
            
            System.out.println(prota.nombre+": adelante "+prota.equipo.get(pokemonprota).nombre);
            System.out.println(npc.nombre+": puedes con esto "+npc.equipo.get(pokemonnpc).nombre);
            if (prota.megas > 0 && prota.equipo.get(pokemonprota).posibilidadmega) {
                System.out.println(prota.equipo.get(pokemonprota).nombre+" puede megaevolucionar");
                System.out.println("Quieres megaevolucionarle");
                System.out.println("1. si");
                System.out.println("2. no");
                System.out.println("Escribe tu opcion:");
                int opcionmega = Integer.parseInt(sc.nextLine());
                switch(opcionmega){
                    case 1:
                        prota.equipo.get(pokemonprota).Megas();
                        prota.megas--;
                        break;
                    case 2:
                        System.out.println("no has megaevolucionado");
                        break;
                    default:
                        System.out.println("se a perdido la conexion con tu pokemon para megaevolucionar");
                        break;
                }
            }
            if (npc.megas > 0 && npc.equipo.get(pokemonnpc).posibilidadmega) {
                npc.equipo.get(pokemonnpc).Megas();
                npc.megas--;
            }
            
            do{
                int movimientoprota;
                int movimientonpc;
                boolean ppprota = false;
                boolean ppnpc = false;
                do{
                    System.out.println("Elige un movimiento");
                    for (int i = 0; i < prota.equipo.get(pokemonprota).set.length; i++) {
                        System.out.println((i+1)+". "+prota.equipo.get(pokemonprota).set[i].nombre);
                    }
                    System.out.println("escribe el numero del movimiento elegido:");
                    movimientoprota = Integer.parseInt(sc.nextLine()) - 1;
                    if (prota.equipo.get(pokemonprota).set[movimientoprota].pp > 0) {
                        ppprota = true;
                    }else{
                        System.out.println("no tienes pp elige otro movimiento");
                    }
                }while(!ppprota);
                do {
                    movimientonpc = (int) (Math.random()*4);
                    if (npc.equipo.get(pokemonnpc).set[movimientonpc].pp > 0) {
                        ppnpc = true;
                    }
                } while (!ppnpc);
                if (movimientonpc != 3 && movimientoprota != 3) {
                    if (prota.equipo.get(pokemonprota).ve > npc.equipo.get(pokemonnpc).ve) {
                        prota.equipo.get(pokemonprota).set[movimientoprota].ataque(prota.equipo.get(pokemonprota), npc.equipo.get(pokemonnpc));
                        if (npc.equipo.get(pokemonnpc).ps > 0) {
                            npc.equipo.get(pokemonnpc).set[movimientonpc].ataque(npc.equipo.get(pokemonnpc), prota.equipo.get(pokemonprota));
                        }else{
                            System.out.println(npc.equipo.get(pokemonnpc).nombre+" no puede atacar");
                        }
                        
                    }else{
                        npc.equipo.get(pokemonnpc).set[movimientonpc].ataque(npc.equipo.get(pokemonnpc), prota.equipo.get(pokemonprota));
                        if (prota.equipo.get(pokemonprota).ps > 0) {
                            prota.equipo.get(pokemonprota).set[movimientoprota].ataque(prota.equipo.get(pokemonprota), npc.equipo.get(pokemonnpc));
                        }else{
                            System.out.println(prota.equipo.get(pokemonprota).nombre+" no puede atacar");
                        }
                        
                    }
                }else{
                    System.out.println("los pokemon se han protegido"); 
                }                
                
                prota.equipo.get(pokemonprota).Efecto();
                npc.equipo.get(pokemonnpc).Efecto();
                
            }while(prota.equipo.get(pokemonprota).ps > 0 && npc.equipo.get(pokemonnpc).ps > 0);
            
            if (prota.equipo.get(pokemonprota).ps < 0) {
                System.out.println("tu pokemon se a debilitado");
                bajasprota++;
            }else{
                System.out.println("el pokemon de "+npc.nombre+" se a debilitado");
                bajasnpc++;
            }
        } while (bajasprota < prota.equipo.size() && bajasnpc < npc.equipo.size());
        
        if (bajasprota == prota.equipo.size()) {
            System.out.println("has perdido el combate");
            ganar = false;
        }else{
            System.out.println("has ganado el combate");
            ganar = true;
        }
        
        return ganar;
    }
}

