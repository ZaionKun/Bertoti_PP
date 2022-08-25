package strategypattern;

public class Teste {
	
	public static void main(String[] args) {
		
		Motorista m1 = new Motorista();
		m1.setTipo("A");
		m1.setDirigir(new Carro());
		m1.VerificarCnh();
		
		Motorista m2 = new Motorista();
		m2.setTipo("B");
		m2.setDirigir(new Carro());
		m2.VerificarCnh();
		
		Motorista m3 = new Motorista();
		m3.setTipo("B");
		m3.setDirigir(new Moto());
		m3.VerificarCnh();
		
	}
}