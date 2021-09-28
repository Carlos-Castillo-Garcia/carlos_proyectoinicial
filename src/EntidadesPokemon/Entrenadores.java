
package EntidadesPokemon;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Entrenadores {
    String nombre;
    Pokemon[] equipo = new Pokemon[6];

    public Entrenadores() {
    }

    public Entrenadores(String nombre) {
        this.nombre = nombre;
    }
}
