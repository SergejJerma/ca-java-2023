package polymorphism.interfaces.products;

class Bread implements Product {
    private final int expirationLevel;

    Bread(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    @Override
    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }
}
