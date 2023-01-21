import java.util.Scanner;

public class CustomException_1 {
    public static void main(String[] args) {
        RTO rto=new RTO();
        rto.initiate();
    }
}
class UnderAgeException extends Exception{
    public String getMessage(){
        return "Yout are too young. Have patience";
    }
}
class OverAgeException extends Exception{
    public String getMessage(){
        return "Yout are too old. calm down";
    }
}
class Applicant{
    private int age;
    void acceptAge(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();
    }
    void validate() throws UnderAgeException,OverAgeException{
        if(age<18){
            UnderAgeException uae=new UnderAgeException();
            System.out.println(uae.getMessage());
            throw uae;
        }
        else if(age>60){
            OverAgeException oae=new OverAgeException();
            System.out.println(oae.getMessage());
            throw oae;
        }
        else{
            System.out.println("Collect your License");
        }
    }
}
class RTO{
    void initiate(){
        for(; ;){
            System.out.println("Do you like to apply for the license: YES/NO");
            Scanner sc=new Scanner(System.in);
            String ans=sc.next();
            if(ans.equals("YES")){
                try {
                    Applicant user=new Applicant();
                    user.acceptAge();
                    user.validate();
                } catch (Exception e) {
                    
                }
            }
            else{
                System.out.println("Thank you for visiting us ");
                System.exit(0);
            }
        }
    }
}

