from payment import Payment

class Cash(Payment):
    money = int
    change = int

    def __init__(self, id, amount, money):
        super().__init__(id, amount)
        self.money = money
        self.change = money - amount