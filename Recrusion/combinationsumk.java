import java.util.List;
import java.util.ArrayList;

class combinationsumk{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        List<Integer> ans = new ArrayList<>();
        int target = 8;
        combi(0,ans,arr,target);
    }
    public static void combi(int index , List<Integer> ans , int[] arr , int target){
        if(index == arr.length){
            if(target == 0){
                System.out.println(ans);
            }
            return;
        }
        if(arr[index]<=target){
            ans.add(arr[index]);
            combi(index , ans , arr , target - arr[index]);
            ans.remove(ans.size() - 1);
        }
        combi(index + 1 , ans , arr , target);
    }
}