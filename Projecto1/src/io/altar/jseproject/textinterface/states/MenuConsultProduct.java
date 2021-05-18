package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;

public class MenuConsultProduct extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		Product p = prodRep.getEntityById(id);
		System.out.println(p);
		System.out.println("--------------------------------//--------------------------------");
		return 1;
	}

}
