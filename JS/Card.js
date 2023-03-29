class Card extends Payment {
    constructor(id, amount, bank, dueDate, cvv){
        super(id, amount);
        this.bank = bank;
        this.dueDate = dueDate;
        this.cvv = cvv;
    }
}