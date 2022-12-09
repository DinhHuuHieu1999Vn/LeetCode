package leetcode.binary_search_125_template_i_952;

public class Main {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
