# Desafio 1 : Calculadora básica usando ANTLR

Requisitos:

- Calculadora com operações básicas matemáticas:
    o Adição
    o Subtração
    o Multiplicação
    o Divisão
    o Potência
- Considerar precedência de parênteses
- Criar gramática com ANTLR4.
- Implementar Visitor gerado pela gramática para resolver as operações
    matemáticas.
- A implementação deverá atender aos testes presentes no projeto base.

# Desafio 2: Calculadora com variáveis usando ANTLR

Requisitos:

- Compatibilidade com as expressões usadas no Desafio 1.
- Definir variáveis e utilizar nas expressões. Exemplo:
    ```
    a = 1+2
    b = a^2
    c = a + b * (a - 1)
    a + b + c
    ```
- O resultado deverá ser 33.

# Instruções

O projeto está dividido em:

- src/main/java
    o Classe Calculadora e os Visitors
    o Classes geradas pelo antlr
- src/main/test
    o Classe CalculadoraTest com os testes
- src/main/antlr4/parsers
    o Gramáticas
- Primeiro é necessário implementar as gramáticas (CalculadoraDesafio1.g4 e
    CalculadoraDesafio 2 .g4)
- Após definidas as gramáticas, deve compilar o projeto para gerar as classes do
    ANTLR4 (Talvez será necessário comentar os testes para compilar o projeto ou
    rodar mvn install -DskipTests)
- Após compilar o projeto, deve ser implementado as classes
    CalculadoraDesafio1Visitor e CalculadoraDesafio 2 Visitor.
- Link de documentação do ANTLR
- Link para projeto
    o Fazer fork e depois pullrequest
