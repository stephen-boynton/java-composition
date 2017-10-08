/**
 * Created by stephenboynton on 6/29/17.
 */
public class Main {

    public static void main (String[] args) {

        Dimensions dimensions = new Dimensions(20, 30, 30);
        Case theCase = new Case("220b", "Dell", "8v", dimensions);
        Monitor monitor = new Monitor("20 inch beast", "Acer", 27, new Resolution(2540, 2000));
        Motherboard motherboard = new Motherboard("Asus", "Asus2", 4, 3, "bios");

        PC thePC = new PC(theCase,monitor,motherboard);

        thePC.powerUP();
    }

}
