<?php
require_once('car.php');
class UberBlack extends Car {
    public $typerCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typerCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver);
        $this->typerCarAccepted = $typerCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
    public function PrintDataCar(){
        parent::PrintDataCar();
        echo" 
        Car Type: $this->typerCarAccepted
        Seats Material: $this->seatsMaterial
        <br>";
    }
}