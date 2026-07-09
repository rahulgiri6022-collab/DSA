class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
           if((long)bloomDay.length<(long)m*k){
            return -1;
           }
        
    
          int max=-1;
        int min=Integer.MAX_VALUE;
          for(int l=0;l<bloomDay.length;l++){
            if(bloomDay[l]<min){
                min=bloomDay[l];
            }
            if(bloomDay[l]>max){
                max=bloomDay[l];
            }
          }
          
          int low=min;
          int high=max;
          int ans=0;
          
       while (low<=high){
        int mid=(low+high)/2;
        int count=0;
        int nb=0;
            for(int j=0;j<bloomDay.length;j++){
                if(bloomDay[j]<=mid){
                    count++;
                    if(count==k){
                       nb++;
                       count=0;
                        
                    }
                }
                else {
                    count=0;     
                }   
            }
            if(nb>=m){
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