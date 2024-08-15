package LeetCode;

public class ConcatenationOfArray {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            
            int[] result = new int[nums.length * 2];
    
            for (int i = 0; i < nums.length; i++){
                result[i] = nums[i];
            }
            for(int l = 0; l < nums.length; l++){
                result[l + nums.length] = nums[l];
            }
    
            return result;
        }
    }
}
