package entity;

import java.util.ArrayList;
import java.util.Iterator;

public class Sentence extends Component{
    private ArrayList<Lexeme> lexemes;

    @Override
    void print() {
        Iterator<Lexeme> iterator = lexemes.iterator();
        while (iterator.hasNext()){
            Lexeme lexeme = iterator.next();
            lexeme.print();
        }
    }
}
