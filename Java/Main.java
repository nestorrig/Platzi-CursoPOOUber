class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", "Andres Herrera");
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567","Andrea Herrera");
        car2.passegenger = 3;
        car2.printDataCar();

        Payment payment0 = new Payment(0, 1000);
        payment0.printDataPayment();
        Paypal payment1 = new Paypal(1, 1000, "A", "Garis");
        payment1.printDataPaymentPaypal();
        Cash payment2 = new Cash(2, 1000, 2500);
        payment2.printDataPaymentCash();
        Card payment3 = new Card(3, 1000, "Banorte", 2025, 896);
        payment3.printDataPaymentCard();
    }
}