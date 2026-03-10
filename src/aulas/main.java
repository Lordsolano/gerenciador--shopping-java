package aulas;

public class main
{
    public static void main(String[] args)
    {
        Carro fusca = new Carro("fusca","volkswagen","verde",1997);
        fusca.ligar();
        fusca.acelerar("forte");

        System.out.println(fusca.getAceleracao());
        System.out.println(fusca.getLigado());
        System.out.println(fusca.getCor());

        fusca.setCor("marrom");

        System.out.println(fusca.getCor());
        System.out.println(fusca.getIdade());

 //       Pessoa maicon = new Pessoa("maicon","1290372098374");
        Pessoa maicon = new Aluno("maicon","1290372098374");
        Professor joao = new Professor("joao","1209831", 1500 );

        maicon.CalcularPontos(20);
        joao.CalcularPontos(40);
        System.out.println(maicon.getPontos());
        System.out.println(joao.getPontos());
    }
}
