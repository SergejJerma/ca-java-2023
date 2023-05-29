package inheritance.constructors_super;

enum FuelType {
    ELECTRIC,
    GAS,
    DIESEL,
    NONE;

    @Override
    public String toString() {
        return name();
    }
}
