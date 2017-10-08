/**
 * Created by stephenboynton on 6/29/17.
 */
public class Case {

    private String model;
    private String manufactorer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufactorer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPower (){
        System.out.println("powering on!!!");
    }
}
