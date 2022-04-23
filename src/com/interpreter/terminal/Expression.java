package com.interpreter.terminal;

/**
 * Expressão Abstrata.
 *
 * Para poder interpretar matemática básica, precisamos de uma `hierarquia de
 * expressões. A abstração básica para isso é a classe Expression.
 */
public interface Expression {

    public int interpret();

    @Override
    public abstract String toString();
}
