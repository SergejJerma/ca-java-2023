package polymorphism;

class Cheese {
    private final int expirationLevel;

    Cheese(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 3;
    }
}
