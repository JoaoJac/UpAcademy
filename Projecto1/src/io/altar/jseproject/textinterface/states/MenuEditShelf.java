package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;

public class MenuEditShelf extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID da prateleira");
		long id = scu.getLong();
		Shelf sh = shelfRep.getEntityById(id);
		Product p = sh.getPr();
		if(p != null) {
			System.out.println("Inserir desconto do produto");
			p.setDiscount(scu.getInt());
			System.out.println("Inserir iva do produto");
			p.setIva(scu.getInt());
			System.out.println("Inserir preço do produto");
			p.setPrice(scu.getDouble());
		}
		System.out.println("Inserir capacidade");
		sh.setCapacity(scu.getInt());
		System.out.println("Inserir preço diário de aluguer");
		sh.setDailyPrice(scu.getDouble());
		shelfRep.editEntity(sh);
		System.out.println("--- Prateleira editada ---");
		return 1;
	}

}
