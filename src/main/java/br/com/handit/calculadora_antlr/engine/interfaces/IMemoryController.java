package br.com.handit.calculadora_antlr.engine.interfaces;

public interface IMemoryController {
	
	public Double get(String identifier);

	public void put(String identifier, Object value);

}
