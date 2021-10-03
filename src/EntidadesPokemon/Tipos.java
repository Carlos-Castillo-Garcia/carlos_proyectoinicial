package EntidadesPokemon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author CARLOS
 */
public class Tipos {

    private String[] nombre = new String[18];
    private double[][] tabladetipos = new double[18][18];

    public Tipos() {
        inicializar();
    }

    public double Eficacia(String tipomovimiento, String tipo1, String tipo2){
        int tipomov = 0;
        int t1 = 0;
        int t2 = 0;
        double efectividad = 0;
        
        for (int i = 0; i < nombre.length; i++) {
            if (nombre[i].equals(tipomovimiento)) {
                tipomov = i;
            }
            if (nombre[i].equals(tipo1)) {
                t1 = i;
            }
            if (nombre[i].equals(tipo2)) {
                t2 = i;
            }
        }
        
        if (!tipo1.equals(tipo2)) {
            efectividad = tabladetipos[tipomov][t1]*tabladetipos[tipomov][t2];
        }else{
            efectividad = tabladetipos[tipomov][t1];
        }
        
        return efectividad;
    }

    public void inicializar() {
        BufferedReader br = null;
        try {
            File archivojson = new File("C:\\Users\\CARLOS\\Documents\\NetBeansProjects\\carlos_proyectoinicial\\src\\Jsons\\tipos.json");
            FileReader fr = new FileReader(archivojson);
            br = new BufferedReader(fr);
            String tipos = br.readLine();
            JSONObject json = new JSONObject(tipos);
            for (int i = 0; i < json.getJSONArray("tipos").length(); i++) {
                this.nombre[i] = json.getJSONArray("tipos").getJSONObject(i).getString("name");
                for (int j = 0; j < json.getJSONArray("tipos").getJSONObject(i).getJSONArray("tabla").getJSONObject(0).length(); j++) {
                    this.tabladetipos[i][j] = json.getJSONArray("tipos").getJSONObject(i).getJSONArray("tabla").getJSONObject(0).getDouble("valor" + j);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tipos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tipos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Tipos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
