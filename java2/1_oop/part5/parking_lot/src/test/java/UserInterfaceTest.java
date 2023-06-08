import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    void requestVehicleNumber() {
        //given
        Consumer<String> consumer = s -> {};
        Supplier<String> supplier = () -> "inABC123";
        UserInterface userInterface = new UserInterface(supplier, consumer);

        //when
        String numberPlate = userInterface.requestVehicleNumber();

        //then
        assertThat(numberPlate).isEqualTo("inABC123");
    }

    @Test
    void testRequestVehicleNumber_userRequestsToStop_throwsRequestToStopExecutionException() {
        //given
        Consumer<String> consumer = s -> {};
        Supplier<String> supplier = () -> UserInterface.STOP_EXECUTION_SIGNAL;
        UserInterface userInterface = new UserInterface(supplier, consumer);

        //when then
        assertThrows(RequestToStopExecutionException.class, () -> userInterface.requestVehicleNumber());
    }
}