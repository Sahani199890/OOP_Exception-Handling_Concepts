

/**what is going to execute firstly is lets see now
when 1st class gets into JVM then java looks for
1.Static variables
2.static blocks
3.Main Method

later when other classes been added then java looks for
1.Static variables
2.static blocks

when class object is created then java looks for
1. created memorey in heap segment 
2.Instances Variables
3.Instances blocks
4.Constructors

**/
public class Static {
    static int a=9,b;  //static variables
    static{
        System.out.println("Inside the Static Block");   // static block
    }
    static void fun1(){
        System.out.println("Inside the static Method"); // static method
    }
    int x,y;
    {
        System.out.println("Inside Instance Block");
    }
    void fun2(){
        System.out.println("Inside Instance Method");
    }
    Static(){
        System.out.println("Inside the Constructor");
    }
    public static void main(String[] args){
        Static.fun1();
        Static st=new Static();
        st.fun2();
    }
}
