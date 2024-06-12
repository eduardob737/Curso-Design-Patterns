package singleton.solucao;

// Descrição da solução: Usando Singleton obtemos uma única instância para fazer as atribuições necessárias no
// objeto, mantendo sempre a mesma referência na memória, otimizando recursos e código.

public class TesteAgendaComSingleton {
    public static void main(String[] args) {
        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");

        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sabado");

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");

        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();

        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());
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

    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getAgenda());
    }
}
