public class Estado {
    private String nome;
    private String uf;

    public void Estado (String uf, String nome) {
        this.setNome(nome);
        this.setUf(uf);
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    private void setUf(String uf) {
        this.uf = uf;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
}
