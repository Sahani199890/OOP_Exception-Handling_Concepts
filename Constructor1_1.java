public class Constructor1_1 {
    public static void main(String[] args) {
        Movies superman1=new Movies(8,900000);
        Movies superman2=new Movies(8,900000,8000);
        Movies superman3=new Movies(8,900000,8000,"Ranveer Singh");
    }
}
class Movies{
    String name;
    Integer rating;
    Integer moneyCollections;
    Integer profit;
    String leadActor;
    String leadActress;

    Movies(int rating,int moneyCollections){
        this.rating=rating;
        this.moneyCollections=moneyCollections;
        System.out.println("Stored rating and money.");
    }
    Movies(int rating,int moneyCollections,int profit){
        this.rating=rating;
        this.moneyCollections=moneyCollections;
        this.profit=profit;
        System.out.println("Stored rating, money, profit are given.");
    }
    Movies(int rating,int moneyCollections,int profit,String leadActor){
        this.rating=rating;
        this.moneyCollections=moneyCollections;
        this.profit=profit;
        this.leadActor=leadActor;
        System.out.println("Stored rating, money, profit, lead actors are given.");
    }
}
