package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.utils.ScannerUtils;

public abstract class State {
	ScannerUtils scu = new ScannerUtils();
	ProductRepository prodRep = ProductRepository.getInstance();
	ShelfRepository shelfRep = ShelfRepository.getInstance();

	public abstract int show();
}
