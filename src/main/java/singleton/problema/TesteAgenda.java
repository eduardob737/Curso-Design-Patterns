package singleton.problema;

// Descrição do problema: Ao invocar o método "reservaDia" um novo objeto da classe Agenda é criado e consequentemente
// os dias da semana por padrão são iniciados como true, com exceção apenas do dia passado por parâmetro para ficar
// indisponível, dessa forma vários objetos ocupam a memória e o usuário não consegue definir mais de um dia como
// ocupado.

public class TesteAgenda {
    public static void main(String[] args) {
        reservaDia("Sexta");
        reservaDia("Sabado");
    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getAgenda());
    }
}
