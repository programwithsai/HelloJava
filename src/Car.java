public abstract class Car {
    String make;
    private boolean engineOn;
    private boolean onboardComputerOn;

    public Car(String make) {
        this.make = make;
    }

    public void switchCarOn() {
        System.out.println("Switching the car ON");
        engineOn = true;
        onboardComputerOn = true;
    }

    public void switchCarOff() {
        System.out.println("Switching the car OFF");
        engineOn = false;
        onboardComputerOn = false;
    }

    abstract void refuel();
}








