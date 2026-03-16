package DSA.Arrays.Medium;

import java.util.HashMap;

public class MajorityElement1 {
    public int majorityeleBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                return nums[i];
            }
        }
        return -1;
    }

    public int majorityeleOptimal(int[] nums) {
        int m = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) > m / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        MajorityElement1 obj = new MajorityElement1();
        int ansBrute = obj.majorityeleBrute(nums);
        int ansOptimal = obj.majorityeleOptimal(nums);
        System.out.println(ansBrute);
        System.out.println(ansOptimal);
    }
}
