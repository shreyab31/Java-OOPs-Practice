public class CommonPrefix {
    static String common(String arr[]){
        String str="";
        for (int i=0;i<arr.length-1;i++) {
            for(int j=0;j<Math.min(arr[i].length(), arr[i+1].length());j++){
                if (arr[i].charAt(j)==arr[i+1].charAt(j)) {
                     str=(String)str+arr[i].charAt(j);
                }
                else break;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String arr[]={"flower", "flow", "flown"};
        System.out.println(common(arr));
    }
}
