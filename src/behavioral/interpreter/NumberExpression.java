package behavioral.interpreter;

public class NumberExpression extends Expression<Integer> {

    private Integer number;

    public NumberExpression(Integer number) {
        this.number = number;
    }

    @Override
    public Integer interpret() {
        return number;
    }

}
