package EntidadesPokemon;

/**
 *
 * @author Manuel
 */
public class Movimientos {

    String nombre;
    String tipo;
    int precision;
    int pp;
    int ppiniciales;

    public Movimientos() {
    }

    public Movimientos(String nombre, String tipo, int precision, int pp, int ppiniciales) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precision = precision;
        this.pp = pp;
        this.ppiniciales = ppiniciales;
    }

    public void ataque(Pokemon atacante, Pokemon defensor) {
        int daño = 0;
        Tipos tipos = new Tipos();

        switch (nombre) {
            case "hoja aguda":
                System.out.println(atacante.nombre + " a usado Hoja aguda");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 90) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "puntada sombria":
                System.out.println(atacante.nombre + " a usado Puntada sombria");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 80) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "sintesis":
                System.out.println(atacante.nombre + " a usado sintesis");
                atacante.ps = atacante.ps + (atacante.psiniciales / 2);
                if (atacante.ps > atacante.psiniciales) {
                    atacante.ps = atacante.psiniciales;
                }
                System.out.println(atacante.nombre + " a recuperado vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                pp--;
                break;
            case "puño meteoro":
                System.out.println(atacante.nombre + " a usado Puño meteoro");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 90) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "cabezazo zen":
                System.out.println(atacante.nombre + " a usado cabezazo zen");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 80) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "puño hielo":
                System.out.println(atacante.nombre + " a usado puño hielo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 80) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "envite igneo":
                System.out.println(atacante.nombre + " a usado envite igneo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 120) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    System.out.println(atacante.nombre + " tambien pierde vida");
                    atacante.ps = atacante.ps - (daño / 3);
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "colmillo igneo":
                System.out.println(atacante.nombre + " a usado colmillo igneo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 65) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "fuego fatuo":
                System.out.println(atacante.nombre + " a usado fuego fatuo");
                if (!defensor.tipos[0].equals("fuego") && !defensor.tipos[1].equals("fuego")) {
                    if (precision > (int) ((Math.random() * 100) + 1)) {
                        defensor.Problemaestado("Quemado");
                        pp--;
                    } else {
                        System.out.println(atacante.nombre + " a fallado");
                    }
                } else {
                    System.out.println(defensor.nombre + " no le afecta");
                }
                break;
            case "enfado":
                System.out.println(atacante.nombre + " a usado enfado");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 90) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "abocajarro":
                System.out.println(atacante.nombre + " a usado a bocajarro");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 90) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "toxico":
                System.out.println(atacante.nombre + " a usado toxico");
                if (!defensor.tipos[0].equals("veneno") && !defensor.tipos[1].equals("veneno") && !defensor.tipos[0].equals("acero") && !defensor.tipos[1].equals("acero")) {
                    if (precision > (int) ((Math.random() * 100) + 1)) {
                        defensor.Problemaestado("Envenenado");
                        System.out.println(defensor.nombre + " se a envenenado");
                        pp--;
                    } else {
                        System.out.println(atacante.nombre + " a fallado");
                    }
                } else {
                    System.out.println(defensor.nombre + " no le afecta");
                }
                break;
            case "hidrobomba":
                System.out.println(atacante.nombre + " a usado hidrobomba");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 110) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "rayo hielo":
                System.out.println(atacante.nombre + " a usado rayo hielo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "gota vital":
                System.out.println(atacante.nombre + " a usado gota vital");
                atacante.ps = atacante.ps + (atacante.psiniciales / 4);
                if (atacante.ps > atacante.psiniciales) {
                    atacante.ps = atacante.psiniciales;
                    pp--;
                }
                System.out.println(atacante.nombre + " a recuperado vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "terremoto":
                System.out.println(atacante.nombre + " a usado terremoto");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 100) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "triturar":
                System.out.println(atacante.nombre + " a usado triturar");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 80) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "arena ardiente":
                System.out.println(atacante.nombre + " a usado arena ardiente");
                if (!defensor.tipos[0].equals("Fuego") && !defensor.tipos[1].equals("Fuego")) {
                    if (precision > (int) ((Math.random() * 100) + 1)) {
                        defensor.Problemaestado("Quemado");
                        System.out.println(defensor.nombre + " se a quemado");
                        pp--;
                    } else {
                        System.out.println(atacante.nombre + " a fallado");
                    }
                } else {
                    System.out.println(defensor.nombre + " no le afecta");
                }
                break;
            case "doble filo":
                System.out.println(atacante.nombre + " a usado doble filo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 120) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    System.out.println(atacante.nombre + " tambien pierde vida");
                    atacante.ps = atacante.ps - (daño / 4);
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "golpe cabeza":
                System.out.println(atacante.nombre + " a usado golpe cabeza");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 70) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "relajo":
                System.out.println(atacante.nombre + " a usado relajo");
                atacante.ps = atacante.ps + (atacante.psiniciales / 2);
                if (atacante.ps > atacante.psiniciales) {
                    atacante.ps = atacante.psiniciales;
                    pp--;
                }
                System.out.println(atacante.nombre + " a recuperado vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "roca afilada":
                System.out.println(atacante.nombre + " a usado roca afilada");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 100) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "tajo aereo":
                System.out.println(atacante.nombre + " a usado tajo aereo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 75) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "respiro":
                System.out.println(atacante.nombre + " a usado respiro");
                atacante.ps = atacante.ps + (atacante.psiniciales / 2);
                if (atacante.ps > atacante.psiniciales) {
                    atacante.ps = atacante.psiniciales;
                    pp--;
                }
                System.out.println(atacante.nombre + " a recuperado vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "cascada":
                System.out.println(atacante.nombre + " a usado cascada");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 80) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "carantoña":
                System.out.println(atacante.nombre + " a usado carantoña");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 90) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "gigadrenado":
                System.out.println(atacante.nombre + " a usado gigadrenado");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 75) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    System.out.println(atacante.nombre + " recupera vida");
                    atacante.ps = atacante.ps + (daño / 2);
                    if (atacante.ps > atacante.psiniciales) {
                        atacante.ps = atacante.psiniciales;
                    }
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "brillo magico":
                System.out.println(atacante.nombre + " a usado brillo magico");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 80) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "vozarron":
                System.out.println(atacante.nombre + " a usado vozarron");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "zumbido":
                System.out.println(atacante.nombre + " a usado zumbido");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "polvo veneno":
                System.out.println(atacante.nombre + " a usado polvo veneno");
                if (!defensor.tipos[0].equals("veneno") && !defensor.tipos[1].equals("veneno") && !defensor.tipos[0].equals("acero") && !defensor.tipos[1].equals("acero")) {
                    if (precision > (int) ((Math.random() * 100) + 1)) {
                        defensor.Problemaestado("Envenenado");
                        System.out.println(defensor.nombre + " se a envenenado");
                        pp--;
                    } else {
                        System.out.println(atacante.nombre + " a fallado");
                    }
                } else {
                    System.out.println(defensor.nombre + " no le afecta");
                }
                break;
            case "pajaro osado":
                System.out.println(atacante.nombre + " a usado Pajaro osado");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 120) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    System.out.println(atacante.nombre + " tambien pierde vida");
                    atacante.ps = atacante.ps - (daño / 3);
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "rayo":
                System.out.println(atacante.nombre + " a usado rayo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "trueno":
                System.out.println(atacante.nombre + " a usado Trueno");
                System.out.println("trueno salta al campo de batalla y se pone a cantar la salamandra");
                System.out.println("trueno: cojo el telefono me llama alejandra");
                System.out.println("trueno: dice que le meta la salamandra");
                System.out.println("seguridad consigue sacar a trueno de campo de combate y se reanuda el combate");
                System.out.println(atacante.nombre + " a usado Trueno");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 110) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "voltio cruel":
                System.out.println(atacante.nombre + " a usado voltio cruel");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 90) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    System.out.println(atacante.nombre + " tambien pierde vida");
                    atacante.ps = atacante.ps - (daño / 4);
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                System.out.println(atacante.nombre + " tiene " + atacante.ps + " puntos de vida");
                break;
            case "lanzallamas":
                System.out.println(atacante.nombre + " a usado lanzallamas");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "tierra viva":
                System.out.println(atacante.nombre + " a usado tierra viva");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "psiquico":
                System.out.println(atacante.nombre + " a usado tierra viva");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "joya de luz":
                System.out.println(atacante.nombre + " a usado tierra viva");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 80) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "pulso dragon":
                System.out.println(atacante.nombre + " a usado Pulso dragon");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 85) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "foco resplandor":
                System.out.println(atacante.nombre + " a usado foco resplandor");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 80) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "tijera x":
                System.out.println(atacante.nombre + " a usado tijera x");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.at * 80) / 25 * defensor.def) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
            case "bomba lodo":
                System.out.println(atacante.nombre + " a usado bomba lodo");
                if (precision > (int) ((Math.random() * 100) + 1)) {
                    daño = (int) (0.01 * tipos.Eficacia(tipo, defensor.tipos[0], defensor.tipos[1]) * (((0.2 + 1) * atacante.ae * 90) / 25 * defensor.dep) + 2);
                    System.out.println(defensor.nombre + " pierde " + daño + " puntos de vida");
                    defensor.ps = defensor.ps - daño;
                    pp--;
                } else {
                    System.out.println(atacante.nombre + " a fallado");
                }
                System.out.println(defensor.nombre + " tiene " + defensor.ps + " puntos de vida");
                break;
        }
    }
}
