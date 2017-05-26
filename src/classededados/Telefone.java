package classededados;

public class Telefone {
    private int idContato =0;
    private int ddi = 0;
    private int ddd =0;
    private int numero = 0;
    //enum tipo
    
    public Telefone(){};
    public Telefone(int idContato, int ddi, int ddd, int numero){
        this.idContato = idContato;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) throws Exception{
        
        this.ddi = ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
      
    
}
