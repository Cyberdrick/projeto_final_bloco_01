package e_commerce.repository;

import e_commerce.model.Ecommerce;

public interface EcommerceRepository {
	// CRUD do Ecommerce
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Ecommerce ecommerce);
	public void atualizar(Ecommerce ecommerce);
	public void deletar(int numero);
	void listaGpus(Ecommerce ecommerce);
}
