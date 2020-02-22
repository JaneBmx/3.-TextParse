package validator;

import entity.ComponentType;
import entity.Component;

public class TextComponentValidator {
    private TextComponentValidator() {
    }

    public static boolean isText(Component component) {
        return component != null && component.getComponentType() == ComponentType.TEXT;
    }
}
