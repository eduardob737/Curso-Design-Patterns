package builder.solucao;

import lombok.*;

// Usando biblioteca Lombok para definir facilmente através de anotations algumas propriedades da classe:
// Data: Criar getters e setters
// AllArgsConstructor: Construtor com todos os atributos da classe
// NoArgsConstructor: Construtor sem argumentos
// Builder: Configura o Design patterns Builder

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Animal {

    private String nome;
    private String dono;
    private String raca;
}
