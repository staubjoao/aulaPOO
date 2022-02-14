package aula05;

public class Medico extends Pessoa {

    private String crm;
    private String especialidade;

    public void cadastrarMedico(String nome, String endereco, String numero, String crm, String especialidade) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNumero(numero);
        this.setCrm(crm);
        this.setEspecialidade(especialidade);
    }
    
    public String getCrm() {
        return crm;
    }

    private void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    private void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
