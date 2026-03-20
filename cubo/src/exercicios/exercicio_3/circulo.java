package exercicios.exercicio_3;

public class circulo
{
    //atributos
    private double raio;


    //construtor
    public circulo(double raio){
        this.raio = raio;
    }

    //métodos
    public double calculaArea(){
        return Math.PI * (raio * raio);
    }
    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }
}

