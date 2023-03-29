<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');

require_once('account.php');

require_once('payment.php');
require_once('paypal.php');
require_once('cash.php');
require_once('card.php');

echo "<br/> CARS <br/>";
$uberX = new UberX("ÑPO6846", new Account("Nestor Rios", "PTKS8124"), "Chevrolet", "Spark");
$uberX->printDataCar();
$uberPool = new UberPool("DHP752", new Account("Carlos Martinez", "GNTD5647"), "Dodge", "Attitude");
$uberPool->printDataCar();
echo "<br/> PAYMENTS <br/>";
$payment0 = new Payment(0, 1000);
$payment0->PrintDataPayment();
$payment1 = new Paypal(1, 1000, "A", "Amazon");
$payment1->PrintDataPaymentPaypal();
$payment2 = new Cash(2, 1000, 3000);
$payment2->PrintDataPaymentCash();
$payment3 = new Card(3, 1000, "Inbursa", 2025, 726);
$payment3->PrintDataPaymentCard();
?>