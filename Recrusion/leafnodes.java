import java.util.List;
import java.util.ArrayList;

class leafnodes{
    public static void main(String[] args){
        int arr[] = {1,2,3};
        List<Integer> current = new ArrayList<>();
        leaf(0,current,arr);
    }
    public static void leaf(int index, List<Integer> current, int[] arr){
        if(index == arr.length){
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        leaf(index + 1 , current , arr);
        current.remove(current.size() - 1);
        leaf(index + 1 , current , arr);
    }
}