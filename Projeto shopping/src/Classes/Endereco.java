package Classes;

public class Endereco {
    public String NomedaRua;
    public String Cidade;
    public String Estado;
    public String Pais;
    public String Cep;
    public String Numero;
    public String Complemento;

    public Endereco(String nomedaRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        NomedaRua = nomedaRua;
        Cidade = cidade;
        Estado = estado;
        Pais = pais;
        Cep = cep;
        Numero = numero;
        Complemento = complemento;
    }

    public String getNomedaRua() {
        return NomedaRua;
    }

    public void setNomedaRua(String nomedaRua) {
        NomedaRua = nomedaRua;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
    @Override
    public String toString(){
        return "RUA: "+NomedaRua+ "\n" +
                "CIDADE: "+Cidade + "\n" +
                "ESTADO: "+Estado + "\n" +
                "PAIS: "+Pais + "\n" +
                "CEP: "+Cep + "\n" +
                "NUMERO: "+Numero + "\n" +
                "COMPLEMENTO: "+Complemento;
    }
}
