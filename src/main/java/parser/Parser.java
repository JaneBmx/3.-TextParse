package parser;

import entity.Component;

public interface Parser {
    Component parse(String text);
}
