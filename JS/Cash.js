class Cash extends Payment {
    constructor(id, amount, money){
        super(id, amount);
        this.money = money;
        this.change = money - amount
    }
}