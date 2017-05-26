
package classededados;

public class Endereco {
    private int idContato = 0;
    private String logradouro = "";
    private int numero = 0;
    private int cep = 0;
    private String bairro = "";
    private String cidade = "";
    private String estado = "";
    private String pais = "";
    private String complemento = "";
    // enumeração tipo
    
    public Endereco(){};
    public Endereco(int idContato, String logradouro, int numero, int cep, String bairro, String cidade, String estado, String pais, String complemento){
            this.idContato = idContato;
            this.logradouro = logradouro;
            this.numero = numero;
            this.cep = cep;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.pais = pais;
            this.complemento = complemento;
    };

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
