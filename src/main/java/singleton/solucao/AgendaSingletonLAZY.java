package singleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Descrição da solução: Com o método LAZY o objeto "INSTANCE" só é iniciado quando o método "getInstance" é chamados
// pois nele está responsabilidade de verificar se o objeto é nulo e atribuir uma instância a ele, ou apenas retornar a
// instância já criada caso ele não seja nulo. Diferente do método EAGER, com esse tipo de método obtém-se um melhor
// gerenciamento dos objetos criados, uma vez que a instância será criada sob demanda, ou seja, somente quando for
// chamada e não a qualquer momento, gastando recursos e memória.

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;

    private Map<String, Boolean> agenda = new HashMap<>();

    private AgendaSingletonLAZY(){
        agenda.put("Domingo", Boolean.TRUE);
        agenda.put("Segunda", Boolean.TRUE);
        agenda.put("Terca", Boolean.TRUE);
        agenda.put("Quarta", Boolean.TRUE);
        agenda.put("Quinta", Boolean.TRUE);
        agenda.put("Sexta", Boolean.TRUE);
        agenda.put("Sabado", Boolean.TRUE);
    }

    public static AgendaSingletonLAZY getInstance(){
        if (Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
        return INSTANCE;
    }

    public Map<String, Boolean> getAgenda(){
        return agenda;
    }

    public void ocupa(String dia){
        agenda.replace(dia, Boolean.FALSE);
    }
}
