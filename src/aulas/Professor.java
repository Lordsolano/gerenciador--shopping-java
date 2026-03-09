package aulas;

public class Professor extends Pessoa {

    private int Salario;

    public Professor(String nome, String cpf, int salario) {  // quando criamos um atributo de uma classe que vai ser especifica dela não mandamos no super o atributo já que vai ser especifica
        super(nome, cpf);

    this.Salario = salario; // criamos o this normalmente no método construtor
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    public int getSalario() {
        return Salario;
    }
}
