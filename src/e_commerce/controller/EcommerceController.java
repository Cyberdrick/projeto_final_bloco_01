package e_commerce.controller;

import java.util.ArrayList;

import e_commerce.model.Ecommerce;
import e_commerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Ecommerce> listaGpus = new ArrayList<Ecommerce>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		for (var gpu : listaGpus) {
			gpu.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Ecommerce ecommerce) {
		listaGpus.add(ecommerce);
		System.out.println("\nA Placa de Video com o código :" + ecommerce.getCodigo() + " foi registrada com sucesso!");
	}

	@Override
	public void atualizar(Ecommerce ecommerce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Ecommerce buscarNaCollection(int numero) {
		for (var ecommerce:  listaGpus) {
			if (ecommerce.getCodigo() == numero) {
				return ecommerce;
			}
		}
		return null;
	}
	
	public void procurarPorCodigo(int numero) {
		var ecommerce = buscarNaCollection(numero);
		
		if(ecommerce != null)
			ecommerce.visualizar();
		else
			System.out.println("\nA placa do código: "+numero+" não foi encontrada");
	}

	@Override
	public void listaGpus(Ecommerce ecommerce) {
		// TODO Auto-generated method stub
		
	}
	
}
