package POO.exercicios.exercicio_8;

public class Caminhao extends Veiculos{
    private int Carga;

    public Caminhao(String marca, int ano, String cor, int Carga) {
        super(marca,ano,cor);
        this.Carga = Carga;
    }

}
