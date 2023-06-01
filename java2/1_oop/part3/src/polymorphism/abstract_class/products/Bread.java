package polymorphism.abstract_class.products;

class Bread extends Product {
    private final int expirationLevel;

    Bread(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    @Override
    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }
}
