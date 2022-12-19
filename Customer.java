
public class Customer{
   private int cid;
   private String cname;
   private long cnum;

   public Customer(int abs){
    cid=abs;
    cname="Abhi";
    cnum=72736897379L;
   }

Customer(int cid,String cname,long cnum){
    this(cid);
    // this.cid=cid;
    // this.cname=cname;
    // this.cnum=cnum;
    
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
    Customer c=new Customer(39,"Sahani",9963270993L);
    System.out.println(c.getcid()+" "+c.getcname()+" "+c.getcnum());
    }
}