package br.com.handit.calculadora_antlr.engine.interfaces;

import br.com.handit.calculadora_antlr.Value;

public interface IMemoryController {
	
	public Value get(String identifier);

//	public void put(String identifier, Object value);

	public Value put(String identifier, Value value);

}
