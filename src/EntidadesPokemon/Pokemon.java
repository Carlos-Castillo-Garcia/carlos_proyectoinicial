/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesPokemon;

/**
 *
 * @author Usuario
 */
public class Pokemon {
    String nombre;
    String[] tipos = new String[2];
    String habilidad;
    Movimientos[] set = new Movimientos[4];
    int ps;
    int psiniciales;
    int at;
    int def;
    int ae;
    int dep;
    int ve;
    String problemaestado = "Nada";
    Boolean posibilidadmega;
    boolean megaactivada;

    public Pokemon() {
        
    }
    public Pokemon(String nombre, String[] tipos, String habilidad, Movimientos[] set, int ps,int psiniciales, int at, int def, int ae, int dep, int ve, Boolean posibilidadmega) {
        this.nombre = nombre;
        this.tipos = tipos;
        this.habilidad = habilidad;
        this.set = set;
        this.ps = ps;
        this.psiniciales = psiniciales;
        this.at = at;
        this.def = def;
        this.ae = ae;
        this.dep = dep;
        this.ve = ve;
        this.posibilidadmega = posibilidadmega;
    }    
    
    public void Megas(){
        
        if(posibilidadmega) {
            if(nombre.equals("Metagross")) {
                habilidad = "Garra dura";
                at = at + 10;
                def = def + 20;
                ae = ae + 10;
                dep = dep + 20;
                ve = ve + 40;
                megaactivada = true;
                
            }
            if(nombre.equals("Blaziken")) {
                habilidad = "Impulso";
                at = at + 40;
                def = def + 10;
                ae = ae + 20;
                dep = dep + 10;
                ve = ve + 20;
                megaactivada = true;
            }
            if(nombre.equals("Tyranitar")) {
                habilidad = "Chorro arena";
                at = at + 30;
                def = def + 40;
                dep = dep + 20;
                ve = ve + 10;
                megaactivada = true;
            }
            if(nombre.equals("Salamence")) {
                habilidad = "Piel celeste";
                at = at + 10;
                def = def + 50;
                ae = ae + 10;
                dep = dep + 10;
                ve = ve + 20;
                megaactivada = true;
            }
            if(nombre.equals("Mawile")) {
                habilidad = "Potencia";
                at = at + 20;
                def = def + 40;
                dep = dep + 40;
                megaactivada = true;
            }
            if(nombre.equals("Lucario")) {
                habilidad = "Adaptable";
                at = at + 35;
                def = def + 18;
                ae = ae + 25;
                ve = ve + 22;
                megaactivada = true;
            }
            if(nombre.equals("Manectric")) {
                habilidad = "Intimidacion";
                def = def + 20;
                ae = ae + 30;
                dep = dep + 20;
                ve = ve + 30;
                megaactivada = true;
            }
            if(nombre.equals("Lopunny")) {
                tipos[1] = "Lucha";
                habilidad = "Intrepido";
                at = at + 60;
                def = def + 10;
                ve = ve + 30;
                megaactivada = true;
            }
            if(nombre.equals("Gardevoir")) {
                habilidad = "Piel feerica";
                at = at + 20;
                ae = ae + 40;
                dep = dep + 20;
                ve = ve + 20;
                megaactivada = true;
            }
            if(nombre.equals("Gallade")) {
                habilidad = "Foco interno";
                at = at + 40;
                def = def + 30;
                ve = ve + 30;
                megaactivada = true;
            }
            if(nombre.equals("Garchomp")) {
                habilidad = "Poder arena";
                at = at + 40;
                def = def + 20;
                ae = ae + 40;
                dep = dep + 10;
                ve = ve - 10;
                megaactivada = true;
            }
            if(nombre.equals("Altaria")) {
                tipos[1] = "Hada";
                habilidad = "Piel feerica";
                at = at + 40;
                def = def + 20;
                ae = ae + 40;
                megaactivada = true;
            }
            if(nombre.equals("Charizard")) {
                tipos[1] = "Dragon";
                habilidad = "Garra dura";
                at = at + 46;
                def = def + 33;
                ae = ae + 21;
                megaactivada = true;
            }
            if(nombre.equals("Gyarados")) {
                tipos[1] = "siniestro";
                habilidad = "Rompemoldes";
                at = at + 30;
                def = def + 30;
                ae = ae + 10;
                dep = dep + 30;
                megaactivada = true;
            }
            if(nombre.equals("Pidgeot")) {
                habilidad = "Indefenso";
                def = def + 5;
                ae = ae + 65;
                dep = dep + 10;
                ve = ve + 20;
                megaactivada = true;
            }
            if(nombre.equals("Alakazam")) {
                habilidad = "Rasto";
                def = def + 20;
                ae = ae + 40;
                dep = dep + 10;
                ve = ve + 30;
                megaactivada = true;
            }
            if(nombre.equals("Venusaur")) {
                habilidad = "Sebo";
                at = at + 18;
                def = def + 40;
                ae = ae + 22;
                dep = dep + 20;
                megaactivada = true;
            }
            if(nombre.equals("Blastoise")) {
                habilidad = "Megadisparador";
                at = at + 20;
                def = def + 20;
                ae = ae + 50;
                dep = dep + 10;
                megaactivada = true;
            }
            
            System.out.println("Tu "+nombre+" a megaevolucionado a mega-"+nombre);
        }
    }
    
    public void Problemaestado(String efecto){
        if (problemaestado.equals("Nada")) {
            if ((int) Math.random()*4 == 1) {
                problemaestado = efecto;
                System.out.println(nombre+" esta "+ efecto);
            }else{
                System.out.println(nombre+" no le paso nada");
            }
        }else{
            System.out.println(nombre+" ya tiene un problema de estado");
        }
    }
    
