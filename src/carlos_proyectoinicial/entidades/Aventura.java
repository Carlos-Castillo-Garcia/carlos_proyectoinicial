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
    Personaje villano = new Personaje("Voldemnort",4,4,5,5,5,3,3,3,5);
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
        PeleaMuerte(prota, musico);
        PeleaGrupo(grupo, villano);
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
        prota.vida = 5+prota.constitucion;
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
    
    public void PeleaMuerte(Personaje personaje1, Personaje personaje2){
        System.out.println("\n"+personaje1.nombre + " se va a pelear con " + personaje2.nombre);
        while (personaje1.vida > 0 && personaje2.vida > 0) {            
            if (personaje1.vida>0) {
                Golpear(personaje1, personaje2);
            }
            if (personaje2.vida>0) {
                Golpear(personaje2, personaje1);
            }
        }
        if (personaje1.vida>0 && personaje2.vida<=0) {
            System.out.println("\n" + personaje1.nombre+" ha ganado la pelea");
        }else if(personaje2.vida>0 && personaje1.vida<=0){
            System.out.println("\n" + personaje2.nombre+" ha ganado la pelea");
        }
    }

    public void PeleaGrupo(Personaje[] grupo, Personaje enemigo){
        System.out.println("\nEl grupo de aventureros se enfrenta a "+ enemigo.nombre);
        int target = grupo.length;
        while(grupo[0].vida >0 && enemigo.vida>0){
            for (int i = 0; i < grupo.length; i++) {
                if (grupo[i].vida>0) {
                    Golpear(grupo[i], enemigo);
                }
            }
            if(enemigo.vida>0){
                Golpear(enemigo, grupo[target]);
                if (grupo[target].vida<0) {
                    target--;
                }
            }
        }
        if(enemigo.vida <= 0){
            System.out.println("\n El grupo a vencido la pelea");
        }else{
            System.out.println("\n El grupo a perdido la pelea");
        }
    }
    
    public void Golpear(Personaje atacante, Personaje defensor){
      int dano = LanzarDado(atacante.fuerza+atacante.destreza - defensor.astucia);
      defensor.vida -=dano;
      System.out.println("\n" + atacante.nombre + " golpea a " + defensor.nombre + " causando " + dano + " de daño");
      System.out.println("\n" + defensor.nombre + " le quedan " + defensor.vida + " de vida");
    }
}
