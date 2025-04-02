class Rec{
    private int len;
    private int br;
    public Rec(){
        this.len=4;
        this.br=5;
    }
    public Rec(int l, int b){
        this.len=l;
        this.br=b;
    }
    public int getLen(){
        return len;
    }
    public int getbr(){
        return br;}
}
public class ConsRec {
    public static void main(String[] args) {
   Rec obj= new Rec(11,12);
   System.out.println(obj.getLen());
   System.out.println(obj.getbr());

}
}
