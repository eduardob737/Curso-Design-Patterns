package singleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Descrição da solução: Os métodos EAGER e LAZY atendem o propósito do Singleton permitindo apenas uma instância criada
// para o objeto, porém ainda existem formas de "burlar" esse padrão e criar novas intâncias de modo que esses métodos
// não conseguem impedir essa ação. Uma dessas formas é usando o método "reflection" que consegue acesso ao construtor
// da classe mesmo que essa esteja privada e assim permite a criação de novas instâncias. Daí surge o método Enum que
// consegue impedir a ação do reflection e verdadeiramente faz valer o padrão Singleton, bloqueando a criação externa
// de novas instâncias.

public enum AgendaSingletonEnum {

    INSTANCE;

    private Map<String, Boolean> agenda = new HashMap<>();

    AgendaSingletonEnum(){
        agenda.put("Domingo", Boolean.TRUE);
        agenda.put("Segunda", Boolean.TRUE);
        agenda.put("Terca", Boolean.TRUE);
        agenda.put("Quarta", Boolean.TRUE);
        agenda.put("Quinta", Boolean.TRUE);
        agenda.put("Sexta", Boolean.TRUE);
        agenda.put("Sabado", Boolean.TRUE);
    }

    public static AgendaSingletonEnum getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getAgenda(){
        return agenda;
    }

    public void ocupa(String dia){
        agenda.replace(dia, Boolean.FALSE);
    }
}
