package parser;

import entity.Composite;
import rpn.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static parser.Regex.*;

public class ExpressionParser implements Parser {
    private Calculator calculator = Calculator.getInstance();
    private NumberParser parser;

    @Override
    public Composite parse(String text) {
        List<String> expression = splitExpression(text);
        Integer result = calculator.calculate(expression);
        return parser.parse(String.valueOf(result));
    }

    private List<String> splitExpression(String expression) {
        List<String> array = Arrays.asList(expression.split(EXPRESSION_SPLIT_REGEX));
        return new ArrayList<>(array);
    }
}
