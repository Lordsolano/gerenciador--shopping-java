package SubClasses;

import Classes.Data;
import Classes.Endereco;
import Classes.Loja;

public class Cosmetico extends Loja {

    public double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, double taxaComercializacao, Data data, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios,salarioBaseFuncionario,endereco, data,quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
    @Override
    public String toString() {
        return super.toString() +
                " | Taxa de comercialização " + taxaComercializacao;
    }
}
