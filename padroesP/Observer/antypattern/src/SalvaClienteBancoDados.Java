public class SalvaPedidoBancoDados extends Cliente{

	
	public SalvaPedidoBancoDados(int numeroCliente, String nomeCliente, String data) {
		super(numeroCliente, nomeCliente, data);
		
	}

	@Override
	public void executarAcao(Cliente cliente) {

       System.out.println("Cliente salvo no banco com sucesso");
		
	}
}