package e_commerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.IOException;
import e_commerce.controller.EcommerceController;
import e_commerce.model.PlacasGames;
import e_commerce.model.PlacasModelagem;

public class Menu {

	public static void main(String[] args) {
		
		
		
		EcommerceController gpus = new EcommerceController(); 

		Scanner read = new Scanner(System.in);

		int option, codigo, tipo;
		String modelo, marca, proprietario;
		float valor;
		boolean games, modelagem;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("        GPU Informática	- e-commerce de GPUS 		 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar GPU                        ");
			System.out.println("            2 - Listar todas as GPUs                 ");
			System.out.println("            3 - Buscar GPU por código                ");
			System.out.println("            4 - Atualizar Infos da GPU               ");
			System.out.println("            5 - Apagar cadastro de GPU               ");
			System.out.println("            6 - Definir preço da GPU                 ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			int numero = 0;
			
			try {
				option = read.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				read.nextLine();
				option=0;
			}

			if (option == 9) {
				System.out.println("\nGPU Informática	- e-commerce de GPUS - Compra e Venda de Placas de Video!");
				sobre();
                 read.close();
				System.exit(0);
			}

			switch (option) {
				case 1:
					System.out.println("Adicionar GPU \n\n");
					
					System.out.println("Digite a Marca da Placa: ");
					marca = read.next();
					System.out.println("Digite o Modelo da Placa: ");
					modelo = read.next();
					System.out.println("Digite o Nome do Vendedor: ");
					read.skip("\\R?");
					proprietario = read.nextLine();
					
					do {
						System.out.println("Digite o Tipo de GPU (1-Games ou 2-Modelagem): ");
						tipo = read.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Digite o Valor da GPU (R$): ");
					valor = read.nextFloat();
					
					switch(tipo) {
						case 1 -> {
							//System.out.println("Digite o Limite de Crédito (R$): ");
							games = true;
							gpus.cadastrar(new PlacasGames(gpus.gerarNumero(), modelo, tipo, marca, valor, games));
						}
						case 2 -> {
							//System.out.println("Digite o dia do Aniversário da Conta: ");
							modelagem = true;
							gpus.cadastrar(new PlacasModelagem(gpus.gerarNumero(), modelo, tipo, marca, valor, modelagem));
						}
					}
					
					keyPress();
					break;
				case 2:
					System.out.println("Listar todas as GPUs\n\n");
					gpus.listarTodas();
					
					keyPress();
					break;
				case 3:
					System.out.println("Buscar GPU por código\n\n");
					System.out.println("Digite o código da GPU: ");
					numero = read.nextInt();
					
					gpus.procurarPorCodigo(numero);
					
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar Infos da GPU\n\n");
					
					keyPress();
					break;
				case 5:
					System.out.println("Apagar cadastro de GPU \n\n");
					
					keyPress();
					break;
				case 6:
					System.out.println("Definir preço da GPU  \n\n");
					
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("	Projeto Desenvolvido por: Rodrigo Schort     ");
		System.out.println("	Email:  rodrigoschort01@gmail.com"            );
		System.out.println("	Github: https://github.com/Cyberdrick"        );
	}
	
public static void keyPress() {
		
		try {
			
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
			
		}catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}
}
