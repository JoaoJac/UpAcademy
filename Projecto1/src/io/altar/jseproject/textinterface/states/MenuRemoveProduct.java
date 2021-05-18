package io.altar.jseproject.textinterface.states;

public class MenuRemoveProduct extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		prodRep.removeEntityById(id);
		System.out.println("--- Produto removido ---");
		return 1;
	}

}
