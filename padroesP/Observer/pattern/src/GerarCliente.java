import java.util.ArrayList;
import java.util.List;

public class GerarCliente {

	private List<AcaoAposGerarCliente> acoes = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public GerarCliente(List<AcaoAposGerarCliente> acoes) {
		this.acoes = acoes;
	}

	public void notify(String acao) {

		this.acoes.forEach(a -> a.executarAcao(acao));

	}

	public void subscribe(Cliente cliente) {

		clientes.add(cliente);

		this.notify("cliente adicionado");
	}

	public void unsubscribe(Cliente cliente) {
		clientes.remove(cliente);
		this.notify("Cliente removido");
	}

	public List<Cliente> getCliente() {
		return clientes;
	}

}