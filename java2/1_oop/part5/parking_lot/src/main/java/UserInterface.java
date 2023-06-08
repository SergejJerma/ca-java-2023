import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UserInterface {

    public static final String STOP_EXECUTION_SIGNAL = "X";

    private final Supplier<String> supplier;
    private final Consumer<String> consumer;

    public UserInterface(Supplier<String> supplier, Consumer<String> consumer) {
        this.supplier = supplier;
        this.consumer = consumer;
    }

    public String requestVehicleNumber() {
        consumer.accept("Noredami baigti iveskite X ...");
        consumer.accept("Arba pateikite atvykstancio arba isvykstancio automobilio numeri [inABC123 / outCBA321]: ");
        String userProvidedInput = supplier.get();
        if (userProvidedInput.equalsIgnoreCase(STOP_EXECUTION_SIGNAL))
            throw new RequestToStopExecutionException("User requested to stop program execution.");

        return userProvidedInput;
    }

    public void display(String numberPlatesIn) {
        consumer.accept(numberPlatesIn);
    }
}
