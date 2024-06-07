package builder;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private String dataNascimento;

    public Pessoa(String nome, String sobrenome, String documento, String email, String apelido, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
