public class AggregationAndComposition {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        Charger c=new Charger("Mi",30);
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
        // m.hasACharger(c);
        // m=null;
        // System.out.println(m.os.getVersion());
        // System.out.println(m.os.getYear());
    }
}
class Charger{
    private String brand;
    private int  voltage;
    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }
    public String getBrand() {
        return brand;
    }
    public int getVoltage() {
        return voltage;
    }
}

class Os{
    private String version;
    private int year;
    public Os(String version, int year) {
        this.version = version;
        this.year = year;
    }
    public String getVersion() {
        return version;
    }
    public int getYear() {
        return year;
    }
}
class Mobile{
    Os os=new Os("Android",512);
    void hasACharger(Charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}
