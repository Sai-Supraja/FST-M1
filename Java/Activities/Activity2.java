package Activities;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args) {
        int[] numArr = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        System.out.println("Original array: " + Arrays.toString(numArr));
        System.out.println("Result: " + sumArr(numArr, sum));
    }
        public static boolean sumArr(int[] numArr, int sum) {
            int searchNum = 10;
            int result = 30;
            for (int num : numArr) {
                System.out.println(num);
                if (num == searchNum) {
                    sum += num;
                }
                if (sum > result) {
                    break;
                }
            }
            System.out.println("Sum of all the 10's in the array: " + sum);
            return sum==result;
        }
}
