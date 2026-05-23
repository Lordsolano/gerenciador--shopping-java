package colettion.list;

import java.util.ArrayList;
import java.util.List;

public class listTeste {
    static void main() {
        List lista = new ArrayList();
        lista.add("morango");
        lista.add("abacaxi");
        lista.add("banana");
        System.out.println(lista);

        Pessoa maicon = new Pessoa("maicon",23);
        Pessoa Jose = new Pessoa("jose",24);
        Pessoa pedro = new Pessoa("pedro",25);

        List <Pessoa> usuarios = new ArrayList<Pessoa>();
        usuarios.add(maicon);
        usuarios.add(Jose);
        usuarios.add(pedro);

        System.out.println(usuarios);
    }
}