import java.util.Scanner;

//Packages alwasys should be in the 1st line then after the import files

public class AccessSpecifier{
    public static void main(String[] args) {
        Bank b=new Bank();
        // b.setBalance();
        System.out.println("Balance by Default: "+b.setBalance());
        // System.out.println(b.getBalance());
    }
}
class Bank{
    private long balance=7367;

    // public long getBalance() {
    //     return balance;
    // }

    private void setBalance(long balance) {
        this.balance = balance;
    }
    long setBalance(){
        this.balance=837;
        return balance;
    }    
}