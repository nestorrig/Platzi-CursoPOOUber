<?php
require_once('Car.php');
require_once('uberX.php');
require_once('uberPool.php');

require_once('Account.php');

$uberX = new UberX("ÑPO6846", new Account("Nestor Rios", "PTKS8124"), "Chevrolet", "Spark");
$uberX->printDataCar();
$uberPool = new UberPool("DHP752", new Account("Carlos Martinez", "GNTD5647"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>