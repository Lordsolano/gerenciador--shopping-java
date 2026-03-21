package Singleton;

public class Conexaoteste {
    static void main() {
        Conexao conexao = Conexao.getInstance("cubosacademy");
        Conexao conexao2 = Conexao.getInstance("cubosacademy2");

        System.out.println(conexao.bancodedados);
        System.out.println(conexao2.bancodedados);
    }
}
