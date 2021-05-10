lexer grammar LexerRules;

NUMBER : ('0' .. '9') + ('.' ('0' .. '9') +)?;

LPAREN: '(';
RPAREN: ')';
ATRIB: ':'? '=';

PLUS: 	'+';
MINUS: 	'-';
TIMES: 	'*';
DIV: 	'/';
POW: 	'^';

WS: [\t\r\n ]+ -> skip;
VAR: [_a-zA-Z0-9]+ ;