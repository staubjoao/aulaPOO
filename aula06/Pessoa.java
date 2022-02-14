package aula05;

public class Pessoa {

    private String nome;
    private String endereco;
    private String numero;

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    protected void setNumero(String numero) {
        this.numero = numero;
    }

}
