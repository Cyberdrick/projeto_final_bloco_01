package e_commerce.model;

public abstract class Ecommerce {
	
	private int codigo;
	private String modelo;
	private int tipo;
	private String marca;
	private float valor;
	
	public Ecommerce(int codigo, String modelo, int tipo, String marca, float valor) {
		this.codigo = codigo;
		this.modelo = modelo;
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
	}
	
	
	
	
	
	public int getCodigo() {
		return codigo;
	}





	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}





	public String getModelo() {
		return modelo;
	}





	public void setModelo(String modelo) {
		this.modelo = modelo;
	}





	public int getTipo() {
		return tipo;
	}





	public void setTipo(int tipo) {
		this.tipo = tipo;
	}





	public String getMarca() {
		return marca;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public float getValor() {
		return valor;
	}





	public void setValor(float valor) {
		this.valor = valor;
	}





	public void precificar(float valor) {
		this.setValor(this.getValor() + valor);
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1: 
			tipo = "Games";
			break;
		case 2:
			tipo = "Modelagem";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Placa:");
		System.out.println("***********************************************************");
		System.out.println("Código do Produto: " + this.codigo);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo da Placa: " + tipo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Valor: " + this.valor);
	}
	
	
}