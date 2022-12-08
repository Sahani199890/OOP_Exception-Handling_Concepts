import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthScrollBarUI;

/*
 * There are three types of Methods in Ineritance they are 
 * 1.Inherited Method->Method which are used in child class without making any changes from parent's class
 * 2.Overridden Method->Method which are used in child class by making little changes in method of parent's class
 * 3.Specialised Method->Creating a method in class which is not present in the parent class/Super class
 */


class Plane{
    void takeOff(){
        System.out.println("Plane is taking Off");
    }
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane is Landing");
    }
}
class PassangerPlane extends Plane{
    void fly(){
        System.out.println("Passanger Plane is flying with medium altitude");
    }
    void CarryPassangers(){
        System.out.println("Passanger Plane is carrying passangers");
    }
}
class CargoPlane extends Plane{
    void fly(){
        System.out.println("Cargo Plane is flying with lower altitude");
    }
    void CarryCargo(){
        System.out.println("Cargo Plane is carrying cargo");
    }
}
class FighterPlane extends Plane{
    void fly(){
        System.out.println("Fighter PLane is flying at higher altitude");
    }
    void CarryWeapons(){
        System.out.println("Fighter Plane is carrying weapons");
    }
}

public class Types_of_InheritanceMethods {
    public static void main(String[] args) {
        FighterPlane fp=new FighterPlane();
        fp.takeOff();       // Inherited Method
        fp.fly();           // Overridden Method
        fp.land();          // Inherited Method
        fp.CarryWeapons();  // Specialised Method

        System.out.println();

        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.land();
        cp.CarryCargo();

        System.out.println();
        PassangerPlane pp=new PassangerPlane();
        pp.takeOff();
        pp.fly();
        pp.land();
        pp.CarryPassangers();
    }
}
