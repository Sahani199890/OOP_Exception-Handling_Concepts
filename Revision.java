public class Revision {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane(); /* In tight coupling class reference and onject reference is of same class  */
        //  ^                 ^
        //  |                 |
        // class ref        Object ref
    //(child class ref)    (child class ref)
        PassangerPlane pp=new PassangerPlane();
        FighterPlane fp=new FighterPlane();
        // cp.fly();
        // pp.fly();
        // fp.fly(); 
        Plane mig;
        mig=fp;
        // mig.fly();
        ((CargoPlane)(mig)).cargodelivary();
    }
}
class Plane{
    void fly(){
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane{
    void fly(){
        System.out.println("Cargo plane is flying at low altitude");
    }
    void cargodelivary(){
        System.out.println("landing");
    }
}
class PassangerPlane extends Plane{
    void fly(){
        System.out.println("Passanger plane is flying at medium altitude");
    }
}
class FighterPlane extends Plane{
    void fly(){
        System.out.println("Fighter plane is flying at high altitude");
    }
}
