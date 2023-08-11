package behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Interpreter<Integer> interpreter = new Interpreter();
        interpreter.addExpression("1 + 2",
                new AddExpression(new NumberExpression(1), new NumberExpression(2)));
        Integer result = interpreter.interpret("1 + 2");
        System.out.println("The text result is " + result);
    }
}
