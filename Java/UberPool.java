public class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, String driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    void printDataCarUberPool() {
        if (passenger != null) {
            System.out.println("License: " + license + " Name Driver: " + driver + " Brand: " + brand + " Model: " + model + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if (passenger == 3) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas agregar 3 pasajeros");
        }
    }
}
