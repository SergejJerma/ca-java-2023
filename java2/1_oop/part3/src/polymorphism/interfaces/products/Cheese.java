package polymorphism.interfaces.products;

class Cheese implements Product, CaloriesNumber {
    private final int expirationLevel;
    private final int calories;

    Cheese(int expirationLevel, int calories) {
        this.expirationLevel = expirationLevel;
        this.calories = calories;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }

    @Override
    public int calories() {
        return calories;
    }
}
