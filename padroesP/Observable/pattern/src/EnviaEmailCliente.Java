public class EnviaEmailCliente implements AcaoAposGerarCliente {

	@Override
	public void executarAcao(String acao) {
		
		System.out.println("Email envidado " + acao);
		
	}

}