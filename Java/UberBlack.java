import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    Map<String, Map<String, Integer>> typerCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(
        String license,
        Account driver,
        Map<String, Map<String, Integer>> typerCarAccepted,
        ArrayList<String> seatsMaterial,
        ){
            super(license, driver);
            this.typerCarAccepted = typerCarAccepted;
            this.seatsMaterial = seatsMaterial;
    }
}
