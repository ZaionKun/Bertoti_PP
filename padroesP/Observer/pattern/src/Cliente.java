public class Cliente {

    private int numeroCliente;

    private String nomeCliente;

    private String dataCliente;


	public Cliente(int numeroCliente, String nomeCliente, String data) {
		this.numeroCliente = numeroCliente;
		this.nomeCliente = nomeCliente;
		this.dataCliente = data;

	}

    public int getNumeroCliente() {
		return numeroCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getDataCliente() {
		return dataCliente;
	}
}