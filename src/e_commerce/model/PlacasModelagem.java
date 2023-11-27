package e_commerce.model;

public class PlacasModelagem extends Ecommerce {

	private boolean modelagem;

	public PlacasModelagem(int codigo, String modelo, int tipo, String marca, float valor, boolean modelagem) {
		super(codigo, modelo, tipo, marca, valor);
		this.modelagem = modelagem;
	}

	public boolean isModelagem() {
		return modelagem;
	}

	public void setModelagem(boolean modelagem) {
		this.modelagem = modelagem;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("É boa para modelagem? " + this.modelagem);
	}
	
}
