import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class combinationsum2{
    public static void main(String[] args){
        int arr[] = {1,2,3,3,4,5,6,6,7};
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        int target = 13;
        combinationSum(0,ans,arr,target);
    }
    public static void combinationSum(int index , List<Integer> ans , int[] arr , int target){
        if(target == 0){
            System.out.println(ans);
            return;
        }
        
        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i - 1]) continue;
            if(arr[i] > target) break;
            
            ans.add(arr[i]);
            combinationSum(i + 1 , ans , arr , target - arr[i]);
            ans.remove(ans.size() - 1);
        }
    }
}