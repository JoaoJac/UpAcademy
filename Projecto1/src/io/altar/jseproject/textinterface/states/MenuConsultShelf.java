package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Shelf;

public class MenuConsultShelf extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID da prateleira");
		long id = scu.getLong();
		Shelf sh = shelfRep.getEntityById(id);
		System.out.println(sh);
		System.out.println("--------------------------------//--------------------------------");
		return 1;
	}

}
