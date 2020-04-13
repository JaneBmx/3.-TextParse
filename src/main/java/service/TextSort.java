package service;

import entity.Component;
import entity.Composite;
import exception.SortException;

import java.util.Collections;
import java.util.Comparator;

import static validator.TextComponentValidator.*;

public class TextSort {
    public void sortParagraphsByCountOfSentences(Composite textComposite) throws SortException {
        if (isText(textComposite)) {
            Collections.sort(textComposite.getComponents(), (o1, o2) -> {
                Comparator<Component> comparator = Comparator.comparing(Component::getCountComponents);
                return comparator.compare(o1, o2);
            });
        }
        throw new SortException("Invalid type of data.");
    }
}
