public class Overridding {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.display();
        ch.snake();
    }
}




class Parent{
    int a=4;
    static int b=3;
    protected int c=9;
    static void display(){
        System.out.println();
    }

}
class Child extends Parent{
    // void display(){           /* 1.Inherited Method  2.Overridding Method  3. Specialised Method */
    //     System.out.println("This is child class");
    // }
    // void name(){
    //     System.out.println("jadgj");
    // }
    public void snake(){
        System.out.println("Hello i am Snake"+b);
    }
}

