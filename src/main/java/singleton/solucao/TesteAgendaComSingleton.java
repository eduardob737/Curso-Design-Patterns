package singleton.solucao;

// Descrição da solução: Usando Singleton obtemos uma única instância para fazer as atribuições necessárias no
// objeto, mantendo sempre a mesma referência na memória, otimizando recursos e código.

public class TesteAgendaComSingleton {
    public static void main(String[] args) {
        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");

        AgendaSingletonLAZY lazy = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY lazy2 = AgendaSingletonLAZY.getInstance();
        System.out.println(lazy);
        System.out.println(lazy2);

        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sabado");
    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getAgenda());
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getAgenda());
    }
}
