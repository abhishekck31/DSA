public class minimumdis {
    public static double minmaxGasDistBruteForce(int[] stations, int K) {
        int n = stations.length;
        double minMaxDist = Double.MAX_VALUE;
        minMaxDist = helper(stations, K, 0, new int[K]);
        return minMaxDist;
    }

    private static double helper(int[] stations, int K, int idx, int[] added) {
        if (idx == K) {
            int[] allStations = new int[stations.length + K];
            System.arraycopy(stations, 0, allStations, 0, stations.length);
            System.arraycopy(added, 0, allStations, stations.length, K);
            java.util.Arrays.sort(allStations);
            double maxDist = 0;
            for (int i = 1; i < allStations.length; i++) {
                maxDist = Math.max(maxDist, allStations[i] - allStations[i - 1]);
            }
            return maxDist;
        }
        double minDist = Double.MAX_VALUE;
        // Try placing the next station between every pair of stations
        for (int i = 1; i < stations.length; i++) {
            for (int pos = stations[i - 1] + 1; pos < stations[i]; pos++) {
                added[idx] = pos;
                minDist = Math.min(minDist, helper(stations, K, idx + 1, added));
            }
        }
        return minDist;
    }
   
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 9;
        double result = minmaxGasDistBruteForce(arr, k); 
        if(result != -1){
            System.out.println("The minimum possible value of the maximum distance is: " + result);
        } else{
            System.out.println("Element not found");
        }
    }
}
