package service;

import entity.TextComponent;

import static validator.TextComponentValidator.*;

public class TextSorter {


//    public void sortParagraphsByCountOfSentences() {
//        Arrays.sort(paragraphs, comparingInt(o -> o.split(SENTENCE_SPLIT_REGEX).length));
//    }

    public void sortWordsInSentencesByLength() {
        for (String[] sen : sentences)
            Arrays.sort(sen, comparingInt(String::length));
    }

    public void sortWordsByFrequencyOfChar(char c) {
        for (String[] sen : sentences)
            Arrays.sort(sen, comparingInt((String o) -> countChar(o, c))
                    .reversed()
                    .thenComparing(String.CASE_INSENSITIVE_ORDER));
    }

    public void sortParagraphsByCountOfSentences(TextComponent textComponent){
        if (isText(textComponent)){

        }

    }
}
