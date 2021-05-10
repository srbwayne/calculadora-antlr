package br.com.handit.calculadora_antlr.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Instance {
	private static final Injector injector = Guice.createInjector(new CalculatorModule());

	public static <T> T get(Class<T> type) {
		return injector.getInstance(type);
	}
}