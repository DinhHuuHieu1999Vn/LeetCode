package leetcode.twoOutOfThree_2032;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ls = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int n1 : nums1) {
            ls.add(n1);
        }
        for (int n2 : nums2) {
            ls.add(n2);
        }
        for (int n3 : nums3) {
            ls.add(n3);
        }

        return ls;
    }
}
