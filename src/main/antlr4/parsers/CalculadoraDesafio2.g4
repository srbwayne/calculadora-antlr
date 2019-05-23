grammar CalculadoraDesafio1;

// TODO: calculadora
calc : INT eof;
INT  : [0-9]+;

eof : EOF;