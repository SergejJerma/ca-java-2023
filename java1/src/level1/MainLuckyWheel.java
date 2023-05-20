package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainLuckyWheel {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Ramūnas Juozapaitis");
        students.add("Vitalij Rusakevič");
        students.add("Paulius Žemaitis");
        students.add("Raimondas Šedys");
        students.add("Domantas Brazaitis");
        students.add("Marius Zenkevičius");
        students.add("Tomas Spudys");
        students.add("Vytis Alvikas");
        students.add("MANTAS SASNAUSKAS");
        students.add("MINDAUGAS NORVILAS");
        students.add("Mantvydas Savickas");
        students.add("Eugenijus Liutvinskis");
        students.add("Judilė Bernackaitė");
        students.add("Žilvinas Binkulis");
        students.add("Aleksandr Ščupakov");
        students.add("Lina Kuncevičiūtė");
        students.add("Marius Čepukėnas");

        Random random = new Random();
        int nextStudent = random.nextInt(students.size());
        System.out.println("Kitas: " + students.get(nextStudent));
    }
}
