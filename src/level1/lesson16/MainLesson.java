package level1.lesson16;

public class MainLesson {
    public static void main(String[] args) {

        Gyvunas gyvunas = new Katinas(); // i Katinas reikia (Katinas)

        Katinas katinas = new Katinas(); // atgal i Gyvunas (Gyvunas) - nereikalingas, vyksta automatiskai


//        Katinas katinas2 = (Katinas) gyvunas; // byte <- double 130 // nekorektiska rezulta
        if (katinas instanceof Gyvunas) {
            Gyvunas gyvunas1 = katinas;
            System.out.println("PAKASTINTA");
        }



//        Katinas katinas = new Katinas();
//        katinas.miau(); //turi 2 galimybes del metodu kvietimo
//
//        Gyvunas gyvunas = new Gyvunas(); // viena
//        gyvunas.esti();
//
//        Katinas katinas2 = (Katinas) gyvunas;
//
//        katinas2.miau();

//        Katinas katinas2 = (Katinas) gyvunas2;
//        katinas2.miau(); //turi 2 galimybes del metodu kvietimo





    }
}
