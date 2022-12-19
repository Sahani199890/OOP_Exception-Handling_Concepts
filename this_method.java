

public class this_method {
    private int id;
    private String name;
    private long num;
public this_method(){
    name="Abhishek";
}
public this_method(int id){
    this();
    this.id=id;
}
public this_method(int id,String name,long num){
    this(id);
}
public int getid(){
    return id;
}
public String getname(){
    return name;
}
public long getnum(){
    return num;
}
public static void main(String[] arge){
    this_method tm=new this_method(102,"Sahani",86364598126L);
    System.out.println(tm.getid()+"\n"+tm.getname()+"\n"+tm.getnum());
}
}
