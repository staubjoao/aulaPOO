package aula04;

import aula04.Juridica;

public class Cliente {

    private int idCleinte;

    private String dataCastro;// Date não quis funcionar

    private Juridica juridica;

    protected void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public String getDataCastro() {
        return dataCastro;
    }

    public void setDataCastro(String dataCastro) {
        this.dataCastro = dataCastro;
    }

    public int getIdCleinte() {
        return idCleinte;
    }

    public void setIdCleinte(int idCleinte) {
        this.idCleinte = idCleinte;
    }

    protected Juridica getJuridica() {
        return this.juridica;
    }

    public void alterarFone(String fone) {
        this.juridica.alterarTelefoneJuridico(fone);
    }

}
