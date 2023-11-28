package e_commerce.model;

public class PlacasGames extends Ecommerce{

	private boolean games;

	public PlacasGames(int codigo, String modelo, int tipo, String marca, float valor, boolean games ) {
		super(codigo, modelo, tipo, marca, valor);
		this.games = games;
	}
	
	
	
	public boolean isGames() {
		return games;
	}



	public void setGames(boolean games) {
		this.games = games;
	}



	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Possui RGB? " + this.games);
	}

}
