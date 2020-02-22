package parser;

import entity.Composite;

public interface Parser {
    Composite parse(String text);
}
