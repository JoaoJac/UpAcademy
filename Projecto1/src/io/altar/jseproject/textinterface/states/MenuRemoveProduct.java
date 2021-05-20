package io.altar.jseproject.textinterface.states;

public class MenuRemoveProduct extends State {

	@Override
	public int show() {
		System.out.println("Inserir ID do produto");
		long id = scu.getLong();
		if(prodRep.getEntityById(id) != null) {
			System.out.println("Deseja remover "+ prodRep.getEntityById(id) + "? (Sim or Não)");
			if(scu.getAnswer().equalsIgnoreCase("sim")) {
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
