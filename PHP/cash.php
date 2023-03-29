<?php
require_once('payment.php');
class Cash extends Payment{
    public $money;
    public $change;

    public function __construct($id, $amount, $money){
        parent::__construct($id, $amount);
        $this->money = $money;
        $this->change =$money - $amount;
    }
    public function PrintDataPaymentCash(){
        echo "Id: $this->id; Amount: $this->amount; Money: $this->money; Change; $this->change <br/>";
    }
}