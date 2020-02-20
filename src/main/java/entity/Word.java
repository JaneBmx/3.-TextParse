package entity;

import java.util.ArrayList;
import java.util.Iterator;

public class Word extends Component {
    ArrayList<Symbol> symbols;


    @Override
    void print() {
        Iterator<Symbol> iterator = symbols.iterator();
        while (iterator.hasNext()) {
            Symbol symbol = iterator.next();
            symbol.print();
        }
    }
}
