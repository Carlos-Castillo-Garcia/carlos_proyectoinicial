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
    int numeroaciertos = 0;
    ArrayList<Rifa> basedatos;
    
    
    public Rifa(){
        
    }
    
    public Rifa(String nombre){
        this.nombre = nombre;
        for (int i = 0; i < this.carton.length; i++) {
            this.carton[i] = (int) (Math.random() * 100 + 1);
        }
    }
    
    public void IniciarRifa(){
        int opcion;
        basedatos = new ArrayList<>();
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
                    GenerarPremiado();
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

        basedatos.add(new Rifa(nombreAuxiliar));
    }
    
    public void GenerarPremiado(){
        for (int i = 0; i < premiado.length; i++) {
            premiado[i] = (int) (Math.random() * 100 + 1);
        }
    }
    
    public void ContarAciertos(){
        for (int i = 0; i < basedatos.size(); i++) {
            for (int j = 0; j < basedatos.get(i).carton.length; j++) {
                for (int k = 0; k < premiado.length; k++) {
                    if (basedatos.get(i).carton[j]==premiado[k]) {
                        basedatos.get(i).numeroaciertos++;
                    }
                }
            }
        }
    }
    
    public void RepartirPremio(){
        int aciertostotales = 0;
        for (int i = 0; i < basedatos.size(); i++) {
            aciertostotales = aciertostotales + basedatos.get(i).numeroaciertos;
        }
        if (aciertostotales==0) {
            aciertostotales=1;
        }
        for (int i = 0; i < basedatos.size(); i++) {
            System.out.println("jugador: "+basedatos.get(i).nombre);
            System.out.println("acierto: "+basedatos.get(i).numeroaciertos);
            System.out.println("premio ganado: "+((basedatos.get(i).numeroaciertos*(basedatos.size()*10))/aciertostotales));
        }
    }
}
