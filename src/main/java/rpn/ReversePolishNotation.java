package rpn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import static parser.Regex.*;

public class ReversePolishNotation {
    private ReversePolishNotation() {
    }

    private static class Holder {
        private static final ReversePolishNotation INSTANCE = new ReversePolishNotation();
    }

    public static ReversePolishNotation getInstance() {
        return Holder.INSTANCE;
    }

    public static List<String> toReversePolishNotation(List<String> expressions) {
        List<String> polishExpression = new ArrayList<>();
        ArrayDeque<OperatorPriority> stack = new ArrayDeque<>();
        for (String expression : expressions) {
            if (expression.matches(NUMBER_REGEX)) {
                polishExpression.add(expression);
            } else {
                switch (expression) {
                    case "(":
                        stack.push(OperatorPriority.OPEN_BRACKET);
                        break;
                    case ")":
                        while (stack.peek() != OperatorPriority.CLOSE_BRACKET) {
                            polishExpression.add(stack.pop().getValue());
                        }
                        stack.pop();
                        break;
                    case "<<":
                        addOperation(OperatorPriority.LEFT_SHIFT,polishExpression, stack);
                        break;
                    case ">>":
                        addOperation(OperatorPriority.RIGHT_SHIFT,polishExpression, stack);
                        break;
                    case "&":
                        addOperation(OperatorPriority.AND,polishExpression, stack);
                        break;
                    case "^":
                        addOperation(OperatorPriority.CAP,polishExpression, stack);
                        break;
                    case "|":
                        addOperation(OperatorPriority.OR,polishExpression, stack);
                        break;
                }
            }
        }
        while (!stack.isEmpty()) {
            polishExpression.add(stack.pop().getValue());
        }
        return polishExpression;
    }

    private static void addOperation(OperatorPriority operatorPriority, List<String> polishExpression, ArrayDeque<OperatorPriority>stack){
        while (!stack.isEmpty() && getPriority(stack.peek(), operatorPriority)) {
            polishExpression.add(stack.pop().getValue());
        }
        stack.push(operatorPriority);
    }
    private static boolean getPriority(OperatorPriority stackOperation, OperatorPriority currentOperation) {
        return (stackOperation.getPriority() < currentOperation.getPriority() && stackOperation != OperatorPriority.OPEN_BRACKET);
    }
}
