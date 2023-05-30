package polymorphism;

class Bread extends Product {
    private final int expirationLevel;

    Bread(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }
}
