package Classes;

import SubClasses.*;

public class Shopping {
    public String nome;
    public Endereco endereco;
    public Loja lojas[];

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }
    public boolean removeLoja(String nome) {
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    public int quantidadeLojasPorTipo(String tipo) {
        int contador = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (tipo.equals("Cosmetico")){
                if (lojas[i] instanceof Cosmetico) {
                    contador++;
                }
            } else if (tipo.equals("Alimentacao")) {
                if (lojas[i] instanceof Alimentacao) {
                    contador++;
                }
            } else if (tipo.equals("Bijuteria")) {
                if (lojas[i] instanceof Bijuteria) {
                    contador++;
                }
            } else if (tipo.equals("Informatica")) {
                if (lojas[i] instanceof Informatica) {
                    contador++;
                }
            } else if (tipo.equals("Vestuario")) {
                if (lojas[i] instanceof Vestuario) {
                    contador++;
                }
            }
            else
                return -1;
        }
        return contador;
    }
    public Informatica lojaSeguroMaisCaro(){
         Informatica maior = null;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                if(maior == null){
                    maior = (Informatica) lojas[i];
                }
                else if (((Informatica) lojas[i]).getSeguroEletronicos() > maior.getSeguroEletronicos()){
                    maior = (Informatica) lojas[i];
                }
            }
        }
    return maior;
    }
}
