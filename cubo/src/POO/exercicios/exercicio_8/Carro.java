package POO.exercicios.exercicio_8;

public class Carro extends Veiculos{
    private int Portas;

    public Carro(String marca, int ano, String cor, int Portas) {
        super(marca,ano,cor);
        this.Portas = Portas;
    }
}
