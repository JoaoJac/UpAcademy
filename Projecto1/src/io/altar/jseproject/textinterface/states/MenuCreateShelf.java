package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Shelf;

public class MenuCreateShelf extends State {

	@Override
	public int show() {
		System.out.println("Inserir capacidade");
		int capacity = scu.getIntInRange(0,1);
		System.out.println("Inserir preço diário de aluguer");
		double dailyPrice = scu.getDouble();
		Shelf sh = new Shelf(capacity, dailyPrice);
		shelfRep.createEntity(sh);
		System.out.println("--- Prateleira criada ---");
		return 1;
	}

}
