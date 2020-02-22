package rpn;

import java.util.ArrayDeque;

enum Operators {
    AND {
        public void calculate(ArrayDeque<Integer> content) {
            content.push((Integer) content.pop() & (Integer) content.pop());
        }
    },
    CAP {
        public void calculate(ArrayDeque content) {
            content.push((Integer) content.pop() ^ (Integer) content.pop());
        }
    },
    OR {
        public void calculate(ArrayDeque content) {
            content.push((Integer) content.pop() | (Integer) content.pop());
        }
    },
    LEFT_SHIFT {
        public void calculate(ArrayDeque content) {
            content.push((Integer) content.pop() << (Integer) content.pop());
        }
    },
    RIGHT_SHIFT {
        public void calculate(ArrayDeque content) {
            content.push((Integer) content.pop() >> (Integer) content.pop());
        }
    },
    NUMBER {
        private int number;

        public void calculate(ArrayDeque content) {
            content.push(number);
        }
    },

}
