package io.altar.jseproject.textinterface.states;

import java.util.List;

public class MenuRemoveProduct extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		if(prodRep.getEntityById(id) != null) {
			System.out.println("Deseja remover "+ prodRep.getEntityById(id) + "? (Sim or Não)");
			if(scu.getAnswer().equalsIgnoreCase("sim")) {
				List<Long> shelvesId = prodRep.getEntityById(id).getShelfList();
				shelvesId.forEach(x -> shelfRep.getEntityById(x).setPr(null));
				prodRep.removeEntityById(id);
				System.out.println("--- Produto removido ---");
			}
		} 	else {
				System.out.println("Produto não encontrado");
				return 2;
			}
		return 1;
	}
}
