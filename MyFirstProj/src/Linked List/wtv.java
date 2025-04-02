import java.util.ArrayList;
import java.util.HashMap;

public class wtv {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=2;
        HashMap<Integer, Integer> map= new HashMap<>();
            ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(nums[i]!=val) arr.add(nums[i]);
        }
          for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);

        } System.out.println(arr.size());
    }
}