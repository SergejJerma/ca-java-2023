package polymorphism.abstract_class.products;

class Milk extends Product {
    private final int expirationLevel;

    public Milk(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 6;
    }

    public int getExpirationLevel() {
        return expirationLevel;
    }
}
