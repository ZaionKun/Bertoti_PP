package strategypattern;

public class Carro implements TipoCnh {
	
	public void categoriaCnh(String tipo) {
		
		if (tipo == "A") {
			System.out.println("Autorizado a dirigir Carro");
		}else {
			System.out.println("N�o est� autorizado a dirigir esse tipo de ve�culo");
		}
	}
	
}
