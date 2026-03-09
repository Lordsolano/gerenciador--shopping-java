package exercicios.exercicio_8;

public class Moto extends Veiculos{
    private int rodas;

    public Moto(int rodas,String Marca,int Ano,String cor){
        super(Marca,Ano,cor);
        this.rodas = rodas;
    }
}
