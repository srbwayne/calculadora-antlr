package br.com.handit.calculadora_antlr.engine;

public class CalcEngine {

	public static Double processTimes(double number1, double number2) {
		return number1 * number2;
	}

	public static Double processDiv(double number1, double number2) {
		return number1 / number2;
	}

	public static Double processMinus(double number1, double number2) {
		return number1 - number2;
	}

	public static Double processPlus(double number1, double number2) {
		return number1 + number2;
	}

	public static Double processPow(double number1, double number2) {
		return Math.pow(number1, number2);
	}
}