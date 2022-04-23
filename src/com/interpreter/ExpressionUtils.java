package com.interpreter;

import com.interpreter.nonterminal.Substract;
import com.interpreter.nonterminal.Add;
import com.interpreter.nonterminal.Division;
import com.interpreter.nonterminal.Product;
import com.interpreter.terminal.Expression;

/**
 * Contexto.
 *
 * Contém informações globais para o interpretador.
 */
public class ExpressionUtils {

    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return true;
        } else {
            return false;
        }
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Substract(left, right);
            case "*":
                return new Product(left, right);
            case "/":
                return new Division(left, right);
        }
        return null;
    }

}
