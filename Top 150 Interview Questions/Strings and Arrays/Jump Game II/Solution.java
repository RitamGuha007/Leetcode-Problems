class Solution {
    public int jump(int[] nums) {
        int maxreach=0,currentend=0,jumps=0;
        if (nums.length==1)
        return 0;
        else{
        for(int i=0;i<nums.length-1;i++){
           maxreach=Math.max(maxreach,(i+nums[i]));
           if(i==currentend){ // Time to make Jump
            jumps++;
            currentend=maxreach;
           }
           
        }
        return jumps;}
        
    }
}
