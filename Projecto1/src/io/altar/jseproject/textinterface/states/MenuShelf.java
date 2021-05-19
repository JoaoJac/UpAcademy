package io.altar.jseproject.textinterface.states;

public class MenuShelf extends State {

	@Override
	public int show() {
		listarPrateleiras();
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
		System.out.println("Selecionar opção: (1 2 3 4 5)");

		return scu.getIntInRange(1,5);
	}
	
	private void listarPrateleiras() {
		shelfRep.getAll().forEach(System.out::println);
	}
}
