package service;

public class TextSorter {
    public void sortParagraphsByCountOfSentences() {
        Arrays.sort(paragraphs, comparingInt(o -> o.split(SENTENCE_SPLIT_REGEX).length));
    }

    private void sortWordsInSentencesByLength() {
        for (String[] sen : sentences)
            Arrays.sort(sen, comparingInt(String::length));
    }

    private void sortWordsByFrequencyOfChar(char c) {
        for (String[] sen : sentences)
            Arrays.sort(sen, comparingInt((String o) -> countChar(o, c))
                    .reversed()
                    .thenComparing(String.CASE_INSENSITIVE_ORDER));
    }
}
