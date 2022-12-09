package leetcode.twoSum_167;

import java.util.HashMap;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] num = new int[2];
        int i = 0;
        int j = i + 1;
        for (int m = 0; m < nums.length; m++) {
            map.put(m, nums[m]);
        }

        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (num[0] == 0 || num[1] == 0) {
                    if (map.get(i) + map.get(j) == target) {
                        num[0] = i + 1;
                        num[1] = j + 1;
                    }
                }
            }
        }
        return num;
    }
}
