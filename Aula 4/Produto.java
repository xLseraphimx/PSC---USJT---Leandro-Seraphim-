public class Produto{

    private String Nome;
    private Double Preço;
    private int Quantidade;

    public Produto(String n, double p, int q){

        this.Nome = n;
        this.Preço = p;
        this.Quantidade = q;
    }
    public String getNome(){
        return Nome;
    }

    public Double getPreço(){
        return Preço;
    }

    public int getQuantidade(){
        return Quantidade;
    }
    
    public void setNome(String n){
       Nome = n;
    }

    public void setPreço(double p){
        Preço = p;
    }

    public void setQuantidade(int q){
        Quantidade = q;
    }
}
