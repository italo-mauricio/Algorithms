import java.util.HashMap;
import java.util.Map;

class TwoSum{
   public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementeIndex = map.get(nums[i]);
            if(complementeIndex != null){
                return new int[]{i, complementeIndex};
            }
            map.put(target - nums[i], i);
        }   
        return nums;
    }
}