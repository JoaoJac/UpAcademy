package io.altar.jseproject.textinterface.states;

public class MenuRemoveShelf extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID da prateleira");
		long id = scu.getLong();
		if(shelfRep.getEntityById(id) != null) {
			System.out.println("Deseja remover "+ shelfRep.getEntityById(id) + "? (Sim or Não)");
			if(scu.getAnswer().equalsIgnoreCase("sim")) {
				shelfRep.removeEntityById(id);
				System.out.println("--- Prateleira removida ---");
			}
		}	else {
				System.out.println("Prateleira não encontrada");
				return 2;
			}
		return 1;
	}
}
