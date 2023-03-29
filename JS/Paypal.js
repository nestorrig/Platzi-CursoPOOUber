class Paypal extends Payment {
    constructor(id, amount, reference, branch){
        super(id, amount)
        this.reference = reference;
        this.branch = branch;
    }
}