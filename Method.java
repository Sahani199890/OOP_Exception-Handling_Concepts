import java.io.*;
import java.util.*;

public class Method {

    public static void main(String[] args) {
        Movies m=new Movies(8);
        System.out.println(m.hitList());
        Movies l=new Movies(9);
        System.out.println(l.hitList());
        Movies k=new Movies(10);
        System.out.println(k.hitList());
    }
}
class Movies{
    String name;
    int rating;
    int moneyCollection;
    int Profit;
    String leadActor;
    String leadActress;
    Movies(int rating){
        this.rating=rating;
    }
    boolean hitList(){
        if(this.rating>5){
            return true;
        }
        return false;
    }
}