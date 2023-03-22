<?php
require_once('Car.php');
require_once('Account.php');

$car = new Car("ÑPO6846", new Account("Nestor Rios", "PTKS8124"));
$car->printDataCar();