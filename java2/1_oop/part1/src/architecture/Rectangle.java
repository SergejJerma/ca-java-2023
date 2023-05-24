package architecture;

/* neintuityvu...
    ...bet kam kvadratui tureti 2 kintamuosius, jeigu uztenka vieno?
     potencialiai galim sutaulyt daug atminties (RAM)   */
public class Rectangle extends Square {

    int lengthB;

    @Override
    public int perimeter() {
        return 2 * (lengthA + lengthB);
    }

    @Override
    public int area() {
        return lengthA * lengthB;
    }

    public int getLengthB() {
        return lengthB;
    }

    public void setLengthB(int lengthB) {
        this.lengthB = lengthB;
    }
}
