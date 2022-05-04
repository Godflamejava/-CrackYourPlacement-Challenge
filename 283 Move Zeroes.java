class Solution {
    public void moveZeroes(int[] nums) {
    int l = nums.length;
            int insertPos=0;
        for(int num:nums){
           if(num!=0)
                   nums[insertPos++]=num;
        }
            
            while(insertPos<l)
              nums[insertPos++]=0;       
        
    }
}
