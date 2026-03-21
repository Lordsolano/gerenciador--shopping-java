package Factorymethod.aulas;

public class MoedaFabrica {
    public static moeda getMoeda(String pais){
        switch (pais){
            case "BR": return new real();
            case "EUA": return new dolar();
            default: throw new IllegalArgumentException("Pais nao encontrado");
        }
    }
}
