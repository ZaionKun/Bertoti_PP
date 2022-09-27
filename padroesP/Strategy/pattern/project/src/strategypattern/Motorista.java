package strategypattern;


public class Motorista{
	
	private TipoCnh  habilitacao;
	public void setDirigir(TipoCnh dirigir) {
		this.habilitacao = dirigir;
	}

	private String tipo;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void VerificarCnh() {
		this.habilitacao.categoriaCnh(this.tipo);
		
	}
}
