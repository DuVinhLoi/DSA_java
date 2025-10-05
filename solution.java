import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) {
                return new int[] { map.get(remain), i };
            }
            map.put(nums[i], i);
        }
        
        return new int[] {}; // sẽ không bao giờ tới đây vì đề đảm bảo có 1 nghiệm
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }
}
