import java.util.Arrays;

public class TestarCliente{

    public static void main(String[] args) {
    
        Cliente cliente = new Cliente(0123, "Zaion", "21/11/2021");
        Cliente clienteNovo = new Cliente(0123, "Zaion Felippe", "21/11/2021");

        GerarCliente geraCliente = new GerarCliente(Arrays.asList(new EnviaEmailCliente(), new SalvaClienteBancoDados()));

        geraCliente.subscribe(cliente);
        geraCliente.unsubscribe(cliente);
    }
}