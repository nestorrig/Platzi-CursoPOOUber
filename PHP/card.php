<?php
require_once('payment.php');
class Card extends Payment{
    public $bank;
    public $dueDate;
    public $cvv;

    public function __construct($id, $amount, $bank, $dueDate, $cvv){
        parent::__construct($id, $amount);
        $this->bank = $bank;
        $this->dueDate =$dueDate;
        $this->cvv =$cvv;
    }
    public function PrintDataPaymentCard(){
        echo "Id: $this->id; Amount: $this->amount; Bank: $this->bank; Due date; $this->dueDate; CVV: $this->cvv <br/>";
    }
}