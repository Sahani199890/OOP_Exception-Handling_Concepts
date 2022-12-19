public class Abstraction {
    public static void main(String[] args) {
        PassangerPlane pp=new PassangerPlane();
        CargoPlane cp=new CargoPlane();
        FighterPlane fp=new FighterPlane();
        Airport.permit(pp);
        Airport.permit(cp);
        Airport.permit(fp);
    }
}


abstract class  Plane{
    abstract void takeOff();
    abstract void fly();
    abstract void land();
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
    static void permit(Plane ref){
        ref.takeOff();   
        ref.fly();
        ref.land();
    }
}