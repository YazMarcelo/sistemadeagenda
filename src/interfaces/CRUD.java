package interfaces;

import classededados.Contato;
import java.util.ArrayList;

public interface CRUD {
    void incluir(Object objeto)throws Exception;
    void incluirCategoria(Object objeto)throws Exception;
    public ArrayList<String> recuperar()throws Exception;
    
}
