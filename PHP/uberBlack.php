<?php
class uberBlack extends Car {
    public $typerCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typerCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver)
        $this->typerCarAccepted = $typerCarAccepted;
        $this->seatsMaterial = seatsMaterial;
    }
}