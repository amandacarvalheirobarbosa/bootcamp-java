public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // Construtor - criar construtores com os dados que realmente são necessarios (obrigatórios).
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
