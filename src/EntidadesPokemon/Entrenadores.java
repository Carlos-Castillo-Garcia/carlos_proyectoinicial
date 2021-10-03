
package EntidadesPokemon;

import java.util.ArrayList;


/**
 *
 * @author Manuel
 */
public class Entrenadores {
    String nombre;
    ArrayList<Pokemon> equipo = new ArrayList<Pokemon>();
    int megas;

    public Entrenadores() {
        megas = 1;
    }

    public Entrenadores(String nombre, ArrayList<Pokemon> equipo, int megas) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.megas = megas;
    }
}
