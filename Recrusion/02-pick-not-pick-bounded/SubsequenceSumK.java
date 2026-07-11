import java.util.List;
import java.util.ArrayList;

class subwithsumk{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        List<Integer> ans = new ArrayList<>();
        int target = 15;
        sub(0,ans,arr,target); 
    }
    public static void sub(int index , List<Integer> ans , int[] arr , int target){
        if(index == arr.length){
            if(target == 0){
                System.out.println(ans);
            }   
            return;
        }
        if(arr[index] <= target){
            ans.add(arr[index]);
            sub(index + 1 , ans , arr , target - arr[index]);
            ans.remove(ans.size() - 1);
        }
        sub(index + 1 , ans , arr , target);
    } 
}