public class Inheritance {
    public static void main(String[] args) {
        Demo3 d3=new Demo3();
        Demo3 d=new Demo3(); 
        d.Display();
    }
}
class Demo1{
    int a=100;
    void fun(){
        System.out.println("Java");
    }
}
class Demo2 extends Demo1{
    int b=200;
    void fun2(){
        System.out.println("Python");
    }
}
class Demo3 extends Demo2{
    int c=300;
    void fun3(){
        System.out.println("DBMS");
    }
    void Display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
