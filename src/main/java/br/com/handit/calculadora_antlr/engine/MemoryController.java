package br.com.handit.calculadora_antlr.engine;

import java.util.HashMap;
import java.util.Map;

import br.com.handit.calculadora_antlr.engine.interfaces.IMemoryController;
import br.com.handit.calculadora_antlr.exceptions.VarNotDefinedException;

public class MemoryController implements IMemoryController {

	Map<String, Double> memory;

	public MemoryController() {
		memory = new HashMap<String, Double>();
	}

	@Override
	public Double get(String identifier) {
		if(!memory.containsKey(identifier)) {
			throw new VarNotDefinedException();
		}

		return memory.get(identifier);
	}

	@Override
	public void put(String identifier, Object value) {
		memory.put(identifier,(Double) value);

	}

}