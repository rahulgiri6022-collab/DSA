class Solution {
    public int smallestDivisor(int[] nums, int threshold) { 
        int min=Integer.MAX_VALUE;
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0;
            for(int j=0;j<nums.length;j++){
                sum+=(int)Math.ceil((double)nums[j]/mid);
            }
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           
        }
        return ans;
       
        
    }
}