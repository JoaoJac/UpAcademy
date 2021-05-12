package io.altar.jseproject.textinterface;

import io.altar.jseproject.utils.ScannerUtils;

public class TextInterface {
	ScannerUtils scu = new ScannerUtils();
	
	public void ecraInicio() {
		while(true) {
			System.out.println("1) Listar Produtos");
			System.out.println("2) Listar Prateleiras");
			System.out.println("3) Sair");
			System.out.println("Selecionar opção: (1 2 3)");

			int userChoice = scu.getIntInRange(1,3);

			switch(userChoice) {
			case 1:
				ecraProdutos();
				break;
			case 2:
				ecraPrateleira();
				break;
			case 3:
				return;
			}
		}
	}
	
	private void ecraProdutos() {
		while(true) {
			listarProdutos();
			System.out.println("1) Criar novo produto");
			System.out.println("2) Editar um produto existente");
			System.out.println("3) Consultar o detalhe de um produto");
			System.out.println("4) Remover um produto");
			System.out.println("5) Voltar ao ecrã anterior");
			System.out.println("Selecionar opção: (1 2 3 4 5)");

			int userChoice = scu.getIntInRange(1,5);

			switch(userChoice) {
			case 1:
				ecraCriarProduto();
				break;
			case 2:
				ecraEditarProduto();
				break;
			case 3:
				ecraConsultarProduto();
				break;
			case 4:
				ecraRemoverProduto();
				break;
			case 5:
				return;
			}
		}
	}	
	
	private void listarProdutos() {
		// TODO
		System.out.println("... Lista de Produtos ...");
	}

	private void ecraCriarProduto() {
		// TODO
		System.out.println("... Ecra Criar Produto ...");
	}
	private void ecraEditarProduto() {
		// TODO
		System.out.println("... Ecra Editar Produto ...");
	}
	private void ecraConsultarProduto() {
		// TODO
		System.out.println("... Ecra Consultar Produto ...");
	}
	private void ecraRemoverProduto() {
		// TODO
		System.out.println("... Ecra Remover Produto ...");
	}

	private void ecraPrateleira() {
		while(true) {
			listarPrateleiras();
			System.out.println("1) Criar nova prateleira");
			System.out.println("2) Editar uma prateleira existente");
			System.out.println("3) Consultar o detalhe de uma prateleira");
			System.out.println("4) Remover uma prateleira");
			System.out.println("5) Voltar ao ecrã anterior");
			System.out.println("Selecionar opção: (1 2 3 4 5)");

			int userChoice = scu.getIntInRange(1,5);

			switch(userChoice) {
			case 1:
				ecraCriarPrateleira();
				break;
			case 2:
				ecraEditarPrateleira();
				break;
			case 3:
				ecraConsultarPrateleira();
				break;
			case 4:
				ecraRemoverPrateleira();
				break;
			case 5:
				return;
			}
		}
	}
	
	private void listarPrateleiras() {
		// TODO
		System.out.println("... Lista de Prateleiras ...");
	}

	private void ecraCriarPrateleira() {
		// TODO
		System.out.println("... Ecra Criar Prateleira ...");
	}
	private void ecraEditarPrateleira() {
		// TODO
		System.out.println("... Ecra Editar Prateleira ...");
	}
	private void ecraConsultarPrateleira() {
		// TODO
		System.out.println("... Ecra Consultar Prateleira ...");
	}
	private void ecraRemoverPrateleira() {
		// TODO
		System.out.println("... Ecra Remover Produto ...");
	}
}
