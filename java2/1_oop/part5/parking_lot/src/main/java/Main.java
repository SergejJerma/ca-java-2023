import java.util.ArrayList;
import java.util.Scanner;

/** # 3
 * Sukurkite programą, registruojančią į parkavimo aikštelę atvykstančius ir
 * išvykstančius automobilius.
 * + 1. Vartotojui įvedus inKLM056, atvažiavusio automobilio numeris būtų
 * įrašomas į atvykusių automobilių sąrašą.
 * + 2. Vartotojui įvedus outKLM056, išvažiavusio automobilio numeris būtų įrašomas į
 * išvykusių automobilių sąrašą.
 * 3. Kiekvieną kartą įvedus naują automobilį turi būti išvedama:
 * 1. Visų kada nors įvažiavusių automobilių numeriai.
 * 2. Visų kada nors išvažiavusių automobilių numeriai.
 * 3. Kiek automobilių šiuo metu stovi aikštelėje.
 * 4. Visų šiuo metu aikštelėje stovinčių automobilių numeriai.
 * 5. Kuris, aikštelėje esantis automobilis, stovi trumpiausiai.
 * 6. Kuris, aikštelėje esantis automobilis, stovi ilgiausiai.
 * 7. Bandant išvažiuoti automobiliui, kurio nėra aikštelėje (sakykime įvyko numerio
 * nuskaitymo klaida) turi būti spausdinamas klaidos pranešimas.
 * 8. Bandant įvažiuoti į aikštelę automobiliui, su aikštelėje jau esančio automobilio
 * numeriais (sakykime įvyko numerio nuskaitymo klaida) turi būti spausdinamas
 * klaidos pranešimas.
 * @param args
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static UserInterface userInterface = new UserInterface(() -> scanner.nextLine(), s -> System.out.println(s));
    static ParkingLotRegister register = new ParkingLotRegister(new ArrayList<>(), new ArrayList<>());

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            try {
                String vehicleNumber = userInterface.requestVehicleNumber();
                register.register(vehicleNumber);
            } catch (RequestToStopExecutionException e) {
                run = false;
            }
        }
        userInterface.display("Cars that have arrived: " + register.getNumberPlatesIn().toString());
        userInterface.display("Cars that have left: " + register.getNumberPlatesOut().toString());
    }
}
