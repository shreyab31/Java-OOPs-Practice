    import java.util.Scanner;

    public class AllPatterns {
        public static void Rec(int n){
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void Tri(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void NumTri(int n){
            for(int i=1;i<n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        public static void iTri(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
        public static void invTri(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void invTriNum(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        public static void TriFull(int n){
            for(int i=0;i<n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
        public static void invTriFull(int n){
            for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
        public static void Diamond(int n){
            for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<2*n-(2*i+1);j++){
                    System.out.print("*");
                }
                System.out.println();
                }
        }  
        public static void HalfLefTri(int n){
            for(int i=0;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n-1;i>=0;i--){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }  
        public static void HalfLefTri2(int n){
            for(int i=1;i<=2*n-1;i++){
                int stars=i;// we will do it till 5 for n=5
                if(i > n) stars=2*n-i;
                for(int j=1;j<=stars;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n-1;i>=0;i--){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }  
     public static void HalfCharTriangle(int n) {
                for(int i=1;i<=n;i++){
                    char ch='A';
                    for(int j=1;j<=i;j++){
                    System.out.print(ch++);
                }
                System.out.println();
            }
        }
        public static void Tri01(int n){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=i;j++){
                    if(i%2==j%2){
                        System.out.print("1");
                    }
                    else {
                        System.out.print("0");
                    }
                }
                System.out.println();
                }
            }
            public static void Tri01again(int n){
                for(int i=0;i<=n;i++){
                    int start =1;
                        if (i%2==0)start=1;
                        else start=0;
                    for(int j=0;j<=i;j++){
                        
                        
                    }
                    System.out.println();
                    }
                }
                public static void HalfNumButterfly(int n){
                    for(int i=1;i<=n;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print(j);
                        }
                            for(int j=0;j<2*(n-i);j++){
                                System.out.print(" ");
                            }
                            for(int j=i;j>=1;j--){
                                System.out.print(j);
                            }
                        System.out.println();
                    }
                    }
                    public static void HalfNumButterfly2(int n){
                        int space =2*n-1;
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=i;j++){
                                System.out.print(j);
                            }
                            for(int j=1;j<=space;j++){
                                System.out.print(" ");
                            }
                            for(int j=i;j>=1;j--){
                                System.out.print(j);
                            }
                        System.out.println();
                    }
                    }
                    public static void RightTriNum(int n){
                        int num=1;
                        for(int i=1;i<=n;i++){  
                            for(int j=1;j<=i;j++){
                                System.out.print(num+++" ");
                                
                            }
                            System.out.println();
                        }
                    }
        public static void InvHalfCharTriangle(int n) {
            for(int i=1;i<=n;i++){
                char ch='A';
                for(int j=1;j<=n-i+1;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void InvHalfCharTriangle2(int n) {
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+n-i-1;ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}
    public static void HalfSameLineCharTriangle(int n) {
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
            System.out.print(ch);
            }
            ch++;
        System.out.println();
    }
}       
public static void CharTriFull(int n){
    for (int i=0; i<n; i++) {
        for (int j=0; j<n-i; j++) {
            System.out.print(" ");
        }
        for (char ch='A'; ch<'A'+i+1; ch++) {
            System.out.print(ch);
        }
        for (char ch = (char) ('A'+i-1); ch>='A'; ch--) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
public static void HollowDiamond(int n){
    for(int i=0;i<n;i++){
    for(int j=0;j<n-i;j++){
        System.out.print("*");
    }
    for(int j=0;j<2*i;j++){
        System.out.print(" ");
    }
    for(int j=0;j<n-i;j++){
        System.out.print("*");
    }
    System.out.println();
}
    for(int i=n-1;i>0;i--){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }

public static void invCharTri(int n){
    for(int i=0;i<=n;i++){
        for(char ch=(char)(int)('E'-i); ch<='E';ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}
public static void Butterfly(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            for(int j=0;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
        System.out.println();
    }
    for(int i=n-1;i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            for(int j=0;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
        System.out.println();
    }
    }
    public static void HollowRec(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
}
        public static void NumRec(int n){
                for (int i= 0; i <2*n-1; i++) { //rows
                    for (int j=0; j <2*n-1; j++) { //cols
                        int top =i;
                        int left=j;
                        int right =(2*n-2)-j;
                        int bottom=(2*n-2)-i;
                        System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
                    }
                    System.out.println();
                }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
                for(int i=0;i<t;i++){
                    int n=sc.nextInt();
                    // Rec(n);
                    //Tri(n);
                    //NumTri(n);
                    //iTri(n);
                    //invTri(n);
                    //invTriNum(n);
                    //TriFull(n);
                    //invTriFull(n);
                    //Diamond(n);
                    //HalfLefTri(n);
                    //Tri01(n);
                    //Tri01again(n);
                    //HalfNumButterfly(n);
                    //HalfNumButterfly2(n);
                    //RightTriNum(n);
                    //HalfCharTriangle(n);
                    //InvHalfCharTriangle(n);
                    //InvHalfCharTriangle2(n);
                    //HalfSameLineCharTriangle(n);
                    //CharTriFull(n);
                    //invCharTri(n);
                    //HollowDiamond(n);
                    //Butterfly(n);
                    //HollowRec(n);
                    NumRec(n);
                    sc.close();
                }    
        }
    }
