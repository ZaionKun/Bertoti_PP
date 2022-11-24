public class Cliente {
	
	public int getNumeroCliente() {
		return numeroCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getDataCliente() {
		return dataCliente;
	}

	private int numeroCliente;
	
	private String nomeCliente;
	
	private String dataPedido;
	
	public Pedido(int numeroCliente, String nomeCliente, String data) {
		this.numeroCliente = numeroCliente;
		this.nomeCliente = nomeCliente;
		this.dataPedido = data;
		
	}

	public void executarAcao(Cliente cliente) {
		
	}

}