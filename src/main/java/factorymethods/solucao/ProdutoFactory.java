package factorymethods.solucao;

import factorymethods.Produto;
import factorymethods.ProdutoDigital;
import factorymethods.ProdutoFisico;
import factorymethods.TipoProdutoEnum;

// Descrição da solução: Criando uma classe que será fábrica de "Produto" com um método responsável por retornar a
// instância do objeto com os atributos necessários já definidos, ou seja, quando um objeto do tipo Produto for criado
// essa fábrica fará a implementação correta dos atributos aqui programados e retornará o objeto "pronto".

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum){
        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto indisponível");
        }
    }
}