package level1.lesson12.inheritance;

public class Main {

    public static void main(String[] args) {

        Asmuo asmuo = new Asmuo("Petras", "Petraitis", "39901010000");
        System.out.println(String.format("Asmuo: %s %s %s", asmuo.getVardas(), asmuo.getPavarde(), asmuo.asmensKodas));

        System.out.println(asmuo.getInfo());

        Studentas studentas = new Studentas("Antanas", "Antanaitis", "39901011111", "123456");
        System.out.println(String.format("Studentas: %s %s %s %s", studentas.getVardas(), studentas.getPavarde(), studentas.asmensKodas,
                studentas.getStudentoPazymejimoNr()));
        doSomething(studentas);

        System.out.println(studentas.getInfo());

        Darbuotojas darbuotojas = new Darbuotojas("Mantas", "Mantauskas", "39901012222", "333");
        System.out.println(String.format("Darbuotojas: %s %s %s %s", darbuotojas.getVardas(), darbuotojas.getPavarde(), darbuotojas.asmensKodas,
                darbuotojas.getSocDraudimoNr()));
        doSomething(darbuotojas);

        System.out.println(darbuotojas.getInfo());

        ImonesXDarbuotojas xDarbuotojas = new ImonesXDarbuotojas("Onute", "Mantauskiene",
                "49901012222", "444", "X000");
        System.out.println(String.format("ImonesXDarbuotojas: %s %s %s %s %s", xDarbuotojas.getVardas(), xDarbuotojas.getPavarde(), xDarbuotojas.getAsmensKodas(),
                xDarbuotojas.getSocDraudimoNr(), xDarbuotojas.getxNr()));

        System.out.println(xDarbuotojas.getInfo());


        ImonesXDarbuotojas xDarbuotojas2 = new ImonesXDarbuotojas(darbuotojas, "xNr");
        xDarbuotojas2.getxNr(); //ImonesXDarbuotojas turi getxNr()
        doSomething(xDarbuotojas2);

        Asmuo imonesDarbuotojasIrgiYraAsmuo = new ImonesXDarbuotojas(darbuotojas, "xNr");
        imonesDarbuotojasIrgiYraAsmuo = darbuotojas;
        /* Prieinami tik asmens metodai! */
        //imonesDarbuotojasIrgiYraAsmuo.getxNr(); //ImonesXDarbuotojas turi getxNr()
        doSomething(imonesDarbuotojasIrgiYraAsmuo);
    }

    private static void doSomething(Asmuo asmuo) {
        System.out.printf("Metodas doSomething iskviestas argumenta, priklausanti klasei %s%n", asmuo.getClass().getName());
        asmuo.getInfo();
    }


}
