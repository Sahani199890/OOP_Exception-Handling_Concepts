
class Animals{
    void breaths(){
        System.out.println("Animals Breaths");
    }
    void eats(){
        System.out.println("Animals Eats");
    }
    void foodHabbit(){
        System.out.println("Animals are Herbivorous, Carnivorous, and Omnivorous");
    }
}
class Deer extends Animals{
    void eats(){
        System.out.println("Deer eats Grass i.e, Grasing");
    }
    void foodHabbit(){
        System.out.println("Deer is a Herbivorous");
    }
    void jump(){
        System.out.println("Deer jumps really well");
    }
}
class Tiger extends Animals{
    void eats(){
        System.out.println("Tiger eats Flesh");
    }
    void foodHabbit(){
        System.out.println("Tiger is a Carnivorous");
    }
    void run(){
        System.out.println("Tiger runs very fast");
    }
}
class Monkey extends Animals{
    void eats(){
        System.out.println("Monkey eats both veg and non-veg");
    }
    void foodHabbit(){
        System.out.println("Monkey is an Omnivorous");
    }
    void swing(){
        System.out.println("Monkey swings over trees");
    }
}


public class Types_of_InheritanceMethods1 {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.breaths();
        t.eats();
        t.foodHabbit();
        t.run();

        System.out.println();

        Deer d=new Deer();
        d.breaths();
        d.eats();
        d.foodHabbit();
        d.jump();

        System.out.println();

        Monkey m=new Monkey();
        m.breaths();
        m.eats();
        m.foodHabbit();
        m.swing();

    }
}
