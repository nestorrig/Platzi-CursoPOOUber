class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, String driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    void printDataCarUberX() {
        if (passenger != null) {
            System.out.println("License: " + license + " Name Driver: " + driver + " Brand: " + brand + " Model: " + model + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas agregar 4 pasajeros");
        }
    }

}
