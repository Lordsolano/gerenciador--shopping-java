package Builder.aulas;

public class PacienteBuilder implements IPacienteBuilder{

    private String nome;
    private String cpf;
    private String email;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEmail(String Email) {
        this.email = Email;
    }

    @Override
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public Paciente getResultado(){
        return new Paciente(nome,cpf,email);
    }
}
