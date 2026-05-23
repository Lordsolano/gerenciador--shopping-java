package SubClasses;

import Classes.Data;
import Classes.Endereco;
import Classes.Loja;

public class Informatica extends Loja {
    public double seguroEletronicos;

    public Informatica(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome, QuantidadeFuncionarios, SalarioBaseFuncionario,endereco,data,quantidadeMaximaProdutos);
        this.seguroEletronicos = SalarioBaseFuncionario;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Seguro Eletronicos: " + seguroEletronicos;
    }
}
