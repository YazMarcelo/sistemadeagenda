package persistencia;

import classededados.Categoria;
import classededados.Contato;
import classededados.Email;
import classededados.Endereco;
import classededados.Telefone;
import interfaces.CRUD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class ContatoDAO implements CRUD{
    String arquivoTelefone = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\SistemaAgenda\\src\\arquivo\\Telefone.csv";
    String arquivoContato = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\SistemaAgenda\\src\\arquivo\\Contato.csv";
    String arquivoEmail = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\SistemaAgenda\\src\\arquivo\\Email.csv";
    String arquivoEndereco = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\SistemaAgenda\\src\\arquivo\\Endereco.csv";
    String arquivoCategoria = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\SistemaAgenda\\src\\arquivo\\Categoria.csv";
    
    
    
    @Override
    public void incluir(Object objeto) throws Exception {
        Contato objContato = (Contato)(objeto);
        
        
        FileWriter fileTelefone = null;
        BufferedWriter bufferTelefone = null;
        FileWriter fileContato = null;
        BufferedWriter bufferContato = null;
        FileWriter fileEmail = null;
        BufferedWriter bufferEmail = null;
        FileWriter fileEndereco = null;
        BufferedWriter bufferEndereco = null;

        try {
           fileTelefone = new FileWriter(arquivoTelefone, true);
           bufferTelefone = new BufferedWriter(fileTelefone);
           
           fileContato = new FileWriter(arquivoContato, true);
           bufferContato = new BufferedWriter(fileContato);
           
           fileEmail = new FileWriter(arquivoEmail, true);
           bufferEmail = new BufferedWriter(fileEmail);
           
           fileEndereco = new FileWriter(arquivoEndereco, true);
           bufferEndereco = new BufferedWriter(fileEndereco);
           
           String aux1 = objContato.getId()+","+objContato.getNome()+"\n";
           bufferContato.write(aux1);
            ArrayList<Telefone> telefones = objContato.getTelefones();     
            ArrayList<Email> emails = objContato.getEmail();     
            ArrayList<Endereco> enderecos = objContato.getEndereco();
            
            
            
            for(int pos = 0; pos < emails.size(); pos++){
                aux1 = emails.get(pos).getIdContato() + "," + 
                        emails.get(pos).getEmail()+ "\n";      
                bufferEmail.write(aux1);  
            }
            aux1 = "";
            if(enderecos != null){
            for(int pos = 0; pos < enderecos.size(); pos++){
                aux1 = enderecos.get(pos).getIdContato() + "," + 
                        enderecos.get(pos).getLogradouro() + "," +
                        enderecos.get(pos).getNumero() + "," +
                        enderecos.get(pos).getCep() + "," +
                        enderecos.get(pos).getBairro() + "," +
                        enderecos.get(pos).getCidade() + "," +
                        enderecos.get(pos).getEstado() + "," +
                        enderecos.get(pos).getPais() + "," +
                        enderecos.get(pos).getComplemento() + "\n";
                
                bufferEndereco.write(aux1);         
            }
            }
            aux1 = "";
            for(int pos = 0; pos < telefones.size(); pos++){
                aux1 = telefones.get(pos).getIdContato() + "," + 
                        telefones.get(pos).getDdi() + "," +
                        telefones.get(pos).getDdd() + "," +
                        telefones.get(pos).getNumero() + "\n";
                
                bufferTelefone.write(aux1);
                
            }
        } catch (Exception erro) {
            throw erro;
        }finally{
            if (bufferEmail != null) bufferEmail.close();
            if (bufferEndereco != null) bufferEndereco.close();
            if (bufferTelefone != null) bufferTelefone.close();
            if (bufferContato != null) bufferContato.close();
           
        }
    }
    
    @Override
    public void incluirCategoria(Object objeto) throws Exception {
        Categoria objCategoria = (Categoria)(objeto);
        FileWriter fileCategoria = null;
        BufferedWriter bufferCategoria = null;
        
        try {
            fileCategoria = new FileWriter(arquivoCategoria, true);
           bufferCategoria = new BufferedWriter(fileCategoria);
           
           
           String aux = objCategoria.getId()+","+objCategoria.getDescricao()+","+objCategoria.getCor()+"\n";
           bufferCategoria.write(aux);
        } catch (Exception e) {
        }finally{
             if (bufferCategoria != null) bufferCategoria.close();
        }
    }

    @Override
    public ArrayList<String> recuperar() throws Exception {
    try {
            ArrayList<Contato> listaDeContatos = new ArrayList<Contato>();
            ArrayList<Telefone> listaDeTelefones = new ArrayList<Telefone>();
            ArrayList<String> listaGeral = new ArrayList<>();
            Contato objetoContato = null;
            Telefone objTelefone = null;
            
            
            
    FileReader fr = new FileReader(arquivoContato);
    BufferedReader br = new BufferedReader(fr);
    String linha = "";
    FileReader frTelefone = new FileReader(arquivoTelefone);
    BufferedReader brTelefone = new BufferedReader(frTelefone);
    
    
    while((linha=br.readLine())!= null){
        String vector[] = linha.split(";");
        objetoContato = new Contato();
        objetoContato.setId(Integer.parseInt(vector[0]));
        objetoContato.setNome(vector[1]);
       listaGeral.add(String.valueOf(objetoContato));
    }
    br.close();
    
   String linha2= "";
        while((linha2=br.readLine())!= null){
        String vector2[] = linha2.split(";");
        objTelefone = new Telefone();
        
        objTelefone.setIdContato(Integer.parseInt(vector2[0]));
        objTelefone.setDdi(Integer.parseInt(vector2[1]));
        objTelefone.setDdd(Integer.parseInt(vector2[2]));
        objTelefone.setNumero(Integer.parseInt(vector2[3]));
        
    //    String numero = "+"+objTelefone.getDdi()+"("+objTelefone.getDdd()+")"+objTelefone.getNumero();
        if((objTelefone.getIdContato()) == (objetoContato.getId())){
        listaGeral.add(String.valueOf(objTelefone));
        }
    }
        return listaGeral;
        } catch (Exception erro) {
            throw erro;
        }
    }           
    
}
