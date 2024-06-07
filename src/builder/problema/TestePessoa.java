package builder.problema;

import builder.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {

        // Descrição do problema: Nessa implementação tradicional o código perde legibilidade, pois não é possível saber
        // quais são os atributos esperados no construtor sem a indicação da IDE, e também é preciso seguir a ordem de
        // atributos definida no construtor, caso contrário não será possível criar o objeto.

        Pessoa pessoa = new Pessoa(
                "Eduardo",
                "Barbosa",
                "12345678901",
                "edu@email.com",
                "Edu",
                "01-09-1910");

        System.out.println(pessoa);
    }
}
