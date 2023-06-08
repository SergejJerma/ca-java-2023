import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ParkingLotRegisterTest {

    private final List<String> numberPlatesIn = new ArrayList<>();
    private final List<String> numberPlatesOut = new ArrayList<>();
    private final ParkingLotRegister parkingLotRegister = new ParkingLotRegister(numberPlatesIn, numberPlatesOut);

    @Test
    void register_incomingVehicle_registerToInbound() {
        //given
        String input = "inABC123";

        //when
        parkingLotRegister.register(input);

        //then
        assertThat(numberPlatesIn).contains("inABC123");
    }

    @Test
    void register_departingVehicle_registersToOutbound() {
        //given
        String output = "outCDE123";

        //when
        parkingLotRegister.register(output);

        //then
        assertThat(numberPlatesOut).contains("outCDE123");
    }
}