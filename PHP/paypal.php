<?php
require_once('payment.php');
class Paypal extends Payment{
    public $reference;
    public $branch;

    public function __construct($id, $amount, $reference, $branch){
        parent::__construct($id, $amount);
        $this->reference = $reference;
        $this->branch = $branch;
    }
    public function PrintDataPaymentPaypal(){
        echo "Id: $this->id; Amount: $this->amount; Reference: $this->reference; Branch; $this->branch <br/>";
    }
}