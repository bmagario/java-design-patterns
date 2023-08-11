package behavioral.interpreter;

public class AddExpression extends Expression<Integer> {

    private Expression<Integer> leftExpression;
    private Expression<Integer> rightExpression;

    public AddExpression(Expression<Integer> leftExpression, Expression<Integer> rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Integer interpret() {
        Integer leftValue = leftExpression.interpret();
        Integer rightValue = rightExpression.interpret();
        return leftValue + rightValue;
    }
}
