package singleton.solucao;

import java.util.HashMap;
import java.util.Map;

// Descrição da solução: Com o método EAGER o objeto "INSTANCE" é iniciado assim que a classe é carregada pelo Java,
// sem depender da chamada do método "getInstance", ficando "disponível" para uso de forma automática.

public class AgendaSingletonEAGER {

    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

    private Map<String, Boolean> agenda = new HashMap<>();

    public AgendaSingletonEAGER(){
        agenda.put("Domingo", Boolean.TRUE);
        agenda.put("Segunda", Boolean.TRUE);
        agenda.put("Terca", Boolean.TRUE);
        agenda.put("Quarta", Boolean.TRUE);
        agenda.put("Quinta", Boolean.TRUE);
        agenda.put("Sexta", Boolean.TRUE);
        agenda.put("Sabado", Boolean.TRUE);
    }

    public static AgendaSingletonEAGER getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getAgenda(){
        return agenda;
    }

    public void ocupa(String dia){
        agenda.replace(dia, Boolean.FALSE);
    }
}
