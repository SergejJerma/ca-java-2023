package polymorphism.interfaces.products;

class Butter implements Product, CaloriesNumber {
    private final int expirationLevel;
    private final int calories;

    Butter(int expirationLevel, int calories) {
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
