package com.interpreter.nonterminal;

import com.interpreter.terminal.Expression;

/**
 * Expressão Não Terminal.
 *
 * Uma dessas classes é necessária para cada regra R ::= R1 R2 ... Rnna
 * gramática. Mantém variáveis ​​de instância do tipo AbstractExpressionpara
 * cada um dos símbolos R1por meio de Rn. Implementa uma Interpret operação para
 * símbolos não terminais na gramática. Interpret normalmente chama a si mesmo
 * recursivamente nas variáveis ​​que representam R1por meio de Rn.
 */
public class Division implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Division(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() / rightExpression.interpret();
    }

    @Override
    public String toString() {
        return "/";
    }
}
