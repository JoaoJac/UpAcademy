package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;

public class MenuCreateProduct extends State {

	@Override
	public int show() {
		System.out.println("Inserir desconto");
		double desconto = scu.getDouble();
		System.out.println("Inserir iva");
		int iva = scu.getIva();
		System.out.println("Inserir preço");
		int preco = scu.getInt();
		Product p = new Product(desconto,iva,preco);
		prodRep.createEntity(p);
		System.out.println("--- Produto criado ---");
		return 1;
	}

}
