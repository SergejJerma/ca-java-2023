
/*
Turime du masyvus - viename skaičiaus tipo elementai { 1, 2, 3 },
kitame eilutės tipo elementai {"Hello", "World"}.

Užduotis: parašyti vieną metodą printArray,
kuris gali atspausdinti visus abiejų turimų masyvų elementus.

Metodas turi priimti ir masyvą su skaičiais, ir masyvą su eilutėmis.

Tikėtinas rezultatas:
```
1
2
3
Hello
World
```
 */
public class PdfTask1 {

    public static void main(String[] args) {
        //int[] intArray = {1, 2, 3}; //Won't compile - must by subtype of Object and primitive int is not!

        System.out.println("Printing array of Integer");
        Integer[] intArray = {1, 2, 3};
        printArray(intArray);

        System.out.println("Printing array of String");
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);

    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

}
