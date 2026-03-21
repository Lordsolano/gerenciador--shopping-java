package Factorymethod.aulas;

public class testeFabrica {
    static void main() {
        moeda teste = MoedaFabrica.getMoeda("BR");
        System.out.println(teste.getPrefixo());
    }
}
