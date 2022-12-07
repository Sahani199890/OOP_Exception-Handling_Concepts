import java.io.*;
import java.util.*;

public class Constructor {

    public static void main(String[] args) {
        Movie m=new Movie(9,700000,9000,"Jack","Alia");
        m.display();
        
    }
}
class Movie{
    int rating;
    int moneyCollections;
    int profit;
    String actor;
    String actress;
    Movie( int rating,int moneyCollections,int profit,String actor,String actress){
        this.rating=rating;
        this.moneyCollections=moneyCollections;
        this.profit=profit;
        this.actor=actor;
        this.actress=actress;
    }
    void display(){
        System.out.println(this.rating);
        System.out.println(this.moneyCollections);
        System.out.println(this.profit);
        System.out.println(this.actor);
        System.out.println(this.actress);
    }
}