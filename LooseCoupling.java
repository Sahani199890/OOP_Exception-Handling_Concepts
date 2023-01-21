public class LooseCoupling {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane(); /* In loose coupling class reference and object reference is of parent class given to child class */
        //  ^                 ^
        //  |                 |
        // class ref        Object ref
    //(parent class ref)    (child class ref)
        PassangerPlane pp=new PassangerPlane();
        FighterPlane fp=new FighterPlane();
        // cp.fly();
        // pp.fly();
        // fp.fly();
        Plane ref;  // ref is referring to parent class 
        ref=cp;
        ref.fly();
        // if we want "ref" to work for child class then
        ((CargoPlane)(ref)).fly();  //now we are downcasting and sending class ref to child and ref refers to child


        ref=pp;
        ref.fly();
        
        ref=fp;
        ref.fly();
        ((FighterPlane)(ref)).fly();   ////now we are downcasting and sending class ref to child and ref refers to child

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
