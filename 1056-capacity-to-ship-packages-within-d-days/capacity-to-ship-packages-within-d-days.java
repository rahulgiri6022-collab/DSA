class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        
        int min=-1;
        for(int i=0;i<weights.length;i++){
            max+=weights[i];
            if(weights[i]>min){
                min=weights[i];
            }
        }
        int low=min;
        int high=max;
        
       
        while(low<high){
             int d=1;
            int mid=(low+high)/2;
            int load=0;
            for(int j=0;j<weights.length;j++){
                if(load+weights[j]>mid){
                    d++;
                    load=weights[j];
                }
                else{
                    load+=weights[j];
                }
            }
            if(d<=days){
                high=mid;
            }
            else{
                low=mid+1;
            }
            
        }
        
      
        return low;
        
       
    }
}