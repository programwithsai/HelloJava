public class Calculator {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public double divide(int a, int b) {
        double quotient = (double)a / b;
        return quotient;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(3, 5);
        System.out.println("Sum of 3 and 5 is: " + sum);

        double quotient = calc.divide(8, 3);
        System.out.println("8 div by 3 is: " + quotient);
    }
}
