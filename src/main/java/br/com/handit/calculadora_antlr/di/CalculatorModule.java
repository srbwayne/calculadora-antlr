package br.com.handit.calculadora_antlr.di;

import com.google.inject.AbstractModule;

import br.com.handit.calculadora_antlr.engine.MemoryController;
import br.com.handit.calculadora_antlr.engine.interfaces.IMemoryController;

public class CalculatorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IMemoryController.class).to(MemoryController.class);
	}

}