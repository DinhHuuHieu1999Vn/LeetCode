package leetcode.binary_search_138_background_1038;

import java.util.HashMap;

public class Main {
    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int k = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (hashMap.containsValue(nums[i]) == false) {
                hashMap.put(i, nums[i]);
            }

        }
        for (int j = 0; j <= hashMap.size() - 1; j++) {
            if (hashMap.containsValue(target) == true) {
                if (hashMap.get(j) == target) {
                    k = j;
                }
            } else {
                k = -1;
            }
        }

        return k;
    }
}
