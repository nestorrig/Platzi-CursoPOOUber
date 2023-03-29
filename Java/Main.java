class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", "Andres Herrera");
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567","Andrea Herrera");
        car2.passenger = 3;
        car2.printDataCar();

        Payment payment0 = new Payment(0, 1000);
        payment0.printDataPayment();
        Paypal payment1 = new Paypal(1, 1000, "A", "Garis");
        payment1.printDataPaymentPaypal();
        Cash payment2 = new Cash(2, 1000, 2500);
        payment2.printDataPaymentCash();
        Card payment3 = new Card(3, 1000, "Banorte", 2025, 896);
        payment3.printDataPaymentCard();

        Account accountZero = new Account(0, "Martinoli", "driver license", "holamundo@helloworld.com", "4321");
        accountZero.printDataAccount();
        User userZero = new User(1, "Kick Butowski", "Medio doble de acción", "esobratt@hottermail.com", "leñadorasenbikini");
        userZero.printDataAccountUser();
        Driver driverZero = new Driver(999, "Alien", "100% real no fake", "area51@peace.com", "corrercomonaruto");
        driverZero.printDataAccountDriver();
    }
}