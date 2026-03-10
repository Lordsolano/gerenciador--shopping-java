package aulas;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private int pontos;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

   /* public void CalcularPontos(int minutos){
        this.pontos += minutos * 2}
    */
    public void setPontos(int pontos) {
        this.pontos += pontos;
    }

    public abstract void CalcularPontos(int minutos);
}
