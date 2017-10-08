/**
 * Created by stephenboynton on 6/29/17.
 */
public class Motherboard {

    private String model;
    private String manufactorer;
    private int ram;
    private int slots;
    private String bios;

    public Motherboard(String model, String manufactorer, int ram, int slots, String bios) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.ram = ram;
        this.slots = slots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public int getRam() {
        return ram;
    }

    public int getSlots() {
        return slots;
    }

    public String getBios() {
        return bios;
    }

    public void loadProgram() {
        System.out.println("Program is loading!");
    }
}
