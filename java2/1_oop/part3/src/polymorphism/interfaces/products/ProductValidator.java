package polymorphism.interfaces.products;

class ProductValidator {

    //Method that utilizes (benefits) from polymorphism: multiple subclasses can be passed as arguments
    public void validate(Product product) {
        product.isNotExpired();
        System.out.printf("Product:\t%s\t%n\tisExpired=%s%n",
                product.getClass().getSimpleName(),
                product.isNotExpired());
    }

    public void printCalories(CaloriesNumber product) {
        product.calories();
        System.out.println("Calories: " + product.calories());
    }
}
