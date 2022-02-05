package aula05;

public class Juridica extends Pessoa {

    private String cnpj;
    private float receita;
    private String dataAbertura;

    public void cadastrarPessoaJuridica(String cnpj, float receita, String dataAbertura, String nome, String endereco,
            String telefone) {
        this.cadastrarPessoa(nome, endereco, telefone);
        this.setCnpj(cnpj);
        this.setDataAbertura(dataAbertura);
        this.setReceita(receita);
    }

    public void alterarTelefoneJuridico(String fone) {
        this.alterarTelefonePessoa(fone);
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getReceita() {
        return receita;
    }

    private void setReceita(float receita) {
        this.receita = receita;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    private void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getCnpj() {
        return this.cnpj;
    }

}