package strategyanty;


public class Motorista {
	
	public String tipo;

	public void TipoCnh(String tipoCnh) {
		this.tipo = tipoCnh;
	}

	public void categoriaCnh(String tipo) {
		
		if (tipo == "A") {
			System.out.println("Autorizado a dirigir Carro");
		}
		else if(tipo == "B"){
			System.out.println("Autorizado a dirigir Moto");
		}
		else {
			System.out.println("Não está autorizado a dirigir esse tipo de veículo");
		}
	}
	
	public String getTipo() {
		return tipo;
	}

}
