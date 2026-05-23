package SubClasses;

import Classes.Data;
import Classes.Loja;
import Classes.Endereco;

public class Vestuario extends Loja {
    public boolean produtosImportados;

    public Vestuario(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome,QuantidadeFuncionarios,SalarioBaseFuncionario,endereco, data,quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    @Override
    public String toString() {
        return super.toString() +
                " | Produtos Importados " + produtosImportados;
    }
}
