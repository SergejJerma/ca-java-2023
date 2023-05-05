package level1.biudzetas;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Biudzetas {

    private static int irasoIdSkaitiklis;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    List<Irasas> irasai = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private boolean runProgram;
    private int idInt;

    public void pridetiIrasa() {
        int irasuTipasIsScan = 0;
        runProgram = true;
        while (runProgram) {
            System.out.println("Pasirinkite: [1] - pajamu, ar [2] - islaidu");
            String skStr = sc.next();
            try {
                irasuTipasIsScan = Integer.parseInt(skStr);
                if (irasuTipasIsScan == 1 || irasuTipasIsScan == 2) {
                    runProgram = false;
                } else
                    System.out.println("ivestas neteisingas skaicius \n bandykite dar karta");
            } catch (NumberFormatException exception) {
                System.out.println("neteisingas ivedimas \n bandykite dar karta");
            }
        }
        uzpildytiIrasa(irasuTipasIsScan);
    }

    private void uzpildytiIrasa(int irasuTipasIsScan) {
        runProgram = true;
        Irasas irasas = new Irasas();
        irasas.setId(++irasoIdSkaitiklis);

        while (runProgram) {
            System.out.println("Iveskite iraso suma:");
            String sumaStr = sc.next();
            try {
                Double sumaDouble = Double.parseDouble(sumaStr);
                irasas.setSuma(sumaDouble);
                runProgram = false;
            } catch (NumberFormatException exception) {
                System.out.println("Ivestas neteisingas sumo formatas \n bandykite dar karta");
            }
        }
        irasas.setLaikas(LocalDateTime.now().format(formatter));

        sc.nextLine();
        System.out.println("Iveskite iraso komentara:");
        irasas.setKomentaras(sc.nextLine());

        if (irasuTipasIsScan == 1) {
            irasas.setKategorija(Category.PAJAMOS);
        } else {
            irasas.setKategorija(Category.ISLAIDOS);
        }

        System.out.println("Iveskite iraso paskirti:");
        irasas.setTipas(sc.nextLine());

        irasai.add(irasas);
    }


    public void gautiIrasus(Category category) {
        if (irasai.size() != 0) {
            for (Irasas el : irasai) {
                if (el.getKategorija().equals(category)) {
                    System.out.println(el);
                }
            }
        } else {
            System.out.println("Irasu sarasas tuscias");
        }
    }
    public void redaguotiIrasa() {
        runProgram = true;
        spausdintiVisusIrasus();
        validuotiId();
        for (Irasas el : irasai) {
            if (el.getId().equals(idInt)) {
                System.out.println("Suma: " + el.getSuma());

                int skInt = 0;

                runProgram = true;
                skInt = gautiPasirinkima(skInt);

                if (skInt == 1) {
                    runProgram = true;
                    irasoSumosPakeitimas(el);
                }
            }
        }
    }

    private void irasoSumosPakeitimas(Irasas el) {
        while (runProgram) {
            System.out.println("Iveskite nauja sumos reiksme:");
            String sumaStr = sc.next();
            try {
                Double sumaDouble = Double.parseDouble(sumaStr);
                el.setSuma(sumaDouble);
                runProgram = false;
            } catch (NumberFormatException e) {
                System.out.println("Ivestas neteisingas sumo formatas \n bandykite dar karta");
            }
        }
    }

    private int gautiPasirinkima(int skInt) {
        while (runProgram) {
            System.out.println("Pasirinkite: [1] - redaguoti ar [2] - grizti i pagr meniu");
            String skStr = sc.next();

            try {
                skInt = Integer.parseInt(skStr);
                if (skInt == 1 || skInt == 2) {
                    runProgram = false;
                } else
                    System.out.println("ivestas neteisingas skaicius \n bandykite dar karta");
            } catch (NumberFormatException e) {
                System.out.println("neteisingas ivedimas \n bandykite dar karta");
            }
        }
        return skInt;
    }

    public int validuotiId() {
        runProgram = true;
        while (runProgram) {
            System.out.println("Iveskite iraso ID:");
            String idStr = sc.next();
            try {
                idInt = Integer.parseInt(idStr);
                if (idInt > 0 && idInt <= irasai.size()) {
                    runProgram = false;
                } else
                    System.out.println("ivestas neteisingas ID \n bandykite dar karta");
            } catch (NumberFormatException e) {
                System.out.println("neteisingas ivedimas \n bandykite dar karta");
            }
        }
        return idInt;
    }

    public void atnaujintiIrasa() {
        spausdintiVisusIrasus();
        validuotiId();

        for (Irasas el : irasai) {
            if (el.getId() == idInt) {
                el.setLaikas(LocalDateTime.now().format(formatter));
                System.out.println("Iveskite naujinamo iraso suma:");
                el.setSuma(sc.nextDouble());
                sc.nextLine();

                System.out.println("Iveskite naujinamo iraso komentara:");
                el.setKomentaras(sc.nextLine());

                System.out.println("Iveskite naujinamo iraso paskirti:");
                el.setTipas(sc.nextLine());

                System.out.println("Irasas atnaujintas");
            }
        }
    }

    private void spausdintiVisusIrasus() {
        for (Irasas el : irasai) {
            System.out.println(el);
        }
    }

    public void gautiBalansa() {
        double balansas = 0;

        for (Irasas el : irasai) {
            if (el.getKategorija().equals(Category.PAJAMOS)) {
                balansas += el.getSuma();
            } else {
                balansas -= el.getSuma();
            }
        }

        System.out.println("Jusu pajamu/islaidu balansas: " + balansas + "\n");
    }

    public void trintiIrasa() {
        spausdintiVisusIrasus();
        validuotiId();

        irasai = irasai
                .stream()
                .filter(irasas -> !irasas.getId().equals(idInt))
                .collect(Collectors.toList());

        System.out.println("Irasas istrintas");
    }

}
