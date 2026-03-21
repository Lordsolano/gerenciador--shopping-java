package POO.exercicios.exercicio_7;


public class main {
    static void main() {
        ContaBancaria conta = new ContaBancaria(1000);

        conta.getSaldo();
        conta.depositar(700);
        conta.sacar(350);

        System.out.println("---------------- Banco master ---------------");
        System.out.println("Saldo atual: " + conta.getSaldo());



    }
}
