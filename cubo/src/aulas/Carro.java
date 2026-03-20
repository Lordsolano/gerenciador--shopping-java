package aulas;

public class Carro {

    private String modelo;
    private String marca;
    public String cor;
    private int ano;
    private boolean ligado;
    private int aceleracao;
    private int idade;

    public Carro(String modelo, String marca, String cor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false;
        this.aceleracao = 0;
        this.setIdade();

    }

    public void ligar() {
        if (this.ligado == true) {
            return;
        }
        this.ligado = true;
    }

    public void desligar() {
        if (!this.ligado){
            return;
        }
        this.aceleracao = 0;
        this.ligado = false;
    }
    public void acelerar(String tipoaceleracao)
    {
        switch (tipoaceleracao) {
            case "forte":
                this.aceleracao += 1000;
                break;
            case "fraca":
                this.aceleracao += 500;
                break;
            default:
                this.aceleracao += 750;
                break;
        }
    }

    public String getModelo()
    {
        return modelo;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public int getAno()
    {
        return ano;
    }

    public boolean getLigado()
    {
        return ligado;

    }

    public int getAceleracao()
    {
        return aceleracao;
    }

    private void setIdade(){
        this.idade = this.ano - 2023;
    }

    public int getIdade(){
        return idade;
    }
}
