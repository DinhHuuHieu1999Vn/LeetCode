package leetcode.threeSum_15;

import java.util.*;

public class Main {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int m = 0; m < nums.length; m++) {
            map.put(m, nums[m]);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ls = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(ls);
                        if (!list.contains(ls))
                            list.add(ls);
                    }
                }
            }
        }
        ;
        Collections.reverse(list);
        return list;
    }
}
