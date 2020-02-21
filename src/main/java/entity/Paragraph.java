package entity;

import java.util.ArrayList;
import java.util.Iterator;

public class Paragraph extends TextComponent {
    private ArrayList<Sentence> sentences;


    @Override
    void print() {
        Iterator<Sentence> iterator = sentences.iterator();
        while (iterator.hasNext()){
            Sentence sentence = iterator.next();
            sentence.print();
        }
    }
}
