/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos_proyectoinicial;

import EntidadesPokemon.AventuraPokemon;
import carlos_proyectoinicial.entidades.Aventura;
import carlos_proyectoinicial.entidades.Rifa;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_string = new Scanner(System.in);
        Rifa acceso = new Rifa();
        Aventura aventura = new Aventura();
        AventuraPokemon inicio = new AventuraPokemon();
        int opcion = 0;
              
        do{
            System.out.println("Elija una de las opciones");
            System.out.println("1. Deseo jugar a la rifa");
            System.out.println("2. Deseo jugar a la aventura");
            System.out.println("3. Deseo jugar a la aventura Pokemon");
            System.out.println("4. Deseo salir del progama");
            opcion = sc_int.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("juego de la rifa");
                    acceso.IniciarRifa();
                    break;
                case 2:
                    System.out.println("juego de la aventura");
                    aventura.IniciarAventura();
                    break;
                case 3:
                    System.out.println("Juego de la aventura Pokemon\n");
                    inicio.InicioAventura();
                case 4:
                    System.out.println("Muchas gracias por entrar, adios");
                    break;
                default:
                    System.out.println("Elija otra opcion");
                    break;
            }
            
        }while(opcion != 3);
        
        
    }
    
}
