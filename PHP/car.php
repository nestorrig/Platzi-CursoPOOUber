<?php
class Car {
    public $id;
    public $license;
    public $driver;
    protected $passenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }
    public function PrintDataCar(){
        echo "
        Licencia: $this->license 
        Driver: {$this->driver->name} 
        Número de pasajeros: $this->passenger
        ";
    }

    public function getPassenger() {
        return $this->passenger;
    }
    public function setPassenger($passenger) {
        
        if ($passenger == 4) {
            $this->passenger = $passenger;
        }
        else {
            echo "<p style='color: red; display: inline-block'>Necesitas agregar 4 pasajeros </p> ";
        }
    
    }
}