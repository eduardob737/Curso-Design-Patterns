package builder.solucao;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .raca("Poodle")
                .dono("Eduardo")
                .nome("Neguinha")
                .build();

        System.out.println(animal);
    }
}
