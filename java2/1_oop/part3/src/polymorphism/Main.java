package polymorphism;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ProductValidator productValidator = new ProductValidator();

        Milk milk = new Milk(random.nextInt(5));
        productValidator.validate(milk);

        Bread bread = new Bread(random.nextInt(5));
        productValidator.validate(bread);

        Butter butter = new Butter(random.nextInt(5));
        productValidator.validate(butter);

        Cheese cheese = new Cheese(random.nextInt(5));
        productValidator.validate(cheese);

        Youghurt youghurt = new Youghurt(random.nextInt(5));
        productValidator.validate(youghurt);

    }
}

