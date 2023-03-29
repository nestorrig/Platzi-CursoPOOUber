from payment import Payment

class Paypal(Payment):
    reference = str
    branch = str

    def __init__(self, id, amount, reference, branch):
        super().__init__(id, amount)
        self.reference = reference
        self.branch = branch