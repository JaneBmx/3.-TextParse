package parser;

import entity.Component;
import entity.ComponentType;
import entity.Composite;

import static parser.Regex.*;

public class LexemeParser implements Parser {
    private WordParser wordParser;
    private ExpressionParser expressionParser;
    private SymbolParser symbolParser;

    @Override
    public Composite parse(String text) {
        Composite lexeme = new Composite(ComponentType.LEXEME);

        if (text.length() == 1) {
            addSymbol(lexeme, text);
        } else if (text.matches(LEXEME_WORD_REGEX_WITH_BRACKETS)) {
            addWordWithBrackets(lexeme, text);
        } else if (text.matches(LEXEME_WORD_REGEX_WITH_FIRST_BRACKET)) {
            addWordWithFirstBracketInLexeme(lexeme, text);
        } else if (text.matches(LEXEME_WORD_REGEX_WITH_LAST_SYMBOL)) {
            addWordWithLastSymbol(lexeme, text);
        } else if (text.matches(LEXEME_WORD_REGEX)) {
            addWord(lexeme, text);
        } else if (text.matches(LEXEME_EXPRESSION_REGEX)) {
            addExpressionInLexeme(lexeme, text);
        } else {
            //throw new IllegalOperationException("Wrong expression");
        }
        return lexeme;
    }

    private void addSymbol(Composite lexeme, String text) {
        Component symbol = symbolParser.parse(text);
        lexeme.add(symbol);
    }

    public void addWord(Composite lexeme, String text) {
        Component word = wordParser.parse(text);
        lexeme.add(word);
    }

    private void addWordWithBrackets(Composite lexeme, String text) {
        Component symbol1 = symbolParser.parse(String.valueOf(text.charAt(0)));
        Component word = wordParser.parse(text.substring(1, text.length() - 1));
        Component symbol2 = symbolParser.parse(String.valueOf(text.charAt(text.length() - 1)));
        lexeme.add(symbol1);
        lexeme.add(word);
        lexeme.add(symbol2);
    }

    private void addWordWithFirstBracketInLexeme(Composite lexeme, String text) {
        Component symbol1 = symbolParser.parse(String.valueOf(text.charAt(0)));
        Component word = wordParser.parse(text.substring(1));
        lexeme.add(symbol1);
        lexeme.add(word);
    }

    private void addWordWithLastSymbol(Composite lexeme, String text) {
        Component word = wordParser.parse(text.substring(0, text.length() - 1));
        Component symbol2 = symbolParser.parse(String.valueOf(text.charAt(text.length() - 1)));
        lexeme.add(word);
        lexeme.add(symbol2);
    }

    private void addExpressionInLexeme(Composite lexeme, String text) {
        Component expression = expressionParser.parse(text);
        lexeme.add(expression);
    }
}