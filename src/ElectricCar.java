public class ElectricCar extends Car{
    public ElectricCar(String make) {
        super(make);
    }

    @Override
    public void refuel() {
        System.out.println("Recharging electric car");
    }
}
