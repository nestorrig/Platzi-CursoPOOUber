public class UberVan extends Car {
    Map<String, Map<String, Integer>> typerCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(
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
