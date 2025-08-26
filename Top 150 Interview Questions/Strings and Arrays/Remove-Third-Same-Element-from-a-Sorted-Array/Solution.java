class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1,c=1;
        if (nums.length==0)
        return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[k-1]){
                if(c<2){
                    nums[k]=nums[i];
                    c++;k++;
                }}
            else{
                  nums[k]=nums[i];
                  c=1;k++;
                }
            
        }
        return k;  

        } 
    
    }
