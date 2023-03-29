//console.info("CARS")

var car = new Car("AW456", new Account("Andres Herrera", "ADP564"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("DPHM7913", new Account("Nestor Rios", "ÑJVJ4568"))
uberX.passenger = 2;
uberX.printDataCar();

let payment0 = new Payment(0, 1200);
payment0.PrintDataPayment();
let payment1 = new Paypal(1, 1200, "APJ", "Mercado Libre");
payment1.PrintDataPayment();
let payment2 = new Cash(2, 1200, 5000);
payment2.PrintDataPayment();
let payment3 = new Card(3, 1200, "Santander", 2027, 265);
payment3.PrintDataPayment();

let account0 = new User(0, "Nestor Rios", "Passport", "anitalahuerfanita@plaxi.com", "contraseña");
account0.PrintDataAccount();
let account1 = new Driver(0, "Fulgencio Lopez", "License", "elfulges99@vivamex.com", "1234");
account1.PrintDataAccount()