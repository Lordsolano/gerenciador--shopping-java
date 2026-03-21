package Builder.aulas;

public class BuilderTeste {
    static void main() {

        PacienteBuilder Builder = new PacienteBuilder();

        Builder.setNome("maicon");
        Builder.setcpf("123");
        Builder.setEmail("123");

        Paciente maicon = Builder.getResultado();
        System.out.println(maicon.Imprimir());

    }
}
