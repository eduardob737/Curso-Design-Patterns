package builder;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private String dataNascimento;

    private Pessoa(String nome, String sobrenome, String documento, String email, String apelido, String dataNascimento) {
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

    // Com a classe builder criada dentro da classe de modelo toda a responsabilidade de criar o objeto Pessoa passa a
    // ser exclusivamente da classe builder, não permitindo a criação pelo construtor "comum" sem o design pattern.

    public static class PessoaBuilder {

        private String nome;
        private String sobrenome;
        private String documento;
        private String email;
        private String apelido;
        private String dataNascimento;

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder dataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(nome, sobrenome, documento, email, apelido, dataNascimento);
        }
    }

}
