package enums;

//Every enum behind the scenes extends this class.
import java.lang.Enum;


public enum Operation {
    PLUS {
        public int apply(int x, int y) { return x + y; }
    },
    MINUS {
        public int apply(int x, int y) { return x - y; }
    },
    TIMES {
        public int apply(int x, int y) { return x * y; }
    },
    DIVIDE {
        public int apply(int x, int y) { return x / y; }
    };

    // Each enum constant must implement this method.
    public abstract int apply(int x, int y);
}
