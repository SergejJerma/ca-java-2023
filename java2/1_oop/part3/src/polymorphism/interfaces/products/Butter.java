package polymorphism.interfaces.products;

class Butter implements Product {
    private final int expirationLevel;

    Butter(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }
}
