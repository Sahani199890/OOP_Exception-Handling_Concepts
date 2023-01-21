/* Advantage of Polymorphism
  1) Code flexibility
  2) Code size Reduction
 */

public class Polymorphism {
    public static void main(String[] args) {
        PassangerPlane pp=new PassangerPlane();
        CargoPlane cp=new CargoPlane();
        FighterPlane fp=new FighterPlane();
        Airport.permit(pp);
        Airport.permit(cp);
        Airport.permit(fp);
        // Plane ref;
        // ref=pp;
        // ((PassangerPlane)(ref)).play();  // downcasting where parent clas ref is pointing to child class object
    }
}
class  Plane{
    void takeOff(){
        System.out.println("Plane is taking off");
    }
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane is landing");
    }
}
class PassangerPlane extends Plane{
    void takeOff(){
        System.out.println("Passangerplane is taking off");
    }
    void fly(){
        System.out.println("Passangerplane is flying at medium altitude");
    }
    void land(){
        System.out.println("Passangerplane is landing");
    }
    void play(){
        System.out.println("Nothing");
    }
}
class CargoPlane extends Plane{
    void takeOff(){
        System.out.println("Cargoplane is taking off");        
    }
    void fly(){
        System.out.println("Cargoplane is flying at low altitude");
    }
    void land(){
        System.out.println("Cargoplane is landing");
    }
}
class FighterPlane extends Plane{
    void takeOff(){
        System.out.println("FighterPlane is taking off");        
    }
    void fly(){
        System.out.println("FighterPlane is flying at high altitude");
    }
    void land(){
        System.out.println("FighterPlane is landing");
    }
}
class Airport{
    static void permit(Plane ref){      //referance of parent class is accessing by the child class 
        ref.takeOff();                  //in the class of Airport 
        ref.fly();
        ref.land();
    }                               //3 methods:9 outputs
}                                   //1:3    (Polymorphism is done ) 