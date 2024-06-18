package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
    public static void main(String[] args) {
        Botao botaoVermelho = BotaoRegistry.getInstance().getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAmarelo = BotaoRegistry.getInstance().getBotao("BOTAO_AMARELO");
        botaoAmarelo.setLargura(400);
        System.out.println(botaoAmarelo);

        Botao botaoAmarelo2 = BotaoRegistry.getInstance().getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo2);

        Botao botaoAzul = BotaoRegistry.getInstance().getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        String chave = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setLargura(160);
        botaoPreto.setAltura(200);
        botaoPreto.setCor("Preto");
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);
        BotaoRegistry.getInstance().addRegistry(chave, botaoPreto);

        Botao botaoPretoClone = BotaoRegistry.getInstance().getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);
    }
}
