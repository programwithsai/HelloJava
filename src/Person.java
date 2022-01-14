public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("Person's name is " + name);
    }

    public void sayHelloTo(Person person) {
        String message = name + " says hello to " +
                person.name;
        System.out.println(message);
    }

    public void driveCar(Car car) {
        car.switchCarOn();
        String driving = name + " is driving a car of make " +
                car.make;
        System.out.println(driving);
        car.switchCarOff();
    }

    public static void main(String[] args) {
        Person brian = new Person("Brian");
        brian.printName();

        Car ferrari = new DieselCar("Ferrari");
        brian.driveCar(ferrari);

        Person john = new Person("John");
        brian.sayHelloTo(john);

        Car tesla = new ElectricCar("Tesla");
        john.driveCar(tesla);
    }
}
