class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> traversedNumber = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(traversedNumber.contains(num)){
                return true;
            }
            traversedNumber.add(num);
        }
        return false;
    }   
}