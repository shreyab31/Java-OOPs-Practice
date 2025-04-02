package Array;
public class MissingNum {
    static int bruteMine(int a[]){
        int count=a[0];
        for (int i = 0; i < a.length; i++) {
            if (count==a[i]) count++;
            else return count;;
        }
        return 0; //won't work for jumbled numbers
    }
    static int brute(int a[], int N){
        for (int i = 1; i <=N; i++) {
            int flag=0;
            for (int j = 0; j < N; j++) {
                if (a[j]==i){ 
                    flag=1;
                break;
            }
            }
            if (flag == 0) return i;
        }
        return -1;
        }
        static int better(int a[], int N){
            int hash[] = new int[N+1];
            for (int i = 0; i < N-1; i++) {
                hash[a[i]]++;
            }
            for (int i = 1; i <=N; i++) {
                if (hash[i]==0) return i;
            }
            return -1;
        }
        static int optimalSum(int a[], int N){ 
            int sum = (N * (N + 1)) / 2;
            int sum2=0;
            for (int i = 0; i < a.length; i++) {
                sum2+=a[i];
            }
            return sum-sum2;
        }
        static int optimalXOR(int a[], int N){
            int xor1=0, xor2=0;
            for (int i = 0; i <N-1; i++) {
                xor2 = xor2 ^ a[i];
                xor1 = xor1 ^ (i + 1);
            }
            xor1 = xor1 ^ N;
            return xor1 ^ xor2;
        }
public static void main(String[] args) {
    int a[]={1,3,4};
    //System.out.println(brute(a));
    //System.out.println(better(a, 4));
    //System.out.println(optimalSum(a, 3));
    System.out.println(optimalXOR(a, 4));
}    
}
