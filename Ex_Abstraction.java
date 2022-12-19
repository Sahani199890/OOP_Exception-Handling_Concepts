import java.util.Scanner;

public class Ex_Abstraction {
    public static void main(String[] args) {
        Square s=new Square();
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Geometry.permit(s);
        Geometry.permit(r);
        Geometry.permit(c);        
    }
}
abstract class Shape{
    float area;
    abstract void acceptInputs();
    abstract void calcArea();
    void displayArea(){
        System.out.println(area);
    }
}
class Square extends Shape{
    int side;
    void acceptInputs() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side");
        side=sc.nextInt();   
    }
    void calcArea() {
        area=side*side;        
    }    
}
class Rectangle extends Shape{
    int length;
    int breadth;
    void acceptInputs(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        length=sc.nextInt();
        breadth=sc.nextInt();
    }
    void calcArea() {
        area=length*breadth;
    }
}
class Circle extends Shape{
    int radius;
    void acceptInputs(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        radius=sc.nextInt();
    }
    void calcArea() {
        area=3.14f*radius*radius;        
    }
}
class Geometry{
    static void permit(Shape ref){
        ref.acceptInputs();
        ref.calcArea();
        ref.displayArea();
    }
}