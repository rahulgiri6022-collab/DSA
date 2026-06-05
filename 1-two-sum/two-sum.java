class Solution {
    public int[] twoSum(int[] nums, int target) { 
        int [][] temp=new int [nums.length][2];
        for(int j=0;j<nums.length;j++){
            temp[j][0]=nums[j];
            temp[j][1]=j;
        }
        Arrays.sort(temp,(a,b)->Integer.compare(a[0],b[0]));
       
       
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<temp.length;i++){
            int sum=temp[left][0]+temp[right][0];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else if(sum==target){
              return new int[]{temp[left][1],temp[right][1]};

            }
        }
        return new int[]{-1,-1};
        
    }
}