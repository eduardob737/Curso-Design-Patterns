package builder.solucao;

import builder.Pessoa;

public class TestePessoaBuilder {
    public static void main(String[] args) {

        // Descrição da solução: Adotando esse design pattern Builder é possível saber exatamente quais atributos
        // esperados para criação do objeto, e permite a criação sem uma ordem específica.
        // (Melhor Legibilidade e Flexibilidade)

        // Criação do objeto usando o builder como classe estática da classe Pessoa.
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Eduardo")
                .sobrenome("Barbosa")
                .apelido("Edu")
                .dataNascimento("01/09/1910")
                .email("edu@email.com")
                .documento("98765432109")
                .build();

        System.out.println(pessoa);

    }
}
