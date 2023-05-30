package polymorphism;

class ProductValidator {

    //Method that utilizes (benefits) from polymorphism: multiple subclasses can be passed as arguments
    public void validate(Product product) {
        System.out.printf("Product:\t%s\t%n\tisExpired=%s%n",
                product.getClass().getSimpleName(),
                product.isNotExpired());
    }
}
