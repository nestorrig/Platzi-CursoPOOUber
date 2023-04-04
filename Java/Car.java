class Car {
    Integer id;
    String license;
    String driver;
    protected Integer passenger;

    public Car(String license, String driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (passenger != null) {
            System.out.println("License: " + license + " Name Driver: " + driver + " Passengers: " + passenger);
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