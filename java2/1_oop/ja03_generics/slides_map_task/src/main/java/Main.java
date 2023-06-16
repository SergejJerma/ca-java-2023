/**
 * Sukurkite klasę Pora, su klasės atributais Raktas ir Reiksme . Abu klasės atributai gali būti bet koks objektas.
 * <p>
 * Sukurkite klasę Mapas su vienu klasės atributu sarasasPoru, kuris bus sarasas, skirtas saugoti klasės Pora objektams.
 * Klasė Mapas turi turėti metodą ideti, kuriam per parametrus perdavus raktą ir reikšmę, iš jų sukonstruoja porą ir ją įdeda į sarasą.
 * Taip pat reikalingas metodas gauti, kuriam per parametrą perdavus raktą, gausime reikšmę pagal tą raktą iš sąrašo.
 * <p>
 * Sukurkite klasę DnsServer, kuri turi atributus ip1 ir ip2 .
 * <p>
 * Sukurkite enum DnsProvider , kuris saugos keletą reikšmių, pvz. GOOGLE.
 * <p>
 * Atskiroje klasėje main metode sukurti map'ą, kuris saugo
 * DnsProvider → DnsServer poras.
 * <p>
 * Sukurti kitą map'ą, kuris saugo String → String poras.
 * Map'us užpildyti duomenimis ir pabandyti gauti reikšmes pagal raktus.
 */
public class Main {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> mapasDns = new Mapas<>();
        mapasDns.ideti(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "1.1.1.1"));
        mapasDns.ideti(DnsProvider.AMAZON, new DnsServer("9.9.9.9", "2.2.2.2"));

        System.out.println("mapasDns.gauti(DnsProvider.AMAZON): \t" + mapasDns.gauti(DnsProvider.AMAZON));
        System.out.println("mapasDns.gauti(DnsProvider.GOOGLE): \t" +mapasDns.gauti(DnsProvider.GOOGLE));


        Mapas<String, String> mapasString = new Mapas<>();
        mapasString.ideti("raktas1", "reiksme1");
        mapasString.ideti("raktas2", "reiksme2");
        System.out.println("mapasString.gauti(\"raktas1\"): \t" + mapasString.gauti("raktas1"));
        System.out.println("mapasString.gauti(\"raktas2\"): \t" + mapasString.gauti("raktas2"));
    }
}


