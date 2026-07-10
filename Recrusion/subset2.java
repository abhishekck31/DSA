import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class subset2{
    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        findSubSet(0,ans,arr);
    }
    public static void findSubSet(int index , List<Integer> ans , int[] arr){
        System.out.println(ans);
        for(int i = index ; i < arr.length ; i++){
            if( i > index && arr[i] == arr[i - 1]) continue;
            ans.add(arr[i]);
            findSubSet(i + 1 , ans ,arr);
            ans.remove(ans.size() - 1);
        }
    }
}