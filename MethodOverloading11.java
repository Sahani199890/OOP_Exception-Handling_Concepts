public class MethodOverloading11 {
    static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    static void add(int a,float b){
        float c=a+b;
        System.out.println("float");
        System.out.println(c);
    }
    static void add(int a,double b){
        double c=a+b;

        System.out.println(c);
    }
    static void add(float a,int b){
        float c=a+b;
        System.out.println(c);
    }
    static void add(double a,int b){
        double c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        int a=5;
        double b=9;
        add(a,b);
    }
}
