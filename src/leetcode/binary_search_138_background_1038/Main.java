package leetcode.binary_search_138_background_1038;

public class Main {
    //    public int search(int[] nums, int target) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            arrayList.add(nums[i]);
//        }
//        return arrayList.indexOf(target);
//    }

//    public int search(int[] nums, int target) {
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            treeSet.add(nums[i]);
//        }
//        return indexOf(treeSet, target);
//    }
//
//    private static int indexOf(TreeSet<Integer> treeSet, Integer element) {
//        List<Integer> list = new ArrayList<>(treeSet);
//        return list.indexOf(element);
//    }

//    public int search(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int m = left + (right - left) / 2;
//            if (nums[m] == target)
//                return m;
//            if (nums[m] < target)
//                left = m + 1;
//            else
//                right = m - 1;
//        }
//        return -1;
//    }

    int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // End Condition: left > right
        return -1;
    }
}
