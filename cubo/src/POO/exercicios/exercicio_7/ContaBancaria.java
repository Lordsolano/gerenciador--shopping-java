package POO.exercicios.exercicio_7;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {

        this.saldo = saldo;
    }
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void sacar( double valorSaque){
        this.saldo -= valorSaque;
    }

    public double getSaldo() {
        return saldo;
    }
}