package aula04;

public class Fisica extends Pessoa {

	private String cpf;

	private float salario;

	private String dataNascimento;// Date não quis funcionar

	public String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private String getDataNascimento() {
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

}
