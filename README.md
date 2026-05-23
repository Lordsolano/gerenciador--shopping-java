# Sistema de Shopping em Java

Sistema orientado a objetos desenvolvido em Java que simula o gerenciamento de um shopping, com lojas de diferentes tipos, produtos e endereços.

## Funcionalidades

- Cadastro de lojas com dados completos (funcionários, salário, endereço, data)
- Cadastro de produtos com data de validade
- Verificação de produto vencido
- Gerenciamento de estoque por loja
- Suporte a 5 tipos de loja com características específicas

## Tipos de Loja

| Tipo | Atributo Extra |
|------|---------------|
| Alimentação | Data do alvará |
| Bijuteria | Meta de vendas |
| Cosmético | Taxa de comercialização |
| Informática | Seguro de eletrônicos |
| Vestuário | Produtos importados |

## Estrutura do Projeto

```
src/
├── Classes/
│   ├── Data.java          # Representa uma data com validação
│   ├── Endereco.java      # Endereço completo
│   ├── Loja.java          # Classe base de loja
│   ├── Produto.java       # Produto com data de validade
│   └── Shopping.java      # Gerencia lojas do shopping
├── SubClasses/
│   ├── Alimentacao.java
│   ├── Bijuteria.java
│   ├── Cosmetico.java
│   ├── Informatica.java
│   └── Vestuario.java
└── main/
    └── Principal.java     # Ponto de entrada do sistema
```

## Conceitos Aplicados

- Herança (`Alimentacao`, `Bijuteria`, etc. estendem `Loja`)
- Polimorfismo (`instanceof` para identificar tipo de loja)
- Encapsulamento (atributos privados com getters e setters)
- Arrays de objetos (estoque de produtos, lojas do shopping)
- Validação de dados (data válida, ano bissexto)
- Sobrescrita de métodos (`toString` em todas as classes)

## Como Rodar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Execute o arquivo `Principal.java`

## Tecnologias

- Java 17+
- Orientação a Objetos
- Scanner para entrada de dados no terminal
