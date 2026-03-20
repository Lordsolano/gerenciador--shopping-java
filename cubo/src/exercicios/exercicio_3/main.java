package exercicios.exercicio_3;

public class main
{
    public static void main(String[] args)
    {
        circulo c = new circulo(20);
        System.out.printf("%.0f\n",c.calculaArea());
        System.out.printf("%.0f\n", c.calculaPerimetro());
    }
}
