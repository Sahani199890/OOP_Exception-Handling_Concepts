import java.util.*;
public class Circle {
    private float r;
    private static float pi;
    private float area;
    static{
        pi=3.141f;
    }
    public void acceptInput(){
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
    }
    public void area(){
        area=pi*r*r;
    }
    public void displayArea(){
        System.out.println(area);
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.acceptInput();
        c.area();
        c.displayArea();
    }
}
