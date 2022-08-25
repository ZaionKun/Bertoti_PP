package strategypattern;

public class Moto implements TipoCnh {
	
	public void categoriaCnh(String tipo) {
		
		if (tipo == "B") {
			System.out.println("Autorizado a dirigir Moto");
		}else {
			System.out.println("Não está autorizado a dirigir esse tipo de veículo");
		}
	}
	
}
