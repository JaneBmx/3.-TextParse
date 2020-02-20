package entity;

import java.util.ArrayList;
import java.util.Iterator;

public class Lexeme extends Component {
    private ArrayList<Word> words;

    @Override
    void print() {
        Iterator<Word> iterator = words.iterator();
        while (iterator.hasNext()) {
            Word word = iterator.next();
            word.print();
        }
    }
}
