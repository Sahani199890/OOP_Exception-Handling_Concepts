public class Overriding1_1 {
    public static void main(String[] args) {
        CommercialMovies londonDreams=new CommercialMovies("London Dreams 2",10,9000,8850,"Rannvijay Singha, Rachel Gupta, Prince Narula","Prajakta");
        System.out.println(londonDreams.money);
        System.out.println(londonDreams.profit);
        System.out.println(londonDreams.leadActor);
        londonDreams.displayRating();
    }
}
class Movies{
    String name;
    int rating;
    int money;
    int profit;
    String leadActor;
    String leadActress;

    Movies(String name,int rating,int money,int profit,String leadActor,String leadActress){
        this.name=name;
        this.rating=rating;
        this.money=money;
        this.profit=profit;
        this.leadActor=leadActor;
        this.leadActress=leadActress;
    }

    void displayRating(){
        System.out.println(this.rating);
        System.out.println("This is the function of movies class.");
    }
}
class CommercialMovies extends Movies{
    CommercialMovies(String name,int rating,int money,int profit,String leadActor,String leadActress){
        super(name, rating, money, profit, leadActor, leadActress);
    }
}