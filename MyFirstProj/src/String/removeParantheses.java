public class removeParantheses {
    static String Optimal(String s){
        int opened=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++) {
             if(s.charAt(i)=='(') {
                if(opened>0){
                sb.append('(');
                }
                ++opened;
            }
             if(s.charAt(i)==')') {
                --opened;
                if(opened>0){
                sb.append(')');
        }     
      }
        
      }
        }
      return sb.toString();
    }
    public static void main(String[] args) {
       String s="(()())(())((()))"; 
       System.out.println(Optimal(s));
    }
}
