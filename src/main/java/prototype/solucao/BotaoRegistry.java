package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Descrição da solução: Usando o design pattern Prototype temos em um único lugar os diversos botões que querem definir
// sem a necessidade de criar uma classe para cada novo botão desejado, dessa forma, os botões são clonados a partir
// dessa classe e seu método estático com os botões pré-definidos. O prototype facilita futuras manutenções e
// manipulações no código uma vez que nessa classe temos os diversos objetos do tipo Botao centralizados.

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;
    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(20);
        botaoVermelho.setLargura(110);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    public static BotaoRegistry getInstance(){
        if (Objects.isNull(botaoRegistry))
            botaoRegistry = new BotaoRegistry();
        return botaoRegistry;
    }

    public Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public void addRegistry(String chave, Botao botaoPreto) {
        REGISTRY.put(chave, botaoPreto);
    }
}
