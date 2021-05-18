package io.altar.jseproject.textinterface.states;

public class MenuRemoveShelf extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID da prateleira");
		long id = scu.getLong();
		shelfRep.removeEntityById(id);
		System.out.println("--- Prateleira removida ---");
		return 1;
	}

}