    public void Quitarmega(){
        if(megaactivada) {
            if(nombre.equals("Metagross")) {
                habilidad = "Metal liviano";
                at = at - 10;
                def = def - 20;
                ae = ae - 10;
                dep = dep - 20;
                ve = ve - 40;
                megaactivada = false;
            }
            if(nombre.equals("Blaziken")) {
                habilidad = "Mar de llamas";
                at = at - 40;
                def = def - 10;
                ae = ae - 20;
                dep = dep - 10;
                ve = ve - 20;
                megaactivada = false;
            }
            if(nombre.equals("Tyranitar")) {
                habilidad = "Nerviosismo";
                at = at - 30;
                def = def - 40;
                dep = dep - 20;
                ve = ve - 10;
                megaactivada = false;
            }
            if(nombre.equals("Salamence")) {
                habilidad = "Intimidacion";
                at = at - 10;
                def = def - 50;
                ae = ae - 10;
                dep = dep - 10;
                ve = ve - 20;
                megaactivada = false;
            }
            if(nombre.equals("Mawile")) {
                habilidad = "Intimidacion";
                at = at - 20;
                def = def - 40;
                dep = dep - 40;
                megaactivada = false;
            }
            if(nombre.equals("Lucario")) {
                habilidad = "Foco interno";
                at = at - 35;
                def = def - 18;
                ae = ae - 25;
                ve = ve - 22;
                megaactivada = false;
            }
            if(nombre.equals("Manectric")) {
                habilidad = "Pararrayos";
                def = def - 20;
                ae = ae - 30;
                dep = dep - 20;
                ve = ve - 30;
                megaactivada = false;
            }
            if(nombre.equals("Lopunny")) {
                tipos[1] = "Normal";
                habilidad = "Zoquete";
                at = at - 60;
                def = def - 10;
                ve = ve - 30;
                megaactivada = false;
            }
            if(nombre.equals("Gardevoir")) {
                habilidad = "Rastro";
                at = at - 20;
                ae = ae - 40;
                dep = dep - 20;
                ve = ve - 20;
                megaactivada = false;
            }
            if(nombre.equals("Gallade")) {
                habilidad = "Impasible";
                at = at - 40;
                def = def - 30;
                ve = ve - 30;
                megaactivada = false;
            }
            if(nombre.equals("Garchomp")) {
                habilidad = "Velo arena";
                at = at - 40;
                def = def - 20;
                ae = ae - 40;
                dep = dep - 10;
                ve = ve + 10;
                megaactivada = false;
            }
            if(nombre.equals("Altaria")) {
                tipos[1] = "Volador";
                habilidad = "Cura natural";
                at = at - 40;
                def = def - 20;
                ae = ae - 40;
                megaactivada = false;
            }
            if(nombre.equals("Charizard")) {
                tipos[1] = "Volador";
                habilidad = "Mar de llamas";
                at = at - 46;
                def = def - 33;
                ae = ae - 21;
                megaactivada = false;
            }
            if(nombre.equals("Gyarados")) {
                tipos[1] = "Volador";
                habilidad = "Intimidacion";
                at = at - 30;
                def = def - 30;
                ae = ae - 10;
                dep = dep - 30;
                megaactivada = false;
            }
            if(nombre.equals("Pidgeot")) {
                habilidad = "Vista lince";
                def = def - 5;
                ae = ae - 65;
                dep = dep - 10;
                ve = ve - 20;
                megaactivada = false;
            }
            if(nombre.equals("Alakazam")) {
                habilidad = "Foco interno";
                def = def - 20;
                ae = ae - 40;
                dep = dep - 10;
                ve = ve - 30;
                megaactivada = false;
            }
            if(nombre.equals("Venusaur")) {
                habilidad = "Espesura";
                at = at - 18;
                def = def - 40;
                ae = ae - 22;
                dep = dep - 20;
                megaactivada = false;
            }
            if(nombre.equals("Blastoise")) {
                habilidad = "Torrente";
                at = at - 20;
                def = def - 20;
                ae = ae - 50;
                dep = dep - 10;
                megaactivada = false;
            }
        }
    }
    
    public void Efecto(){
        if(!problemaestado.equals("Nada")){
            if (problemaestado.equals("Quemado")) {
                ps = ps - (ps/16);
                System.out.println(nombre+" pierde vida por la quemadura");
                System.out.println(nombre+" le queda "+ps+" de vida");
            }
            if (problemaestado.equals("Envenenado")) {
                ps = ps -(ps/8);
                System.out.println(nombre+" pierde vida por el envenamiento");
                System.out.println(nombre+" le queda "+ps+" de vida");
            }
        }
    }
    
    public String mostrar_pokemon(Pokemon pokedex){
         String  pokemon = new String("nombre:"+ pokedex.nombre
                    + "\n habilidad: " + pokedex.habilidad
                    + "\n tipo 1: " + pokedex.tipos[0]
                    + "\n tipo 2: " + pokedex.tipos[1]
                    + "\n set: " + pokedex.set[0]    
                    + "\n set: " + pokedex.set[1]    
                    + "\n set: " + pokedex.set[2]    
                    + "\n set: " + pokedex.set[3]    
                    + "\n stats: " + pokedex.ps
                    + "\n stats: " + pokedex.at
                    + "\n stats: " + pokedex.def
                    + "\n stats: " + pokedex.ae
                    + "\n stats: " + pokedex.dep
                    + "\n stats: " + pokedex.ve);    
         return pokemon;
    }
}