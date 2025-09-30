public class spiltarray {
    private int countpartitions(int[] a,int maxsum){
        int n = a.length;
        int partitions = 1;
        long subarraysum = 0;
        for(int i = 0 ;  i<n ; i++){
            if(subarraysum + a[i] > maxsum){
                subarraysum += a[i];
            }else{
                partitions++;
                subarraysum = a[i];
            }
        }
        return partitions;
    }
    public int largestsubarraysum(int[]a,int k){
        int low = 0;
        int high = 0;
        for(int i = 0 ; i  < a.length ; i++){
            high += a[i];
            low = Math.max(low, a[i]);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            int partitions = countpartitions(a, mid);
            if(partitions >= k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args){
       int a[] = {7,2,5,10,8};
       int k = 2;
       spiltarray obj = new spiltarray();
       int result = obj.largestsubarraysum(a, k);
       System.out.println("Largest subarray sum with " + k + " partitions is: " + result);
    }
}
