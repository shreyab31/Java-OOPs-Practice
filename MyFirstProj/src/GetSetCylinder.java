class Cylinder{
    private int radius;
    private int height;

    public void setrad(int r){
        radius=r;}
    public int getrad(){
            return radius;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getHeight(){
        return height;    
    }
    public double SA(){
        return 2*3.142*radius*radius+2*3.142*radius*height;
    }
    public double vol(){
        return 3.142*radius*radius*height;
    }
    }
public class GetSetCylinder {
    public static void main(String[] args) {
        Cylinder c= new Cylinder();
        c.setrad(9);
        c.setHeight(12);

        System.out.println("height= "+c.getHeight());
        System.out.println("Radius= "+c.getrad());
        System.out.println("SA= "+c.SA());
        System.out.println("Vol= "+c.vol());
    }
}
