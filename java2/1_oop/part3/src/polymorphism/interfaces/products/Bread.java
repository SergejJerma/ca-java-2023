package polymorphism.interfaces.products;

class Bread implements Product, CaloriesNumber {
    private final int expirationLevel;
    private final int calories;

    Bread(int expirationLevel, int calories) {
        this.expirationLevel = expirationLevel;
        this.calories = calories;
    }

    @Override
    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }

    @Override
    public int calories() {
        return calories;
    }
}
