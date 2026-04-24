package Classes;

public class Loja {
    public String nome;
    public int QuantidadeFuncionarios;
    public double SalarioBaseFuncionario;

    public Loja(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario) {
        this.nome = nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.SalarioBaseFuncionario = -1;

    }
    public Loja(String nome, int QuantidadeFuncionarios) {
        this.nome = nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return QuantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        QuantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return SalarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        SalarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double GastosComSalario(){
        if(SalarioBaseFuncionario == -1){
            return -1;
        }
        return SalarioBaseFuncionario*QuantidadeFuncionarios;
    }
    public char TamanhodaLoja() {
        if (QuantidadeFuncionarios < 10) {
            return 'P';
        } else if (QuantidadeFuncionarios < 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}
