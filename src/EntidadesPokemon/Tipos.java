package EntidadesPokemon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author CARLOS
 */
public class Tipos {
    private String[] nombre = new String[18];
    private double[][] tabladetipos = new double[18][18];

    public Tipos() throws IOException{
       inicializar();
    }

    public void eficacia(String tipomovimiento, String tipo1, String tipo2) {

    }
    public void inicializar() throws FileNotFoundException, IOException{
         File archivojson = new File("C:\\Users\\CARLOS\\Documents\\NetBeansProjects\\carlos_proyectoinicial\\src\\tipos.json");
        FileReader fr = new FileReader(archivojson);
        BufferedReader br = new BufferedReader(fr);
        String tipos = br.readLine();
        JSONObject json = new JSONObject(tipos);
        for (int i = 0; i < json.getJSONArray("tipos").length(); i++) {
            this.nombre[i] = json.getJSONArray("tipos").getJSONObject(i).getString("name");
            for (int j = 0; j < json.getJSONArray("tipos").getJSONObject(i).getJSONArray("tabla").getJSONObject(0).length(); j++) {
               this.tabladetipos[i][j] = json.getJSONArray("tipos").getJSONObject(i).getJSONArray("tabla").getJSONObject(0).getDouble("valor" + j);
            }
        }
    }
}
