package SubClasses;

import Classes.Data;
import Classes.Endereco;
import Classes.Loja;

public class Bijuteria extends Loja{
    public double metaVendas;
    public Bijuteria(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data data, double metaVendas,int quantidadeMaximaProdutos ) {
        super(nome, QuantidadeFuncionarios, SalarioBaseFuncionario, endereco, data,quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    @Override
    public String toString() {
        return super.toString() +
                " | Meta vendas " + metaVendas;
    }
}
