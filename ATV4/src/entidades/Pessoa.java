package entidades;

public class Pessoa {
    private int idade;
    private String nome;
    private String  cpf;

    public Pessoa() {
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa(int idade, String nome, String cpf) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("idade=").append(idade);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
