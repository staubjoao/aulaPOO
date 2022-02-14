package aula05;

import java.util.Scanner;

public class Entrada {

	private Scanner sc = new Scanner(System.in);
	private String nome, endereco, fone, crm, especialidade, idConvenio;
	private int idade;
	private float peso, altura;
    
	public void cadastrarPaciente(Paciente p) {
		System.out.print("Digite o nome do paciente: ");
        nome = sc.nextLine();
        System.out.print("Digite o endereco do paciente: ");
        endereco = sc.nextLine();
        System.out.print("Digite o fone do paciente: ");
        fone = sc.nextLine();
        System.out.print("Digite o idConvenio do paciente: ");
        idConvenio = sc.nextLine();
        System.out.print("Digite a idade do paciente: ");
        idade = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o peso do paciente: ");
        peso = Float.parseFloat(sc.nextLine());
        System.out.print("Digite a altura do paciente: ");
        altura = Float.parseFloat(sc.nextLine());
        
        p.cadastrarPaciente(nome, endereco, fone, idConvenio, peso, idade, altura);
	}

	public void cadastrarMedico(Medico m) {
		System.out.print("Digite o nome do medico: ");
        nome = sc.nextLine();
        System.out.print("Digite o endereco do medico: ");
        endereco = sc.nextLine();
        System.out.print("Digite o fone do medico: ");
        fone = sc.nextLine();
        System.out.print("Digite o crm do medico: ");
        crm = sc.nextLine();
        System.out.print("Digite o especialidade do medico: ");
        especialidade = sc.nextLine();
        
        m.cadastrarMedico(nome, endereco, fone, crm, especialidade);
	}
}
