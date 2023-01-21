import java.util.Scanner;

public class Exceptions_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Connection Established");
        try{
        System.out.println("Enter Numerator");
        int a=sc.nextInt();
        System.out.println("Enter Denominator");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
        System.out.println("Enter the size of the array");
        int[] k=new int[sc.nextInt()];
        System.out.println("Enter the index of the Array");
        int i=sc.nextInt();
        System.out.println("Enter the element for array");
        int x=sc.nextInt();
        k[i]=x;
        System.out.println(k[i]);
    }
    catch(ArithmeticException e){
        System.out.println("Denominator cannot be zero");    
    }
    catch(NegativeArraySizeException e){
        System.out.println("Index of an array cannot be zero");            
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index cannot be given beyond array length");
    }
    catch(Exception ae){
        System.out.println("Invalid Input");
    }
    System.out.println("Connection terminated");
    }
}
