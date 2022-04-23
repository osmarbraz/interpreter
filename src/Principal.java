
import com.interpreter.terminal.Expression;
import com.interpreter.ExpressionUtils;
import com.interpreter.terminal.NumberExpression;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {
        expressao1();
        expressao2();
    }

    static void expressao1() {
        //Expressão a ser avaliada usando notação polonesa
        String tokenString = "7 3 +";

        //Pilha da expressão
        Stack<Expression> stack = new Stack<>();
        //Tokeniza a string e passa por elas uma a uma        
        String[] tokenArray = tokenString.split(" ");
        //Percorre os tokens
        for (String s : tokenArray) {
            //Verifica se é um operador
            if (ExpressionUtils.isOperator(s)) {
                //Quando um operador é encontrado, esperamos que os números 
                //´possam ser exibidos do topo pilha
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                //O resultado da operação é colocado no topo da pilha
                stack.push(new NumberExpression(result));
            } else {
                //Os números são colocados no topo da pilha
                Expression i = new NumberExpression(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("Expressao 1: ( " + tokenString + " ): " + stack.pop().interpret());
    }

    static void expressao2() {
        //Expressão a ser avaliada usando notação polonesa
        String tokenString = "7 3 - 2 1 + * 2 /";

        //Pilha da expressão
        Stack<Expression> stack = new Stack<>();
        //Tokeniza a string e passa por elas uma a uma        
        String[] tokenArray = tokenString.split(" ");
        //Percorre os tokens
        for (String s : tokenArray) {
            //Verifica se é um operador
            if (ExpressionUtils.isOperator(s)) {
                //Quando um operador é encontrado, esperamos que os números 
                //´possam ser exibidos do topo pilha
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                //O resultado da operação é colocado no topo da pilha
                stack.push(new NumberExpression(result));
            } else {
                //Os números são colocados no topo da pilha
                Expression i = new NumberExpression(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("Expressao 2: ( " + tokenString + " ): " + stack.pop().interpret());
    }
}
