package polymorphism;

class Youghurt {
    private final int expirationLevel;

    Youghurt(int expirationLevel) {
        this.expirationLevel = expirationLevel;
    }

    public boolean isNotExpired() {
        return this.expirationLevel <= 2;
    }
}
