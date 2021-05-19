package io.altar.jseproject.textinterface;

import java.util.Arrays;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.utils.ScannerUtils;

public class TextInterface {
	ScannerUtils scu = new ScannerUtils();
	ProductRepository prodRep = ProductRepository.getInstance();
	ShelfRepository shelfRep = ShelfRepository.getInstance();
	
	public void ecraInicio() {
		fillMockData();
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
		listarProdutos();
		while(true) {
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
		prodRep.getAll().forEach(x -> System.out.println(x));
		
	}

	private void ecraCriarProduto() {
		System.out.println("Inserir desconto");
		int desconto = scu.getInt();
		System.out.println("Inserir iva");
		int iva = scu.getInt();
		System.out.println("Inserir preço");
		double preco = scu.getDouble();
		Product p = new Product(desconto,iva,preco);
		prodRep.createEntity(p);
		System.out.println("--- Produto criado ---");
	}
	private void ecraEditarProduto() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		Product p = prodRep.getEntityById(id);
		System.out.println("Inserir desconto");
		p.setDiscount(scu.getInt());
		System.out.println("Inserir iva");
		p.setIva(scu.getInt());
		System.out.println("Inserir preço");
		p.setPrice(scu.getDouble());
		prodRep.editEntity(p);
		System.out.println("--- Produto editado ---");
	}
	
	private void ecraConsultarProduto() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		Product p = prodRep.getEntityById(id);
		System.out.println(p);
	}
	private void ecraRemoverProduto() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		prodRep.removeEntityById(id);
		System.out.println("--- Produto removido ---");
	}

	private void ecraPrateleira() {
		listarPrateleiras();
		while(true) {
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
		shelfRep.getAll().forEach(x -> System.out.println(x));
	}

	private void ecraCriarPrateleira() {
		System.out.println("Inserir capacidade");
		int capacity = scu.getInt();
		System.out.println("Inserir preço diário de aluguer");
		double dailyPrice = scu.getDouble();
		Shelf sh = new Shelf(capacity, dailyPrice);
		shelfRep.createEntity(sh);
		System.out.println("--- Prateleira criada ---");
	}
	private void ecraEditarPrateleira() {
		System.out.println("Inserir ID da prateleira");
		long id = scu.getLong();
		Shelf sh = shelfRep.getEntityById(id);
		Product p = sh.getPr();
		System.out.println("Inserir desconto do Produto");
		p.setDiscount(scu.getInt());
		System.out.println("Inserir iva do Produto");
		p.setIva(scu.getInt());
		System.out.println("Inserir preço do Produto");
		p.setPrice(scu.getDouble());
		System.out.println("Inserir capacidade");
		sh.setCapacity(scu.getInt());
		System.out.println("Inserir preço diário de aluguer");
		sh.setDailyPrice(scu.getDouble());
		shelfRep.editEntity(sh);
		System.out.println("--- Prateleira editada ---");
	}
	private void ecraConsultarPrateleira() {
		System.out.println("Inserir ID da prateleira");
		long id = scu.getLong();
		Shelf sh = shelfRep.getEntityById(id);
		System.out.println(sh);
	}
	private void ecraRemoverPrateleira() {
		System.out.println("Inserir ID da prateleira");
		long id = scu.getLong();
		shelfRep.removeEntityById(id);
		System.out.println("--- Prateleira removida ---");
	}
	
	private void fillMockData() {
		Product prod1 = new Product(Arrays.asList(1L),20,23,100);
		prodRep.createEntity(prod1);
		Product prod2 = new Product(Arrays.asList(2L),30,23,777);
		prodRep.createEntity(prod2);
		Product prod3 = new Product(Arrays.asList(3L),40,23,999);
		prodRep.createEntity(prod3);
		
		Shelf sh1 = new Shelf(1, prod1, 99.99);
		shelfRep.createEntity(sh1);
		Shelf sh2 = new Shelf(1, prod2, 11.11);
		shelfRep.createEntity(sh2);
		Shelf sh3 = new Shelf(1, prod3, 77.77);
		shelfRep.createEntity(sh3);	
	}
}
