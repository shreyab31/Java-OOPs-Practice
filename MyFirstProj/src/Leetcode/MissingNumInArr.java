import java.util.HashMap;

public class MissingNumInArr {
    public static int bruteByHashing(int arr[]){
        int range=arr.length=1;
        HashMap<Integer, Integer> mpp=new HashMap<>();
        for(int i:arr){
            mpp.put(i, mpp.getOrDefault(i, 0))+1;
        }
            for (int j=1; j <=range; j++) {
                if (mpp.containsKey(j))
            }
        }
        return 
    }
    public static void main(String[] args) {
        
    }
