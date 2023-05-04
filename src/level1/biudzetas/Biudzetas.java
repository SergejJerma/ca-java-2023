package level1.biudzetas;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        if (irasuTipasIsScan == 1) {
            pridetiPajamuIrasa();
        } else {
            pridetiIslaiduIrasa();
        }
    }

    private void pridetiPajamuIrasa() {
        runProgram = true;
        Irasas irasas = new PajamuIrasas();
        irasas.setId(++irasoIdSkaitiklis);

        while (runProgram) {
            System.out.println("Iveskite pajamu iraso suma:");
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
        System.out.println("Iveskite pajamu iraso komentara:");
        irasas.setKomentaras(sc.nextLine());
        ((PajamuIrasas) irasas).setPajamuKategorija(PajamuIrasas.PAJAMU_KATEGORIJA);
        System.out.println("Iveskite pajamu iraso paskirti:");
        ((PajamuIrasas) irasas).setPajamuTipas(sc.nextLine());

        irasai.add(irasas);
    }

    private void pridetiIslaiduIrasa() {
        runProgram = true;
        Irasas irasas = new IslaiduIrasas();
        irasas.setId(++irasoIdSkaitiklis);

        while (runProgram) {
            System.out.println("Iveskite islaidu iraso suma:");
            String sumaStr = sc.next();
            try {
                Double sumaDouble = Double.parseDouble(sumaStr);
                irasas.setSuma(sumaDouble);
                runProgram = false;
            } catch (NumberFormatException e) {
                System.out.println("Ivestas neteisingas sumo formatas \n bandykite dar karta");
            }
        }
        irasas.setLaikas(LocalDateTime.now().format(formatter));
        sc.nextLine();
        System.out.println("Iveskite islaidu iraso komentara:");
        irasas.setKomentaras(sc.nextLine());

        ((IslaiduIrasas) irasas).setIslaiduKategorija(IslaiduIrasas.ISLAIDU_KATEGORIJA);
        System.out.println("Iveskite islaidu iraso paskirti:");

        ((IslaiduIrasas) irasas).setIslaiduTipas(sc.nextLine());

        irasai.add(irasas);
    }

    public void gautiPajamuIrasa() {
        for (Irasas el : irasai) {
            if (el instanceof PajamuIrasas) {
                System.out.println(el);
            }
        }
    }

    public void gautiIslaiduIrasa() {
        for (Irasas el : irasai) {
            if (el instanceof IslaiduIrasas) {
                System.out.println(el);
            }
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
                if (skInt == 1) {
                    runProgram = true;
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
            }
        }
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

                if (el instanceof PajamuIrasas) {
                    ((PajamuIrasas) el).setPajamuTipas(sc.nextLine());
                } else {
                    ((IslaiduIrasas) el).setIslaiduTipas(sc.nextLine());
                }
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
            if (el instanceof PajamuIrasas) {
                balansas += el.getSuma();
            } else {
                balansas -= el.getSuma();
            }
        }

        System.out.println("Jusu pajamu/islaidu balansas: " + balansas + "\n");
    }
}
