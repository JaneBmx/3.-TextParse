package rpn;

public enum OperatorPriority {
    OPEN_BRACKET("(", 1),
    CLOSE_BRACKET(")", 1),
    LEFT_SHIFT("<<", 2),
    RIGHT_SHIFT(">>", 2),
    AND("&", 3),
    CAP("^", 4),
    OR("|", 5);

    private String value;
    private int priority;

    OperatorPriority(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public int getPriority() {
        return priority;
    }
}
