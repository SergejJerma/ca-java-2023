package polymorphism;

class ProductValidator {

    public void validate(Product product) {
        System.out.printf("Product:\t%s\t%n\tisExpired=%s%n",
                product.getClass().getSimpleName(),
                product.isNotExpired());
    }
}
