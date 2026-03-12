package aulas;

public class Professor extends Pessoa implements Usuario {

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

    @Override
    public void CalcularPontos(int minutos) {
        int pontos = minutos * 3;
        this.setPontos(pontos);
    }

    public String ImprimirSaudacao(){
        return "olá professor: " + this.getNome();
    }
}
