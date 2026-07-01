class Solution {
    public int search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        while(low<=high){
            int  mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low++;
            }
            else{
                high--;
            }

        }
        return -1;
        
    }
}