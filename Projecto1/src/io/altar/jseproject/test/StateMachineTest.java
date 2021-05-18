package io.altar.jseproject.test;

import java.util.Arrays;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.textinterface.StateMachine;

public class StateMachineTest {
	public static void main(String[] args) {
		fillMockData();
		StateMachine sM = new StateMachine();
		sM.start();
	}
	private static void fillMockData() {
		ProductRepository prodRep = ProductRepository.getInstance();
		ShelfRepository shelfRep = ShelfRepository.getInstance();
		Product prod1 = new Product(Arrays.asList(1L),20,23,100);
		prodRep.createEntity(prod1);
		Product prod2 = new Product(Arrays.asList(2L),30,23,777);
		prodRep.createEntity(prod2);
		Product prod3 = new Product(Arrays.asList(3L),40,23,999);
		prodRep.createEntity(prod3);
		
		Shelf sh1 = new Shelf(1, prod1, 99.99);
		shelfRep.createEntity(sh1);
		Shelf sh2 = new Shelf(1, prod2, 11.11);
		shelfRep.createEntity(sh2);
		Shelf sh3 = new Shelf(1, prod3, 77.77);
		shelfRep.createEntity(sh3);	
	}
}
