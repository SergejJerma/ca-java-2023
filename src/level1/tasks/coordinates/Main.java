package level1.tasks.coordinates;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Koordinate> koordinates = new LinkedList<>();

        koordinates.add(new Koordinate(1, 9));
        koordinates.add(new Koordinate(2, 8));
        koordinates.add(new Koordinate(0, 0));
        koordinates.add(new Koordinate(3, 7));
        koordinates.add(new Koordinate(4, 6));

        System.out.println(koordinates);

        int index = koordinates.indexOf(new Koordinate(0, 0));

        if (index == -1) {
            System.out.println("Koordinate {x=0, y=0} nerasta");
            return;
        }

        System.out.println("Koordinate {x=0, y=0} yra " + (index + 1) + "-a");

        Koordinate koordinate00 = koordinates.get(index);
        koordinate00.setX(0);
        koordinate00.setY(0);
        System.out.println("koordinate00: " + koordinate00);
        System.out.println("koordinates: " + koordinates);
    }
}
