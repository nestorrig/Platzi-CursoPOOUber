public class Paypal extends Payment {
    String reference;
    String branch;

    public Paypal (Integer id, Integer amount, String reference, String branch){
        super(id, amount);
        this.reference = reference;
        this.branch = branch;
    }
    void printDataPaymentPaypal() {
        System.out.println("Id: " + id + "; Amount: " + amount + "; Reference: " + reference + "; Branch: " + branch);
    }
}