public class Cash extends Payment {
    Integer money;
    Integer change;

    public Cash (Integer id, Integer amount, Integer money){
        super(id, amount);
        this.money = money;
        this.change = money - amount;
    }
    void printDataPaymentCash() {
        System.out.println("Id: " + id + "; Amount: " + amount + "; Money: " + money + "; Change: " + change);
    }
}