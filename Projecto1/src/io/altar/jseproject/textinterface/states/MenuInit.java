package io.altar.jseproject.textinterface.states;

public class MenuInit extends State {

	@Override
	public int show() {
		System.out.println("1) Listar Produtos");
		System.out.println("2) Listar Prateleiras");
		System.out.println("3) Sair");
		System.out.println("Selecionar opção: (1 2 3)");
	
		return scu.getIntInRange(1,3);
	}
	
}
