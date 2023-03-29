class Payment {
    Integer id;
    Integer amount;

    public Payment(Integer id, Integer amount){
        this.id = id;
        this.amount = amount;
    }
    void printDataPayment() {
        System.out.println("Id: " + id + "; Amount: " + amount);
    }
}