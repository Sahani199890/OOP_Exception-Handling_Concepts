import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        try{
            Demo d=new Demo();
            d.meth1();
        }
        catch(Exception a){
            System.out.println("I'm handling your exception buddy");

        }
    }
}
class Demo{
    void meth1() throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an interger number");
        int a=sc.nextInt();
        System.out.println("I think i'll send an exception");
    }
}
