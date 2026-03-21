package Singleton;

public final class Conexao {

    private static Conexao Instancia;

    public String bancodedados;

    private Conexao(String bancodedados){
        this.bancodedados = bancodedados;
    }
    public static Conexao getInstance(String bancodedados){
        if(Instancia == null){
            Instancia = new Conexao(bancodedados);
        }
        return Instancia;
    }
}
