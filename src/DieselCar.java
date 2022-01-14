public class DieselCar extends Car{

    public DieselCar(String make) {
        super(make);
    }
    @Override
    public void refuel() {
        System.out.println("Refilling Diesel!");
    }
}
