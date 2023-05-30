package polymorphism;

class Youghurt extends Product {
    private final int expirationLevel;

    Youghurt(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 2;
    }
}
