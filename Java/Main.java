class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "NAN446"));
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567",new Account("Andrea Herrera", "KAP496"));
        car2.passegenger = 3;
        car2.printDataCar();
    }
}