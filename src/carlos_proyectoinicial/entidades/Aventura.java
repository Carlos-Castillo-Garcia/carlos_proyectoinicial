package carlos_proyectoinicial.entidades;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Aventura {

    Personaje prota = new Personaje();
    Personaje escudero = new Personaje("Sancho",3,2,3,1,1,3,1,1,2);
    Personaje consejero = new Personaje("Manolo",1,1,2,3,3,2,2,1,4);
    Personaje musico = new Personaje("Mozart",1,3,2,3,3,2,1,1,2);
    Personaje[] grupo = new Personaje[4];
    Prueba foso = new Prueba();
    

    public Aventura() {
    }

    public Aventura(Personaje prota) {
        this.prota = prota;
    }

    public void IniciarAventura() {
        CrearProta();
        CrearGrupo();
        Introduccion();
        SaltarFoso();
    }

    public int LanzarDado(int numeroDados) {
        int exitos = 0;
        for (int i = 0; i < numeroDados; i++) {
            int result = (int) (Math.random() * 10 + 1);
            if (result > 7) {
                exitos++;
            }
        }
        return exitos;
    }

    public void CrearProta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        prota.nombre = sc.nextLine();
        System.out.println("Fuerza: ");
        prota.fuerza = Integer.parseInt(sc.nextLine());
        System.out.println("Destreza: ");
        prota.destreza = Integer.parseInt(sc.nextLine());
        System.out.println("Constitucion: ");
        prota.constitucion = Integer.parseInt(sc.nextLine());
        System.out.println("Carisma: ");
        prota.carisma = Integer.parseInt(sc.nextLine());
        System.out.println("Manipulacion: ");
        prota.manipulacion = Integer.parseInt(sc.nextLine());
        System.out.println("Inteligencia: ");
        prota.inteligencia = Integer.parseInt(sc.nextLine());
        System.out.println("Astucia: ");
        prota.astucia = Integer.parseInt(sc.nextLine());
        System.out.println("Aplomo: ");
        prota.aplomo = Integer.parseInt(sc.nextLine());
    }
    
    public void CrearGrupo(){
        grupo[0] = prota;
        grupo[1] = escudero;
        grupo[2] = consejero;
        grupo[3] = musico;
    }

    public void Introduccion() {
        System.out.println("Estas con Gandalf cuando de repoente llegais a un puente con un foso.");
    }

    public void SaltarFoso() {
        for (int i = 0; i < grupo.length; i++) {
            System.out.println(grupo[i].nombre + " intenta saltar el foso.");
            if (LanzarDado(grupo[i].fuerza + grupo[i].destreza) >= foso.dificultad) {
                System.out.println(grupo[i].nombre + " salta el foso.");
            } else {
                System.out.println(grupo[i].nombre + " se cae al foso y sufre " + foso.daño + "puntos de vida");
                grupo[i].vida -= foso.daño;
                System.out.println("Le quedan "+grupo[i].vida + " puntos de vida");
            }
        }
    }

}
