
package classededados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GeradorDeId {
    private int idContato = 0;
    private int idCategoria = 0;
    String arquivoIds = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\SistemaAgenda\\src\\arquivo\\ids.csv";
    
    FileReader frIds = null;
    BufferedReader brIds = null;
    
    public GeradorDeId(){
        try {
        frIds = new FileReader(arquivoIds);
        brIds = new BufferedReader(frIds);
        
        String linha = brIds.readLine();
        String vetorIds[] = linha.split(";");
        idContato = Integer.parseInt(vetorIds[0]);
        idCategoria = Integer.parseInt(vetorIds[1]);
        brIds.close();
        } catch (Exception e) {
        }
   
    }

    public int getIdContato() {
        return ++idContato;
    }

    public int getIdCategoria() {
        return ++idCategoria;
    }
    public void finalize() throws IOException{
        FileWriter fwIds = new FileWriter(arquivoIds,false);
        BufferedWriter bwIds = new BufferedWriter(fwIds);
        String saida = idContato+";"+idCategoria;
        bwIds.write(saida);
        bwIds.close();
    }

}
