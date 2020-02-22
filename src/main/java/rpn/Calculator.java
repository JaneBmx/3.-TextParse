package rpn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private Calculator() {
    }

    private static class Holder {
        private static final Calculator INSTANCE = new Calculator();
    }

    public static Calculator getInstance() {
        return Holder.INSTANCE;
    }

    public Integer calculate(List<String> expression) {
        List<String> reversePolishNotation = ReversePolishNotation.toReversePolishNotation(expression);
        List<Operator> expressions = toMathExpressionList(reversePolishNotation);
        ArrayDeque<Integer> content = new ArrayDeque<>();

        for (Operator op : expressions) {
            op.calculate(content);
        }
        return content.pop();
    }

    private List<Operator> toMathExpressionList(List<String> polishExpression) {
        List<Operator> listExpression = new ArrayList<>();
        for (String partOfPolishExpression : polishExpression) {
            switch (partOfPolishExpression) {
                case "|":
                    listExpression.add(Operator.OR);
                    break;
                case "&":
                    listExpression.add(Operator.AND);
                    break;
                case "^":
                    listExpression.add(Operator.CAP);
                    break;
                case "<<":
                    listExpression.add(Operator.LEFT_SHIFT);
                    break;
                case ">>":
                    listExpression.add(Operator.RIGHT_SHIFT);
                    break;
                default:
                    int value = Integer.parseInt(partOfPolishExpression);
                    listExpression.add(Operator.NUMBER);
                    break;
                //TODO how to add value in NUMBER?
            }
        }
        return listExpression;
    }
}
