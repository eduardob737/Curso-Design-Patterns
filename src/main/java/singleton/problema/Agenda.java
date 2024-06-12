package singleton.problema;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Boolean> agenda = new HashMap<>();

    public Agenda(){
        agenda.put("Domingo", Boolean.TRUE);
        agenda.put("Segunda", Boolean.TRUE);
        agenda.put("Terca", Boolean.TRUE);
        agenda.put("Quarta", Boolean.TRUE);
        agenda.put("Quinta", Boolean.TRUE);
        agenda.put("Sexta", Boolean.TRUE);
        agenda.put("Sabado", Boolean.TRUE);
    }

    public Map<String, Boolean> getAgenda(){
        return agenda;
    }

    public void ocupa(String dia){
        agenda.replace(dia, Boolean.FALSE);
    }
}
