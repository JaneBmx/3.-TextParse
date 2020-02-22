package rpn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final static Calculator INSTANCE = new Calculator();

    private Calculator() {
    }

    public static Calculator getInstance() {
        return INSTANCE;
    }

    public Integer calculate(List<String> expression) {
        List<String> polishExpression = ReversePolishNotation.toPolishRecord(expression);
        List<Operators> listMathExpressions = toMathExpressionList(polishExpression);
        ArrayDeque<Integer> context = new ArrayDeque();
        for (Operators mathPartExpression : listMathExpressions) {
            mathPartExpression.calculate(context);
            //TODO fix
        }
        return context.pop();
    }

    private List<Operators> toMathExpressionList(List<String> polishExpression) {
        List<Operators> listExpression = new ArrayList<>();
        for (String partOfPolishExpression : polishExpression) {
            switch (partOfPolishExpression) {
                case "|":
                    listExpression.add(Operators.OR);
                    break;
                case "&":
                    listExpression.add(Operators.AND);
                    break;
                case "^":
                    listExpression.add(Operators.CAP);
                    break;
                case "<<":
                    listExpression.add(Operators.LEFT_SHIFT);
                    break;
                case ">>":
                    listExpression.add(Operators.RIGHT_SHIFT);
                    break;
                default:
                    int value = Integer.parseInt(partOfPolishExpression);
                    listExpression.add(Operators.NUMBER);
                    break;
                //TODO check default condition
            }
        }
        return listExpression;
    }
}
