package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(20);
        setLargura(110);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
