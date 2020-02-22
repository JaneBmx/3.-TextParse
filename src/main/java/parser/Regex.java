package parser;

public class Regex {
    public static final String TEXT_SPLIT_REGEX = "\\s{4}\\s*";

    public static final String PARAGRAPH_SPLIT_REGEX = "(\\.\\.\\.)|\\.|\\?|\\!\\s*";

    public static final String SENTENCE_SPLIT_REGEX = "\\s";

    public static final String LEXEME_WORD_REGEX = "([^\\d\\W]+\\-?)+";
    public static final String LEXEME_WORD_REGEX_WITH_BRACKETS = "\\([^\\d\\W]+\\)";
    public static final String LEXEME_WORD_REGEX_WITH_FIRST_BRACKET = "\\([^\\d\\W]+";
    public static final String LEXEME_WORD_REGEX_WITH_LAST_SYMBOL = "\\(?\\w+\\)?[\\)\\,]";
    public static final String LEXEME_MATH_REGEX = "[<<||>>\\&\\|||\\^\\(||\\)]";
    public static final String LEXEME_EXPRESSION_REGEX = "(" + LEXEME_MATH_REGEX + "*" + "\\d+" + LEXEME_MATH_REGEX + "*)+";

    public static final String EXPRESSION_SPLIT_REGEX = "(?<=((>>)|(<<)|(&)|(\\^)|(\\|)|\\(|\\)))|(?=((>){2}|(<){2}|(&)|(\\^)|(\\|)|\\(|\\)))";

    public static final String NUMBER_REGEX = "\\d+";
}
