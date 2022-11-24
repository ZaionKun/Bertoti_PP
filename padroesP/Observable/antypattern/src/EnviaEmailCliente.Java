public class EnviaEmailCliente extends Cliente {

	
	public EnviaEmailCliente(int numeroCliente, String nomeCliente, String data) {
		super(numeroPedido, nomeCliente, data);
	
	}

	@Override
	public void executarAcao(Cliente cliente) {
		
		System.out.println("Cliente envidado");
		
	}

}