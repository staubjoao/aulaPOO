package aula05;

public class Fisica extends Pessoa {

    private String cpf;
    private float salario;
    private String dataNascimento;
    private Banco[] banco;

    public void insereFisica(String nome, String endereco, String telefone, String cpf, float salario,
            String dataNascimento, Banco[] banco) {
        this.cadastrarPessoa(nome, endereco, telefone);
        this.setCpf(cpf);
        this.setSalario(salario);
        this.setDataNascimento(dataNascimento);
        this.setBanco(banco);
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    private void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    public Banco[] getBanco() {
        return this.banco;
    }

    private void setBanco(Banco[] banco) {
        this.banco = banco;
    }

}
