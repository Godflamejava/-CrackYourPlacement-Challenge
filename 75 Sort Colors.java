class Solution {
    public void sortColors(int[] nums) {
      int mid=0;
      int start=0;
      int end=nums.length-1;
            
            while(mid<=end){
                    if(nums[mid]==1)
                        mid++;
                    else if(nums[mid]==0)
                    {
                     int temp=nums[start];
                         nums[start]=0;
                       nums[mid]=temp;  
                            mid++;
                            start++;
                    } 
                    else{
                              int temp=nums[end];
                         nums[end]=2;
                       nums[mid]=temp;  
                     end--;        
                    }
                           
            }
            
    }
}
