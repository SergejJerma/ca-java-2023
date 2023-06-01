package polymorphism.interfaces.products;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ProductValidator productValidator = new ProductValidator();
        int num = random.nextInt(5);
        System.out.println(num);

        Milk milk = new Milk(num, random.nextInt()*100);

        productValidator.validate(milk); // upcasting to Product
        productValidator.printCalories(milk); // upcasting to CaloriesNumber

        Bread bread = new Bread(random.nextInt(5), random.nextInt()*100);
        productValidator.validate(bread);
        productValidator.printCalories(bread);

        Butter butter = new Butter(random.nextInt(5), random.nextInt()*100);
        productValidator.validate(butter);
        productValidator.printCalories(butter);

        Cheese cheese = new Cheese(random.nextInt(5), random.nextInt()*100);
        productValidator.validate(cheese);
        productValidator.printCalories(cheese);

        Youghurt youghurt = new Youghurt(random.nextInt(5), random.nextInt()*100);
        productValidator.validate(youghurt);
        productValidator.printCalories(cheese);

    }
}

