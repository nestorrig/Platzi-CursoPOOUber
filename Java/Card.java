public class Card extends Payment {
    String bank;
    Integer dueDate;
    Integer cvv;

    public Card (Integer id, Integer amount, String bank, Integer dueDate, Integer cvv){
        super(id, amount);
        this.bank = bank;
        this.dueDate = dueDate;
        this.cvv = cvv;
    }
    void printDataPaymentCard() {
        System.out.println("Id: " + id + "; Amount: " + amount + "; Bank: " + bank + "; Due date: " + dueDate + "; CVV: " + cvv);
    }
}