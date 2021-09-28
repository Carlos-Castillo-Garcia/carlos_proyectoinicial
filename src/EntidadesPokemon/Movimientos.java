
package EntidadesPokemon;

/**
 *
 * @author Manuel
 */
public class Movimientos {
    private String nombre;
    private int dano;
    private int precision;
    private int pp;

    public Movimientos() {
    }

    public Movimientos(String nombre, int dano, int precision, int pp) {
        this.nombre = nombre;
        this.dano = dano;
        this.precision = precision;
        this.pp = pp;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * @return the precision
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * @return the pp
     */
    public int getPp() {
        return pp;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

    /**
     * @param precision the precision to set
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /**
     * @param pp the pp to set
     */
    public void setPp(int pp) {
        this.pp = pp;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "nombre=" + nombre + ", dano=" + dano + ", precision=" + precision + ", pp=" + pp + '}';
    }
    
    
}
