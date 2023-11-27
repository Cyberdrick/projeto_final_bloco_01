package e_commerce.repository;

import e_commerce.model.Ecommerce;

public interface EcommerceRepository {
	// CRUD do Ecommerce
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Ecommerce Ecommerce);
	public void atualizar(Ecommerce Ecommerce);
	public void deletar(int numero);
		
	// Métodos de Compra
	public void comprar(int numero, float valor);
	public void vender(int numero, float valor);
	public void reembolso(int numero, float valor);
}
