<?php
class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;
    public $UserType;

    public function __construct($id, $name, $document, $email, $password, $userType){
        $this->id = $id;
        $this->name = $name;
        $this->document = $document;
        $this->email = $email;
        $this->password = $password;
        $this->userType = $userType;
    }
    public function PrintDataPaymentAccount(){
        echo "Id: $this->id; Name: $this->name; Document: $this->document; Email; $this->email; Password; $this->password; User type; $this->userType <br/>";
    }
}