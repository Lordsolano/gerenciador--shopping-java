package Builder.aulas;

public class Paciente
{
    private String nome;
    private String cpf;
    private String email;

    public Paciente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String Imprimir(){
        String ficha = "Ficha do paciente: \n";

        if (this.nome != null) {
            ficha += "Nome: " + this.nome + "\n";
        }
        if (this.cpf != null) {
            ficha += "CPF: " + this.cpf + "\n";
        }
        if (this.email != null) {
            ficha += "Email: " + this.email + "\n";
        }
        return ficha;
    }
}
