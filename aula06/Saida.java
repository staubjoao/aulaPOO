package aula05;

public class Saida {
	
	public void imprimirPaciente(Paciente p) {
		System.out.println("------Paciente------");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Endereco: " + p.getEndereco());
        System.out.println("Numero: " + p.getNumero());
        System.out.println("idConvenio: " + p.getIdConvenio());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Altura: " + p.getAltura());
	}
	
	public void imprimirMedico(Medico m) {
		System.out.println("------Medico--------");
        System.out.println("Nome: " + m.getNome());
        System.out.println("Endereco: " + m.getEndereco());
        System.out.println("Numero: " + m.getNumero());
        System.out.println("CRM: " + m.getCrm());
        System.out.println("Especialidade: " + m.getEspecialidade());
	}
}
