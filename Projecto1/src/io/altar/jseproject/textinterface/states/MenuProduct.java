package io.altar.jseproject.textinterface.states;

public class MenuProduct extends State {

	@Override
	public int show() {
		listarProdutos();
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		System.out.println("Selecionar opção: (1 2 3 4 5)");

		return scu.getIntInRange(1,5);
	}
	
	private void listarProdutos() {
		prodRep.getAll().forEach(x -> System.out.println(x));
		
	}
}
