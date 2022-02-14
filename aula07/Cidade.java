public class Cidade {
    private String nome;
    private Estado estado;

    public void Cidade(String nome, Estado estado) {
        this.setNome(nome);
        this.setEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }

    private void setEstado(Estado estado) {
        this.estado = estado;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

}
