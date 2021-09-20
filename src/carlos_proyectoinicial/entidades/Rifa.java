/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos_proyectoinicial.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Rifa {

    String nombre;
    int[] carton = new int[5];
    int[] premiado = new int[5];
    public ArrayList db = new ArrayList();
    
    
    public Rifa(){
        
    }
    
    public Rifa(String nombre){
        this.nombre = nombre;
        for (int i = 0; i < carton.length; i++) {
            carton[i] = (int) (Math.random() * 100 + 1);
        }
    }
    
    public void IniciarRifa(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Añadir un jugado");
            System.out.println("2. Empezar rifa");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    AnadirJugador();
                    break;
                case 2:
                    ContarAciertos();
                    RepartirPremio();
                    break;
                default:
                    System.out.println("opcion erronea");
                    break;
            }
        } while (true);
        
    }
    
    public void AnadirJugador(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Como te llamas");
        String nombreAuxiliar = sc.nextLine();

        db.add(new Rifa(nombreAuxiliar));
    }
    
    public void GenerarPremiado(){
        for (int i = 0; i < premiado.length; i++) {
            premiado[i] = (int) (Math.random() * 100 + 1);
        }
    }
    
    public void ContarAciertos(){
        for (int i = 0; i < premiado.length; i++) {
            for (int j = 0; j < db.size(); j++) {
                for (int k = 0; k < 6; k++) {
                    
                }
            }
        }
    }
    
    public void RepartirPremio(){
        
    }

//    /**
//     * @return the nombre
//     */
//    public String getNombre() {
//        return nombre;
//    }
//
//    /**
//     * @return the carton
//     */
//    public int[] getCarton() {
//        return carton;
//    }
//
//    /**
//     * @param nombre the nombre to set
//     */
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    /**
//     * @param carton the carton to set
//     */
//    public void setCarton(int[] carton) {
//        this.carton = carton;
//    }
}
