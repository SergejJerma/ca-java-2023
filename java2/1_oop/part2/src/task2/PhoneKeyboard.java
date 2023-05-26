package task2;

/**
 * Parašykite programą, kuri konvertuotų seno telefono mygtuko
 * paspaudimus į tekstą.
 * Pvz.: vartotojui įvedus: 555 2 22 2 7777 būtų atspausdinama labas.
 * *Programoje turbūt priteiks String.split() metodo.
 * 1. Parašykite atvirkštinį programos variantą – įvedus raides turi būti
 * išvedami mygtukų paspaudimai.
 * Pvz.: varotojui įvedus super būtų atspausdinama 7777 88 7 33 777.
 * 2. Apjunkite funkcionalumą – įvedus mygtukų paspaudimus turi būti
 * išvedamas tekstas, o įvedus raides – mygtukų paspaudimai.
 * Sakykime, kad vienoje eilutėje gali būti tik arba raidės arba
 * skaitmenys.
 * 3. Paskirstykite kodą per kelias klases / metodus.
 */
public class PhoneKeyboard {

    private static final MyConverter myConverter = new MyConverter();
    private static final UserInterface userInterface = new UserInterface();

    public static void main(String[] args) {
        String userInput = userInterface.requestUserInput();

        if (InputTypeEnum.getType(userInput) == InputTypeEnum.DIGITS) {
            String text = myConverter.convertToText(userInput);
            System.out.println(text.toLowerCase());
        }
        else {
            String text = myConverter.convertToKeyPresses(userInput);
            System.out.println(text);
        }

    }
}
