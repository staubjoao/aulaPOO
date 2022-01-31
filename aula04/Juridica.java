package aula04;

public class Juridica extends Pessoa {

    private String cnpj;

    private float receita;
    private String dataAbertura;

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

    public void alterarTelefoneJuridico(String fone) {
        this.alterarTelefonePessoa(fone);
    }

}
