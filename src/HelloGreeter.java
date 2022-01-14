public class HelloGreeter {
    public void printHello() {
        System.out.println("Hello world!");
    }

    public void greet(String name) {
        String message = "Hello " + name;
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloGreeter hello = new HelloGreeter();
        hello.printHello();

        int x = 10;
        String message = "Hello World!";

        boolean isSafeToEat = false;

        hello.greet("Brian");
    }
}
