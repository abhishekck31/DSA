package DSA.Arrays.Medium;
import java.util.ArrayList;
import java.util.List;
public class Leaders {
    public List<Integer> leadersBrute(int[] nums) {
        List<Integer> Leaders = new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){
            boolean isLeader = true;
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] < nums[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                Leaders.add(nums[i]);
            }
        }
        return Leaders;
    }
    public static void main(String[] args){
        int[] nums = {16, 17, 4, 3, 5, 2};
        Leaders obj = new Leaders();
        List<Integer> ansBrute = obj.leadersBrute(nums);
        System.out.println(ansBrute);
    }
}
