<?php
require_once('car.php');
class UberVan extends Car {
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

    public function setPassenger($passenger) {
    
        if ($passenger == 6) {
            $this->passenger = $passenger;
        }
        else {
            echo "<p style='color: orange; display: inline-block'>Necesitas agregar 6 pasajeros </p>  ";
        }
    
    }
}