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
                
            }
            if(nombre.equals("Blaziken")) {
                habilidad = "Impulso";
                at = at + 40;
                def = def + 10;
                ae = ae + 20;
                dep = dep + 10;
                ve = ve + 20;
            }
            if(nombre.equals("Tyranitar")) {
                habilidad = "Chorro arena";
                at = at + 30;
                def = def + 40;
                dep = dep + 20;
                ve = ve + 10;
            }
            if(nombre.equals("Salamence")) {
                habilidad = "Piel celeste";
                at = at + 10;
                def = def + 50;
                ae = ae + 10;
                dep = dep + 10;
                ve = ve + 20;
            }
            if(nombre.equals("Mawile")) {
                habilidad = "Potencia";
                at = at + 20;
                def = def + 40;
                dep = dep + 40;
            }
            if(nombre.equals("Lucario")) {
                habilidad = "Adaptable";
                at = at + 35;
                def = def + 18;
                ae = ae + 25;
                ve = ve + 22;
            }
            if(nombre.equals("Manectric")) {
                habilidad = "Intimidacion";
                def = def + 20;
                ae = ae + 30;
                dep = dep + 20;
                ve = ve + 30;
            }
            if(nombre.equals("Lopunny")) {
                tipos[1] = "Lucha";
                habilidad = "Intrepido";
                at = at + 60;
                def = def + 10;
                ve = ve + 30;
            }
            if(nombre.equals("Gardevoir")) {
                habilidad = "Piel feerica";
                at = at + 20;
                ae = ae + 40;
                dep = dep + 20;
                ve = ve + 20;
            }
            if(nombre.equals("Gallade")) {
                habilidad = "Foco interno";
                at = at + 40;
                def = def + 30;
                ve = ve + 30;
            }
            if(nombre.equals("Garchomp")) {
                habilidad = "Poder arena";
                at = at + 40;
                def = def + 20;
                ae = ae + 40;
                dep = dep + 10;
                ve = ve - 10;
            }
            if(nombre.equals("Altaria")) {
                tipos[1] = "Hada";
                habilidad = "Piel feerica";
                at = at + 40;
                def = def + 20;
                ae = ae + 40;
            }
            if(nombre.equals("Charizard")) {
                tipos[1] = "Dragon";
                habilidad = "Garra dura";
                at = at + 46;
                def = def + 33;
                ae = ae + 21;
            }
            if(nombre.equals("Gyarados")) {
                tipos[1] = "siniestro";
                habilidad = "Rompemoldes";
                at = at + 30;
                def = def + 30;
                ae = ae + 10;
                dep = dep + 30;
            }
            if(nombre.equals("Pidgeot")) {
                habilidad = "Indefenso";
                def = def + 5;
                ae = ae + 65;
                dep = dep + 10;
                ve = ve + 20;
            }
            if(nombre.equals("Alakazam")) {
                habilidad = "Rasto";
                def = def + 20;
                ae = ae + 40;
                dep = dep + 10;
                ve = ve + 30;
            }
            if(nombre.equals("Venusaur")) {
                habilidad = "Sebo";
                at = at + 18;
                def = def + 40;
                ae = ae + 22;
                dep = dep + 20;
            }
            if(nombre.equals("Blastoise")) {
                habilidad = "Megadisparador";
                at = at + 20;
                def = def + 20;
                ae = ae + 50;
                dep = dep + 10;
            }
            
            System.out.println("Tu "+nombre+" a megaevolucionado a mega-"+nombre);
        }
    }
    
    public void Problemaestado(String efecto){
        if ((int) Math.random()*10 == 1) {
            problemaestado = efecto;
            System.out.println(nombre+" esta "+ efecto);
        }
        
    }
    
    public void Efecto(){
        if(!problemaestado.equals("Nada")){
            if (problemaestado.equals("Quemadura")) {
                ps = ps - (ps/16);
            }
            if (problemaestado.equals("Envenenado")) {
                ps = ps -(ps/8);
            }
        }
    }
    
    
}