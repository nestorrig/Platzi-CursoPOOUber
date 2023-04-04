public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(
        String license,
        String driver,
        Map<String, Map<String, Integer>> typeCarAccepted,
        ArrayList<String> seatsMaterial,
        ){
            super(license, driver);
            this.typeCarAccepted = typeCarAccepted;
            this.seatsMaterial = seatsMaterial;
    }

    void printDataCarUberVan() {
        if (passenger != null) {
            System.out.println("License: " + license + " Name Driver: " + driver + " Type Car: " + typeCarAccepted + " Seat Material: " + seatsMaterial + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas agregar 6 pasajeros");
        }
    }
}
