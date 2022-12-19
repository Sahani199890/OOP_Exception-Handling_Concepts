import java.util.ArrayList;
import java.util.*;
public class Inheriatnce3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String song=sc.nextLine();
        String artist=sc.nextLine();
        int views=sc.nextInt();
        int likes=sc.nextInt();
        int releasedYear=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<String> comments=new ArrayList<>();
        for(int i=0;i<n;i++){
            comments.add(sc.nextLine());
        }
        int times=sc.nextInt();
        int impressions=sc.nextInt();
        ShortVideo you=new ShortVideo(song,artist,views,likes,releasedYear,n,comments,times,impressions);
        you.display();
    }
}
class YoutubeVideo{
    String song;
    String artist;
    int views;
    int likes;
    int releasedYear;
    int n;
    ArrayList<String> comments;

}
class ShortVideo extends YoutubeVideo{
    int times;
    int impressions;
    ShortVideo(String song,String artist,int views,int likes,int releasedYear,int n,ArrayList<String> comments,int times,int impressions){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releasedYear=releasedYear;
        this.n=n;
        this.comments=comments;
        this.times=times;
        this.impressions=impressions;

    }
    void display(){
        System.out.println(this.song);
        System.out.println(this.artist);
        System.out.println(this.views);
        System.out.println(this.likes);
        System.out.println(this.releasedYear);
        System.out.println(this.n);
        for(int i=0;i<n;i++){
            System.out.println(this.comments.get(i));
        }
        System.out.println(this.times);
        System.out.println(this.impressions);
    }
}