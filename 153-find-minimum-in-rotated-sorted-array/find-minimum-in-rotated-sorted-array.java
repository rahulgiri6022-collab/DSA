class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int  min=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=nums[low]&&nums[mid]<=nums[high]){
                min =nums[mid];
                low++;
                high--;
            }
            else if(nums[mid]>=nums[low]&&nums[low]<=nums[high]){
                min=nums[mid];
                high=mid-1;
            }
            else{
                min=nums[mid];
                low=mid+1;
            }
        }
         
        return min;
        
    }
}