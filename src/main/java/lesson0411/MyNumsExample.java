package lesson0411;

public class MyNumsExample {
    public static void num(int... nums) {
        System.out.println(nums.length);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        System.out.println("---- sum of nums = " + sum);
    }
    public  static void num1(int t,int... nums){
        System.out.println(nums.length);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        System.out.println("---- sum of nums = " + (sum*t));
    }
}
