package polymorphism;

class ProductValidator {

    public void validate(Milk milk) {
        System.out.printf("milk:%n\tisExpired=%s%n", milk.isNotExpired());
    }

    public void validate(Youghurt youghurt) {
        System.out.printf("youghurt:%n\tisExpired=%s%n", youghurt.isNotExpired());
    }

    public void validate(Bread bread) {
        System.out.printf("bread:%n\tisExpired=%s%n", bread.isNotExpired());
    }

    public void validate(Butter butter) {
        System.out.printf("butter:%n\tisExpired=%s%n", butter.isNotExpired());
    }

    public void validate(Cheese cheese) {
        System.out.printf("cheese:%n\tisExpired=%s%n", cheese.isNotExpired());
    }
}
