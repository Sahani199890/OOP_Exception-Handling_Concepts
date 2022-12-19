public class PublicPrivate1_2 {
    public static void main(String[] args) {
        Movies m=new Movies(10000,500);
        m.displayViews(10000);
        m.displayLikes(500);
        m.printGrade();
    }
}

class Movies{
  
    private int views;
    private int likes;
    Movies(int views,int likes){
        this.views=views;
        this.likes=likes;
    }
    void displayViews(int views){
        this.views=views;
        System.out.println(this.views);
    }
    void displayLikes(int likes){
        this.likes=likes;
        System.out.println(this.likes);
    }
   private int calculateGrade(){
       int finalGrade=((10*likes)+views);
       return finalGrade;
   }
    public void printGrade(){
        System.out.println(calculateGrade());
    }
}