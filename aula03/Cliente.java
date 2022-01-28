public class Cliente {

	private int idCleinte;

	private String dataCastro;// Date não quis funcionar

	private Juridica juridica;

	public void trocarFoneJuridico(String telefone) {
		this.juridica.trocarTelefonePessoa(telefone);
	}

}
