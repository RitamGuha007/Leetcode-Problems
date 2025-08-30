class Solution {
    public boolean canJump(int[] nums) {
        int m=0;//MaxReach
        for(int i=0;i<nums.length;i++){
            if(i>m)
            return false;
            m=Math.max(m,nums[i]+i);
            if(m>=nums.length-1)
            return true;

              }
              return true;
        
    }
}
