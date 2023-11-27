package e_commerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import e_commerce.model.PlacasGames;
import e_commerce.model.PlacasModelagem;

public class Menu {

	public static void main(String[] args) {
		
		
		// Teste da Classe PlacasGames
			PlacasGames cc1 = new PlacasGames(1, "RX", 1, "AMD", 10000.0f, true);
			cc1.visualizar();
			cc1.setGames(false);
			cc1.visualizar();
				
		// Teste da Classe PlacasModelagem
			PlacasModelagem cp1 = new PlacasModelagem(1, "RX", 2, "AMD", 10000.0f, true);
			cp1.visualizar();
			cp1.setModelagem(false);
		    cp1.visualizar();
		

		Scanner read = new Scanner(System.in);

		int option;

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
			
			try {
				option = read.nextInt();
			}catch(InputMismatchException e){
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

					break;
				case 2:
					System.out.println("Listar todas as GPUs\n\n");

					break;
				case 3:
					System.out.println("Buscar GPU por código\n\n");

					break;
				case 4:
					System.out.println("Atualizar Infos da GPU\n\n");

					break;
				case 5:
					System.out.println("Apagar cadastro de GPU \n\n");

					break;
				case 6:
					System.out.println("Definir preço da GPU  \n\n");

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
}
