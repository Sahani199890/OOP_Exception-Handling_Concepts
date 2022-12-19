import java.util.*;
public class Customer{
   Privete int cid;
   Private String cname;
   Private long cnum;
}
pubic customer(){
    cid=302;
    cname="Abhi";
    cnum=8639897979L;
}
public customer(int cid,String cname,long cnum){
    this();
    this.cid=cid;
    this.cname=cname;
    this.cnum=cnum;
}
public int getcid(){
    return cid;
}
public String getcname(){
    return cname;
}
public long getcnum(){
    return cnum;
}
public static void main(String[] args){
    Customer c=new Customer(039,"Sahani",9963270993L){
    System.out.print(c.getcid+" "+c.getcname+" "+c.getcnum);
    }
}
