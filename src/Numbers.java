public class Numbers {
    public static void main(String[] args) {
        int priceOfApples = 5;
        int priceOfMeat =150;

        int sum = priceOfApples + priceOfMeat;

        if (sum >= 10 && sum <= 20) {
            System.out.println("Total is within the range");
        } else {
            System.out.println("Total is outside the range");
        }

        for (int i = 1; i <= 20; i++) {
            if (i == 6 || i == 18) {
                System.out.println("Hello");
            } else {
                System.out.println(i);
            }
        }
    }
}
