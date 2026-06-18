class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
       int start=0;
       int end =nums.length-1;
       while(start<end){
         int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
       }
       start=0;
       end=k-1;
       while(start<end){
         int temp2=nums[start];
            nums[start]=nums[end];
            nums[end]=temp2;
            start++;
            end--;
       }
      start=k;
      end=nums.length-1;
      while(start<end){
         int temp3=nums[start];
            nums[start]=nums[end];
            nums[end]=temp3;
            start++;
            end--;
      }
        

       

       
    }

}