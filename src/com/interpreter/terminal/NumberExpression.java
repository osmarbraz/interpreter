package com.interpreter.terminal;

/**
 * TerminalExpressão.
 *
 * Implementa uma operação interpret associada a símbolos de terminal na
 * gramática. Uma instância é necessária para cada símbolo terminal em uma
 * frase.
 *
 */
public class NumberExpression implements Expression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}
