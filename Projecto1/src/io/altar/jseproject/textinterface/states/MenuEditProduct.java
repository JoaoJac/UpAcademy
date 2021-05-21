package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;

public class MenuEditProduct extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		Product p = prodRep.getEntityById(id);
		System.out.println("Inserir desconto");
		p.setDiscount(scu.getIntInRange(1, 99));
		System.out.println("Inserir iva");
		p.setIva(scu.getIva());
		System.out.println("Inserir preço");
		p.setPrice(scu.getDouble());
		prodRep.editEntity(p);
		System.out.println("--- Produto editado ---");
		return 1;
	}

}
