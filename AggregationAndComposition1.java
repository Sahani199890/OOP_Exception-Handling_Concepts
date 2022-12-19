public class AggregationAndComposition1 {
    public static void main(String[] args) {
        Student s=new Student();
        Bike b=new Bike("KTM",40);
        Book bo=new Book("Java","JG");
        System.out.println(s.h.getWeight());
        System.out.println(s.h.getBpm());
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getColour());
        s.hasA(b);
        s.hasA(bo);
    }
}
class Bike{
    private String brand;
    private int mileage;
    public char[] getMileage;
    public Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getMileage() {
        return mileage;
    }

}
class Book{
    private String name;
    private String author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

}
class Brain{
    private int weight;
    private String colour;
    public Brain(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getWeight() {
        return weight;
    }
    public String getColour() {
        return colour;
    }

}
class Heart{
    private int weight;
    private int Bpm;
    public Heart(int weight, int Bpm) {
        this.weight = weight;
        this.Bpm = Bpm;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setColour(int Bpm) {
        this.Bpm = Bpm;
    }
    public int getWeight() {
        return weight;
    }
    public int getBpm() {
        return Bpm;
    }
}
class Student{
    Brain b=new Brain(1400,"Grey");
    Heart h=new Heart(289,79);
    void hasA(Bike b){
        System.out.println(b.getBrand());
        System.out.println(b.getMileage);
    }
    void hasA(Book bo){
        System.out.println(bo.getName());
        System.out.println(bo.getAuthor());
    }
}