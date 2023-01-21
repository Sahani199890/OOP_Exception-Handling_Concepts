
//Code on Password encryption and check weather password and name is present of not 

public class User {
    private Integer id;
    private String userName;
    private String password;
    public User(Integer id,String userName,String password){
        this.id=id;
        this.userName=userName;
        this.password=password;
    }
    public User(){

    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public static void main(String[] args) {
        UserBO u=new UserBO();
        System.out.println(u.validate("Abhishek", "ABHI"));
        System.out.println(u.validate("Sahani","gfdysab"));
    }
}
class UserBO{
    private User[] getUsers(){
        User[] users=new User[4];
        users[0]=new User(1,"Abhishek","BCIJ");
        users[1]=new User(2,"Abhi_Shani","923cboamxvfuh8");
        users[2]=new User(3,"Abhi","63rtvcdhas29ydh8");
        users[3]=new User(4,"Sahani","eghu29ydh8");
        
        return users;
    }
    private String encryptedPassword(String password){
        String res="";
        for(Integer i=0;i<password.length();i++){
            res+=(char)(password.charAt(i)+1);
        }
        return res;
    }
    public Boolean validate(String userName,String password){
        User[] user=getUsers();
        for(Integer i=0;i<user.length;i++){
            String un=user[i].getUserName();
            String pw=user[i].getPassword();
            if(un.equals(userName) && pw.equals(encryptedPassword(password))){
                return true;
            }
        }
        return false;
    }
}

