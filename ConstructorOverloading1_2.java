public class ConstructorOverloading1_2{
    public static void main(String[] args) {
        Movies superman1=new Movies(8, 900000,8000, "Rachel Gupta","Disha");
        Movies superman2=new Movies("Vaani Gupta", "Prince Narula",9, 1900000,28000);
    }
}

class Movies{
    String name;
    int rating;
    int moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    Movies(int rating,int moneyCollection,int profit,String leadActor,String leadActress){
        this.rating=rating;
        this.moneyCollection=moneyCollection;
        this.profit=profit;
        this.leadActor=leadActor;
        this.leadActress=leadActress;
        System.out.println("Lead actor has the main role.");
    }
    Movies(String leadActress,String leadActor,int rating,int moneyCollection,int profit){
        this.rating=rating;
        this.moneyCollection=moneyCollection;
        this.profit=profit;
        this.leadActor=leadActor;
        this.leadActress=leadActress;
        System.out.println("Lead actress has the main role.");
    }
}