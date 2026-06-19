class Solution {
    public void nextPermutation(int[] nums) {
      
        int index=-1;
       
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
               
                break;
            }
        }
        int start=0;
        int end=nums.length-1;
        if(index==-1){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            return;


        }
       
        for(int j=nums.length-1;j>index;j--){
            if(nums[j]>nums[index]){
                int temp=nums[index];
                nums[index]=nums[j];
                nums[j]=temp;
                break;
       
            }

        }
          start=index+1;
         end =nums.length-1;
         while(start<end){
            int temp1=nums[start];
            nums[start]=nums[end ];
            nums[end]=temp1;
            start++;
            end--;
         }

        
    }
}