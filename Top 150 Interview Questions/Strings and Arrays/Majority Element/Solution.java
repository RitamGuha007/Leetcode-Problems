class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
        return nums[0];
              int  s=0,p=0;
        for(int i=0;i<nums.length;i++){
             int c=1;
            for(int j=i+1;j<nums.length;j++){
                 
               if(nums[j]==nums[i]){
                c++;
               }
            }
            if(c>s){
             s=c;
             p=nums[i];
             }
        }
        return p;
        
    }
}
