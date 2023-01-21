import java.util.Scanner;


public class Throw_and_Finally {
    public static void main(String[] args) {
        System.out.println("Connection Established in main method");
        Test3 c=new Test3();
        try{
            c.funn3();
        }
        catch(Exception a){
            System.out.println("Dont main method will handle your exception");
        }
        System.out.println("Connection Terminated from Main class");
    }
}
class Test1{
    void funn1(){
        System.out.println("Connection Established in class Test1");
        try{
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the Numerator: ");
                int a=sc.nextInt();
                System.out.println("Enter the Denominator: ");
                int b=sc.nextInt();
                int c=a/b;
                System.out.println(c);
            }
        }
        catch(Exception as){
            System.out.println("Exception is handled in class Test1");
            throw as;
        }
        finally{
            System.out.println("This line is in finally block Connection Terminated in Class Test1 ");
        }
    }
}
class Test2{
    Test1 a=new Test1();
    void funn2(){
        System.out.println("Connection is Estabished in class Test2");
        a.funn1();
        System.out.println("Connection Terminated in class Test2");
    }
}
class Test3{
    Test2 b=new Test2();
    void funn3(){
        System.out.println("Connection is Estabished in class Test3");
        b.funn2();
        System.out.println("Connection Terminated in class Test3");
    }
}
