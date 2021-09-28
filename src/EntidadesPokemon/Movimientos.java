
package EntidadesPokemon;

/**
 *
 * @author Manuel
 */
public class Movimientos {
    String nombre;
    int dano;
    int precision;
    int pp;

    public Movimientos() {
    }

    public Movimientos(String nombre, int dano, int precision, int pp) {
        this.nombre = nombre;
        this.dano = dano;
        this.precision = precision;
        this.pp = pp;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "nombre=" + nombre + ", dano=" + dano + ", precision=" + precision + ", pp=" + pp + '}';
    }
    
    
}
