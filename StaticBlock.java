


/**As we know the java looks for static variables then static block and 
    then it java prefers for static method i.e Main method() so As i printed java 
    in static block which is after main method but java prefers static block 1t
    so we gets printed whatever code in the static block befor main and outside the main method **/

public class StaticBlock {
    static {
        System.out.println("Arey bhai pehle mai aaunga naa kyu ki do static block hai tho jo 1st block me rahega vahi pahle aayega ");
    }
    public static void main(String[] args) {
        System.out.println("Am i 1st?");
    }
    static{
        System.out.println("This is Abhishek from static block");
    }
}
