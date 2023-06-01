package polymorphism.interfaces.products;

class Milk implements Product, CaloriesNumber {
    private final int expirationLevel;
    private final int calories;

    public Milk(int expirationLevel, int calories) {
        this.expirationLevel = expirationLevel;
        this.calories = calories;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 6;
    }

    public int getExpirationLevel() {
        return expirationLevel;
    }

    @Override
    public int calories() {
        return calories;
    }
}
