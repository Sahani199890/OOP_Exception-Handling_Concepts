import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Interface {
    public static void main(String[] args) {
        Calc1 c1=new Calc1();
        Calc2 c2=new Calc2();
        Calc3 c3=new Calc3();
        Math.permit(c1);
        Math.permit(c2);
        Math.permit(c3);
    }
}
interface Calculator{
    public void add();
    public void sub();
}
class Calc1 implements Calculator{
    int x=100;
    int y=200;
    public void add(){
        System.out.println(x+y);
    }
    public void sub(){
        System.out.println(x-y);
    }
}
class Calc2 implements Calculator{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    public void add(){
        System.out.println(x+y);
    }
    public void sub(){
        System.out.println(x-y);
    }
}
class Calc3 implements Calculator{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    public void add(){
        if(x!=0){
            System.out.println(x+y);
        }
        else{
            System.out.println("1st element can be zero");
            System.out.println(x+y);
        }
    }
    public void sub(){
        if(x!=0){
            System.out.println(x-y);
        }
        else{
            System.out.println("1st elemnt cannot be zero");
        }
    }
}
class Math {
    static void permit(Calculator ref){
        ref.add();
        ref.sub();
    }
}