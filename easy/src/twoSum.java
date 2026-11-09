
import java.util.HashMap;
import java.util.Map;
public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int diff = 0;
        int cur = 0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length;i++){
            /*
                check index, see if that is a key for our hashmap,
                if it is, return the index we are currently on and the index stored in the hashmap

                if its not, subtract the value at index i from the target and then add the diffrence as a key to the hash
                map
            */
            cur = nums[i];
            diff = target - cur;

            if(map.containsKey(cur)){
                result[0] = i;
                result[1] = map.get(cur);
                break;
            }else{
                map.put(diff,i);
            }
            System.out.println(cur + " "  + diff + " " + i);


        }
        return result;
    }
    public static void main(String[] args){

        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 4;


        twoSum problem = new twoSum();
        int[] res = problem.twoSum(arr,6);
        System.out.println(res[0] + " " + res[1]);
    }
}


