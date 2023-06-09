package polymorphism.abstract_class.products;

class Cheese extends Product {
    private final int expirationLevel;

    Cheese(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }
}
