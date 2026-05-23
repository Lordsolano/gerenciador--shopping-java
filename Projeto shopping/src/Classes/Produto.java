package Classes;

public class Produto {
    public String nome;
    public double preco;
    public Data DataValidade;


    public Produto(String nome, double preco, Data DataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.DataValidade = DataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public boolean EstaVencido(Data DataAtual){
        if(this.DataValidade.Ano < DataAtual.Ano ) {
            return true;
        }
        else if(this.DataValidade.Ano == DataAtual.Ano){
            return true;
        }
        if(this.DataValidade.Mes < DataAtual.Mes ) {
            return true;
        }
        else if(this.DataValidade.Mes == DataAtual.Mes){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return  "Nome: "+ nome +"\n"+
                "Preço: " + preco +"\n"+
                "Data: " + DataValidade;
    }
}
