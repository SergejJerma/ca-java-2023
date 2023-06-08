import lombok.Getter;

import java.util.List;

@Getter
public class ParkingLotRegister {

    private final List<String> numberPlatesIn;
    private final List<String> numberPlatesOut;

    public ParkingLotRegister(List<String> numberPlatesIn, List<String> numberPlatesOut) {
        this.numberPlatesIn = numberPlatesIn;
        this.numberPlatesOut = numberPlatesOut;
    }

    public void register(String numberPlate){
        if (numberPlate.startsWith("in"))
            numberPlatesIn.add(numberPlate);
        else if (numberPlate.startsWith("out"))
            numberPlatesOut.add(numberPlate);
        else
            throw new IllegalArgumentException("Invalid plate number: " + numberPlate);
    }
}
