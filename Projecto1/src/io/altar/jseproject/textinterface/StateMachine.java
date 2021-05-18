package io.altar.jseproject.textinterface;

import io.altar.jseproject.textinterface.states.*;

public class StateMachine {
	private State[] states = { 
			new MenuInit(),       		// State 0
			new MenuProduct(),    		// State 1
			new MenuShelf(),      		// State 2
			new MenuCreateProduct(),	// State 3
			new MenuEditProduct(),		// State 4
			new MenuConsultProduct(),	// State 5
			new MenuRemoveProduct(),	// State 6
			new MenuCreateShelf(),		// State 7
			new MenuEditShelf(),		// State 8
			new MenuConsultShelf(),		// State 9
			new MenuRemoveShelf(),		// State 10
	};
	// 4. transitions
	private int[][] transition = { 
			{ 1, 2 }, 			  		// State 0 -> MenuInicial
			{ 3, 4, 5, 6, 0 },    		// State 1 -> MenuProduct
			{ 7, 8, 9, 10, 0 },    		// State 2 -> MenuShelf
			{ 1 },    			  		// State 3 -> MenuCreateProduct
			{ 1 },    			  		// State 4 -> MenuEditProduct
			{ 1 },    			  		// State 5 -> MenuConsultProduct
			{ 1 },    			  		// State 6 -> MenuRemoveProduct
			{ 2 },    			  		// State 7 -> MenuCreateShelf
			{ 2 },    			  		// State 8 -> MenuEditShelf
			{ 2 },    			  		// State 9 -> MenuConsultShelf
			{ 2 },    			  		// State 10 -> MenuRemoveShelf
	};
	// 3. current
	private int current = 0;

	// 5. All client requests are simply delegated to the current state object
	public void start() {
		while (true) {
			int option = states[current].show();
			if (current == 0 && option == 3) {
				return;
			}
			current = transition[current][option - 1];
		}
	}
}
