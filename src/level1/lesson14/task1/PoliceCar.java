package level1.lesson14.task1;

public class PoliceCar implements IsEmergency, IsLandVehicle{
    @Override
    public void soundSiren() {
        System.out.println("POLICE");
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int wheels) {

    }

    @Override
    public void drive() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setMaxPassengers(int max) {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int speed) {

    }
}
