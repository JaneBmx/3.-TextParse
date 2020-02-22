package service;

import entity.TextComponent;
import entity.TextComposite;
import exception.SortException;

import java.util.Collections;
import java.util.Comparator;

import static validator.TextComponentValidator.*;

public class TextSorter {
    public void sortParagraphsByCountOfSentences(TextComposite textComposite) throws SortException {
        if (isText(textComposite)) {
            Collections.sort(textComposite.getComponents(), (o1, o2) -> {
                Comparator<TextComponent> comparator = Comparator.comparing(TextComponent::getCountComponents);
                return comparator.compare(o1, o2);
            });
        }
        throw new SortException("Invalid type of data.");
        //TODO log
    }
}
