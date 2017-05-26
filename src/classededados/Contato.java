package classededados; 

import java.util.ArrayList;

public class Contato {
    private int id = 0;
    private String nome = "";
    private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    private ArrayList<Telefone> telefones = new ArrayList<Telefone>();
    private ArrayList<Email> emails = new ArrayList<Email>();
    private ArrayList<Endereco> endereco = new ArrayList<Endereco>();
    
    public Contato(){};
    public Contato(int id, String nome, ArrayList<Telefone> telefones, ArrayList<Email> emails/*, ArrayList<Endereco> endereco*/){
    this.id = id;
    this.nome = nome;
    this.telefones = telefones;
    this.emails = emails;
    //this.endereco = endereco;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeCompleto) {
        this.nome = nomeCompleto;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public ArrayList<Email> getEmail() {
        return emails;
    }

    public void setEmail(ArrayList<Email> emails) {
        this.emails = emails;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    
}
