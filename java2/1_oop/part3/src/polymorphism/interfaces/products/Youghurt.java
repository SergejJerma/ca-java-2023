package polymorphism.interfaces.products;

class Youghurt implements Product,CaloriesNumber {
    private final int expirationLevel;
    private final int calories;

    Youghurt(int expirationLevel, int calories) {
        this.expirationLevel = expirationLevel;
        this.calories = calories;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 2;
    }

    @Override
    public int calories() {
        return calories;
    }
}
