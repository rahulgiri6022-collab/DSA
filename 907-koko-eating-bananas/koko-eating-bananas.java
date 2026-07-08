class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int max=-1;
         for(int i=0;i<piles.length;i++){
           
            int current =piles[i];
            if(current >max){
                max=current;
            }
        }
        int low=1;
        int ans=max;

       int  high=max;
       
        while(low<=high){
            int mid=(low+high)/2;
             long totalhour=0;
           
            for(int i=0;i<piles.length;i++){
                totalhour += (int)Math.ceil((double)piles[i]/mid);
            }
            if(totalhour<=h){
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