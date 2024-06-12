package singleton.solucao;

public class TesteAgendaComSingleton {
    public static void main(String[] args) {
        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");
    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getAgenda());
    }
}
