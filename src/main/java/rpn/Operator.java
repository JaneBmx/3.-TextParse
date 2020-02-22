package rpn;

import java.util.ArrayDeque;

enum Operator {
    AND {
        public void calculate(ArrayDeque arrayDeque) {
            arrayDeque.push((Integer) arrayDeque.pop() & (Integer) arrayDeque.pop());
        }
    },
    CAP {
        public void calculate(ArrayDeque arrayDeque) {
            arrayDeque.push((Integer) arrayDeque.pop() ^ (Integer) arrayDeque.pop());
        }
    },
    OR {
        public void calculate(ArrayDeque arrayDeque) {
            arrayDeque.push((Integer) arrayDeque.pop() | (Integer) arrayDeque.pop());
        }
    },
    LEFT_SHIFT {
        public void calculate(ArrayDeque arrayDeque) {
            arrayDeque.push((Integer) arrayDeque.pop() << (Integer) arrayDeque.pop());
        }
    },
    RIGHT_SHIFT {
        public void calculate(ArrayDeque arrayDeque) {
            arrayDeque.push((Integer) arrayDeque.pop() >> (Integer) arrayDeque.pop());
        }
    },
    NUMBER {
        private int number;

        public void calculate(ArrayDeque arrayDeque) {
            arrayDeque.push(number);
        }
    };

    public abstract void calculate(ArrayDeque arrayDeque);
}
