
package carlos_proyectoinicial.entidades;

/**
 *
 * @author Manuel
 */
public class Personaje {
    
    String nombre;
    int fuerza, destreza, constitucion;
    int carisma, manipulacion, compostura;
    int inteligencia, astucia, aplomo;
    int vida;

    public Personaje() {
    }

    public Personaje(String nombre, int fuerza, int destreza, int constitucion, int carisma, int manipulacion, int compostura, int inteligencia, int astucia, int aplomo) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.carisma = carisma;
        this.manipulacion = manipulacion;
        this.compostura = compostura;
        this.inteligencia = inteligencia;
        this.astucia = astucia;
        this.aplomo = aplomo;
        this.vida = 5+constitucion;
    }
    
    
}
