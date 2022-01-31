package aula04;

public class Pessoa {

	private String nome;

	private String endereco;

	private String telefone;

	private void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNome() {
		return this.nome;
	}

	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	protected String getEndereco() {
		return this.endereco;
	}

	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected String getTelefone() {
		return this.telefone;
	}

	protected void alterarTelefonePessoa(String telefone) {
		this.setTelefone(telefone);
	}

	protected void cadastrarPessoa(String nome, String telefone, String endereco) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
	}
}
