public class TestarCliente {

	public static void main(String[] args) {
 
 
			    Cliente cliente = new Cliente(0123, "Zaion", "20/10/2022");
				
				GeraCliente geraCliente = new GeraCliente();
				
				SalvaPedidoBancoDados salvaPedidoBanco = new SalvaPedidoBancoDados(cliente.getNumeroCliente(), cliente.getNomeCliente(), pedido.getDataCliente());
				
				EnviaEmailCliente  enviaEmailCliente = new EnviaEmailCliente(cliente.getNumeroCliente(), cliente.getNomeCliente(), cliente.getDataCliente());

				 geraCliente.execute(salvaPedidoBanco);
				 
				 geraCliente.execute(enviaEmailCliente);
			}
	}
