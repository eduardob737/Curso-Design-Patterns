package factorymethods.problema;

import factorymethods.ProdutoDigital;
import factorymethods.ProdutoFisico;

// Descrição do problema: Na classe o atributo "possuiDimensoesFisicas" deve ser setado de acordo com o tipo de
// produto instanciado, ou seja, se for produto físico vai ser "true", se for digital será "false".
// Usando a implementação abaixo deixamos a cargo do "programador" a responsabilidade de setar esse atributo,
// quando na verdade ela deveria ser delegada ao sistema para fazer a atribuição de forma automática, diminuindo
// a chance de erros e otimizando o código.

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
