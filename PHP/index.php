<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('uberVan.php');
require_once('uberBlack.php');

require_once('account.php');
require_once('User.php');
require_once('Driver.php');

require_once('payment.php');
require_once('paypal.php');
require_once('cash.php');
require_once('card.php');

echo "<br/> CARS <br/>";
$uberX = new UberX("ÑPO6846", "Nestor Rios", "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();
$uberPool = new UberPool("DHP752", "Carlos Martinez", "Dodge", "Attitude");
$uberPool->setPassenger(3);
$uberPool->printDataCar();
$uberVan = new UberVan("DHP752", "Gabriel Martinez", "Rang Rover", "Sintetic");
$uberVan->setPassenger(5);
$uberVan->printDataCar();
$uberBlack = new UberBlack("DHP752", "Gabriel Martinez", "Audi TT", "Leather");
$uberBlack->setPassenger(5);
$uberBlack->printDataCar();
echo "<br/> PAYMENTS <br/>";
$payment0 = new Payment(0, 1000);
$payment0->PrintDataPayment();
$payment1 = new Paypal(1, 1000, "A", "Amazon");
$payment1->PrintDataPaymentPaypal();
$payment2 = new Cash(2, 1000, 3000);
$payment2->PrintDataPaymentCash();
$payment3 = new Card(3, 1000, "Inbursa", 2025, 726);
$payment3->PrintDataPaymentCard();
echo "<br/> USERS <br/>";
$user0 = new User(0, "Master Chief", 117, "halo@foreruner.com", "diceloalcoventant", "User");
$user0->PrintDataPaymentAccount();
$driver0 = new Driver(0, "Inquisidor", "Elite renegado", "halo@Elites.com", "AAAAAAAAAH", "Driver");
$driver0->PrintDataPaymentAccount();
?>