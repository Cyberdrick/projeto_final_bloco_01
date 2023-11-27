package e_commerce.model;

public class PlacasGames extends Ecommerce{

	private boolean Games;

	public PlacasGames(int codigo, String modelo, int tipo, String marca, float valor, boolean Games ) {
		super(codigo, modelo, tipo, marca, valor);
		this.Games = Games;
	}
	
	
	
	public boolean isGames() {
		return Games;
	}



	public void setGames(boolean Games) {
		Games = Games;
	}



	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Possui RGB? " + this.Games);
	}

}
