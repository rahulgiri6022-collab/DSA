class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       int el=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(count==0){
            el=nums[i];
            count++;
        }
        else if(nums[i]==el){
            count++;
        }
        else if(nums[i]!=el){
            count--;
        }
       }
       int count1=0;
       for(int j=0;j<nums.length;j++){
        if(nums[j]==el){
            count1++;
        }
       }
       if(count1>nums.length/2){
        return el;
       }
       return -1;
    }
}