grammar CalculadoraDesafio1;

import LexerRules;

calc: expression+;


expression
   :  expression POW expression 	#pow
   |  expression TIMES expression 	#mult
   |  expression DIV expression 	#div
   |  expression PLUS expression 	#plus
   |  expression MINUS expression 	#minus
   |  LPAREN expression RPAREN 		#parens
   |  VAR ATRIB expression 			#assign
   |  NUMBER 						#number
   |  VAR                           #var
   ;