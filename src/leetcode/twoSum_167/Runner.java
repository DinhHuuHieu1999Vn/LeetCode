package leetcode.twoSum_167;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Main main = new Main();
        int[] data = {2, 7, 11, 15};
        int target = 9;
        System.out.println(main.twoSum(data, target));
        System.out.println(Arrays.toString(main.twoSum(data, target)));
    }
}
