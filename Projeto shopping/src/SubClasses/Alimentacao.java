package SubClasses;

import Classes.Data;
import Classes.Endereco;
import Classes.Loja;

public class Alimentacao extends Loja {
    public Data dataAlvara;

    public Alimentacao(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data data, Data dataAlvara, int quantidadeMaximaProdutos){
        super(nome, QuantidadeFuncionarios, SalarioBaseFuncionario, endereco, data,quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getdataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Data Alvara: " + dataAlvara;
    }
}
