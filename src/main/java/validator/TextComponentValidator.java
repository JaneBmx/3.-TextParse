package validator;

import entity.ComponentType;
import entity.TextComponent;

public class TextComponentValidator {

    public static boolean isText(TextComponent textComponent){
        return textComponent !=null && textComponent.getComponentType() == ComponentType.TEXT;
    }

}
