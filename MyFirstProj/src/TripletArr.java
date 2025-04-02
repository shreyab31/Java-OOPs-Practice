import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TripletArr {
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> triplet= new ArrayList<Integer>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
    }
    result= new ArrayList<List 
}