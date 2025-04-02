 class A {
    int a;
    float b;
    void get(int a1, float b1){
        a=a1;
        b=b1;
    }
    void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class Studentt{
    public static void main(String[] args) {
        A obj1=new A();
        obj1.get(11, 17.4f);
        obj1.show();

    }

    
}

