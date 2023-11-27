package e_commerce.repository;

import e_commerce.model.Ecommerce;

public interface EcommerceRepository {
	// CRUD da Conta
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Ecommerce Ecommerce);
	public void atualizar(Ecommerce Ecommerce);
	public void deletar(int numero);
		
	// Métodos do Ecommerce
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
}
