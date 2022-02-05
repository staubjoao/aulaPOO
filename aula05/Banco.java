package aula05;

public class Banco {

    private String nome;
    private String endereco;

    public void insereBanco(String nome, String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
