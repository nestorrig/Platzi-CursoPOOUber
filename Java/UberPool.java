public class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, String driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
}
