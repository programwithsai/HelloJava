import java.util.ArrayList;

public class ArraysAndCollections {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 4;
        nums[2] = 17;
        nums[3] = 2;
        nums[4] = 6;

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }

        System.out.println(total);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(17);
        numbers.add(2);
        numbers.add(6);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        System.out.println(sum);
    }
}
