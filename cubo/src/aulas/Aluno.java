package aulas;

public class Aluno extends Pessoa implements Usuario{

    public Aluno(String nome, String cpf){
        super(nome,cpf);  // SUPER envia informações da super classe para outra classe
    }

    @Override
    public void CalcularPontos(int minutos){
        int pontos = minutos * 2;
        this.setPontos(pontos);

    }
    public String ImprimeSaudacao(){
        return "olá Aluno: " + this.getNome();
    }
}
