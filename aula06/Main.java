package aula05;

public class Main {

	public static void main(String[] args) {

		Entrada e1 = new Entrada();
		Medico m1 = new Medico();
		Paciente p1 = new Paciente();
		Saida s1 = new Saida();

		e1.cadastrarMedico(m1);
		System.out.println();
		e1.cadastrarPaciente(p1);

		s1.imprimirPaciente(p1);
		System.out.println();
		s1.imprimirMedico(m1);

	}

}