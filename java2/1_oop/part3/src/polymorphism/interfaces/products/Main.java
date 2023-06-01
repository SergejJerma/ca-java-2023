package polymorphism.interfaces.products;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ProductValidator productValidator = new ProductValidator();
        int num = random.nextInt(5);
        System.out.println(num);

        Product milk = new Milk(num);
        productValidator.validate(milk);

        Product bread = new Bread(random.nextInt(5));
        productValidator.validate(bread);

        Product butter = new Butter(random.nextInt(5));
        productValidator.validate(butter);

        Product cheese = new Cheese(random.nextInt(5));
        productValidator.validate(cheese);

        Product youghurt = new Youghurt(random.nextInt(5));
        productValidator.validate(youghurt);

    }
}

