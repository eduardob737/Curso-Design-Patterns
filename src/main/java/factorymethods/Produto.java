package factorymethods;

import lombok.Setter;

import java.math.BigDecimal;

public class Produto {

    private String descricao;
    private BigDecimal preco;
    @Setter
    private Boolean possuiDimensoesFisicas;

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", possuiDimensoesFisicas=" + possuiDimensoesFisicas +
                '}';
    }
}
