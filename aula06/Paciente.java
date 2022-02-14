package aula05;

public class Paciente extends Pessoa {

    private String idConvenio;
    private float peso;
    private int idade;
    private float altura;

    public void cadastrarPaciente(String nome, String endereco, String numero, String idConvenio, float peso, int idade, float altura) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNumero(numero);
        this.setIdConvenio(idConvenio);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setAltura(altura);
    }

    public String getIdConvenio() {
        return idConvenio;
    }

    private void setIdConvenio(String idConvenio) {
        this.idConvenio = idConvenio;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }
}
