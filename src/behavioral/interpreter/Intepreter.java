package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

class Interpreter<T> {

    private Map<String, Expression<T>> expressions = new HashMap<>();

    public void addExpression(String expression, Expression<T> expressionObject) {
        expressions.put(expression, expressionObject);
    }

    public T interpret(String text) {
        Expression<T> expression = expressions.get(text);
        if (expression == null) {
            throw new IllegalArgumentException("Unknown expression: " + text);
        }

        return expression.interpret();
    }

}

