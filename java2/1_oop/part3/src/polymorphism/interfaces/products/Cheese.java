package polymorphism.interfaces.products;

class Cheese implements Product {
    private final int expirationLevel;

    Cheese(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }
}
