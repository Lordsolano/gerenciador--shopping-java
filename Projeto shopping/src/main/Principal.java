package main;
import java.util.Scanner;
import Classes.Endereco;
import Classes.Data;
import Classes.Loja;
import Classes.Produto;

import javax.lang.model.element.ModuleElement;


public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        Produto produto = null;
        Loja loja = null;

        while (opcao != 3) {
            System.out.println("------MENU------\n");
            System.out.println("1 - CRIAR UMA LOJA\n");
            System.out.println("2 - CRIAR UM PRODUTO\n");
            System.out.println("3 - SAIR\n");
            System.out.println("Escolha uma opcao: ");

            opcao = ler.nextInt();

            if (opcao == 1) {
                //dados da loja
                System.out.println("Digite o nome da Loja: ");
                String nomeLoja = ler.next();
                System.out.println("Digite a Quantidade de Funcionários");
                int quantidadeFuncionarios = ler.nextInt();
                System.out.println("Digite o Salario base do funcionário");
                double salarioFuncionario = ler.nextDouble();
                System.out.println("Digite o Quantidade de Produtos");
                int quantidadeProdutos = ler.nextInt();

                // dados do endereco
                System.out.println("Digite o Endereço\n ");
                System.out.println("Nome da Rua: ");
                String nomeRua = ler.next();
                ler.nextLine();
                System.out.println("Digite o Cidade: ");
                String cidade = ler.nextLine();
                System.out.println("Digite o Estado: ");
                String nomeEstado = ler.next();
                System.out.println("Digite o País: ");
                String nomePais = ler.next();
                System.out.println("Digite o CEP: ");
                String cep = ler.next();
                System.out.println("Digite o Numero: ");
                String numero = ler.next();
                System.out.println("Digite o Complemento: ");
                String complemento = ler.next();
                Endereco endereco = new Endereco(nomeRua, cidade, nomeEstado, nomePais, cep, numero, complemento);

                //dados da data
                System.out.println("Digite a Data");
                System.out.println("Digite Dia: ");
                int dia = ler.nextInt();
                System.out.println("Digite Mes: ");
                int mes = ler.nextInt();
                System.out.println("Digite Ano: ");
                int ano = ler.nextInt();
                Data data = new Data(dia, mes, ano);

                loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioFuncionario, endereco, data, quantidadeProdutos);
            } else if (opcao == 2) {
                System.out.println("Digite o nome do Produto: ");
                String nomeProduto = ler.next();

                System.out.println("Digite o Preço do Produto: ");
                double preco = ler.nextDouble();

                System.out.println("Data de Validade\n ");

                System.out.println("Digite o Dia ");
                int dia = ler.nextInt();
                System.out.println("Digite o Mes ");
                int mes = ler.nextInt();
                System.out.println("Digite o Ano ");
                int ano = ler.nextInt();

                Data dataValidade = new Data(dia, mes, ano);

                produto = new Produto(nomeProduto, preco, dataValidade);
            } else if (opcao == 3) {
                System.out.println("Finalizando sistema...");
            } else {
                System.out.println("Opção inválida");
            }
        }

        Data dataAtual = new Data(20, 10, 2023);
        if (loja != null && produto != null) {
            if (produto.EstaVencido(dataAtual)) {
                System.out.println("Produto Vencido");
            } else {
                System.out.println("Produto Não Vencido");
            }
            System.out.println(loja);
        }

        ler.close();
    }
}
