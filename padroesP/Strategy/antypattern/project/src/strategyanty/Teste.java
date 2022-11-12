package strategyanty;

public class Teste {
	
	public static void main(String[] args) {
		
		Motorista m1 = new MotoristaCarro();
		m1.TipoCnh("A");
		m1.categoriaCnh(m1.getTipo());
		// System.out.println(m1.getTipo());
		
		Motorista m2 = new MotoristaMoto();
		m2.TipoCnh("B");
		m2.categoriaCnh(m2.getTipo());

		Motorista m3 = new MotoristaMoto();
		m3.TipoCnh("B");
		m3.categoriaCnh(m3.getTipo());
	}
}