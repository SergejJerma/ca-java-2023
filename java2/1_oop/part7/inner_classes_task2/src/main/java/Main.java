public class Main {
    public static void main(String[] args) {
        IsorineKlase2 isorineKlase2 = new IsorineKlase2("isorine", "20", 200);
        IsorineKlase2.VidineKlase2 vidineKlase2 = isorineKlase2.new VidineKlase2(21);
        vidineKlase2.spausdinti();
    }
}

class IsorineKlase2 {
    public IsorineKlase2(String pavadinimas, String nr, int sk) {
        this.pavadinimas = pavadinimas;
        this.nr = nr;
        this.sk = sk;
    }

    private String pavadinimas;
    protected String nr;
    int sk;

    public class VidineKlase2 {
        int sk;

        public VidineKlase2(int sk) {
            this.sk = sk;
        }

        void spausdinti() {
            System.out.println("IsorineKlase2.pavadinimas: " + IsorineKlase2.this.pavadinimas);
            System.out.println("IsorineKlase2.nr: " + IsorineKlase2.this.nr);
            System.out.println("IsorineKlase2.sk: " + IsorineKlase2.this.sk);
            System.out.println("VidineKlase2.sk: " + this.sk);
        }

    }
}

