package br.com.handit.calculadora_antlr.engine;

import java.util.HashMap;
import java.util.Map;

import br.com.handit.calculadora_antlr.Value;
import br.com.handit.calculadora_antlr.engine.interfaces.IMemoryController;
import br.com.handit.calculadora_antlr.exceptions.VarNotDefinedException;

public class MemoryController implements IMemoryController {

	Map<String, Value> memory;

	public MemoryController() {
		memory = new HashMap<String, Value>();
	}

	@Override
	public Value get(String identifier) {
		if(!memory.containsKey(identifier)) {
			throw new VarNotDefinedException();
		}

		return memory.get(identifier);
	}

	@Override
	public Value put(String identifier, Value value) {
		return memory.put(identifier,value);
	}

//	@Override
//	public void put(String identifier, Object value) {
//		// TODO Auto-generated method stub
//		
//	}

}