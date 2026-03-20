package exercicios.exercicio_1;

//1. Orientação a Objetos
//Exercício: Crie uma classe Carro com atributos como modelo, ano e cor.
//Implemente métodos para mudar a cor e obter o modelo do carro.

public class carro {

    public String modelo;
    public int ano;
    public String cor;

    public carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
}
