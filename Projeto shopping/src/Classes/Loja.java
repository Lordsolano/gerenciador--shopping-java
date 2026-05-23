package Classes;

public class Loja {
    public String nome;
    public int quantidadeFuncionarios;
    public double salarioBaseFuncionario;
    public Endereco endereco;
    public Data data;
    public Produto estoqueProdutos[];


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.data = data;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];

    }

    public Loja(String nome, int quantidadeFuncionarios, int quantidadeMaximaProdutos, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        endereco = endereco;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double GastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return salarioBaseFuncionario * quantidadeFuncionarios;
    }

    public char TamanhodaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos() {
        String produtos = "";
        for (int i = 0; i < estoqueProdutos.length; i++) {
            produtos += estoqueProdutos[i] + " ";
        }
        System.out.println(produtos);
    }

    public boolean insereProduto(Produto Produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = Produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nome) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nome)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String produtos = "";
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                produtos += estoqueProdutos[i] + " ";
            }
        }
        return "Nome: " + nome + "\n" +
                "Quantidade de Funcionarios: " + quantidadeFuncionarios + "\n" +
                "Sálario base:\n " + salarioBaseFuncionario + "\n" +
                "Endereço\n " + endereco + "\n" +
                "Data: " + data + "\n" +
                "Estoque de Produtos: " + produtos;


    }
}
