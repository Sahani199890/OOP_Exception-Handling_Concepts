import java.util.Scanner;

public class Exceptions_in_Method {
    public static void main(String[] args) {
    System.out.println("Connection 1 is Established");
    C c=new C();
    c.fun3();
    System.out.println("Connection 1 is Terminated");
    }   
}
class A{
    void fun1(){
    System.out.println("Connection 4 is Established");
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numerator: ");
        int a=sc.nextInt();
        System.out.print("Enter the Denominator: ");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
        System.out.println("Connection 4 is Terminated");
    }
}
class B{
    void fun2(){
        try{
        System.out.println("Connection 3 is Established");
        A a=new A();
        a.fun1();
    }
    catch(ArithmeticException e){
        System.out.println("Denominator cannot be zero");
    }
    System.out.println("Connection 3 is Terminated");
    }
}
class C{
    void fun3(){
        System.out.println("Connection 2 is Established");
        B b=new B();
        b.fun2();
        System.out.println("Connection 2 is Terminated");
    }
} 