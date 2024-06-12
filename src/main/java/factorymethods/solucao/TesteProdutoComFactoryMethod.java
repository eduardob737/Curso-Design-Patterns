package factorymethods.solucao;

import factorymethods.Produto;
import factorymethods.TipoProdutoEnum;

// Usando a fábrica de "Produto" e o método "getInstance" passando como argumento o tipo do produto e recebendo o objeto
// com as atribuições necessárias já feitas.

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
}
