
/* MOTIVE
 * When we call construstor of child class then before getting into child class's construtor execution
 * the call goes to its just a level up parent class's constructor and after parent class's 
 * constructor exectuion child class's constructor get exectued by the inbuilt super() method as we can see from the programm
*/



public class SuperMethod3{
    
    public static void main(String[] args) {
        Test2 t2=new Test2(29,99);
        t2.display();
    }
}
class Test1{
    int x,y;
    Test1(){
        // super() method is called and it goes to its parent which is Object class by default for 
        // all the parent classes....
        x=100;
        y=200;
    }
    Test1(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Test2 extends Test1{
    int a,b;
    Test2(){
        a=300;
        b=400;
    }
    //super(); Method gets called by defaultly....
    Test2(int a,int b){
        super(a,b);
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
