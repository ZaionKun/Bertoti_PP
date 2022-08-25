package strategypattern;

public class Carro implements TipoCnh {
	
	public void categoriaCnh(String tipo) {
		
		if (tipo == "A") {
			System.out.println("Autorizado a dirigir Carro");
		}else {
			System.out.println("Não está autorizado a dirigir esse tipo de veículo");
		}
	}
	
}
