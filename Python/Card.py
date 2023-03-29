from payment import Payment
from datetime import date

class Card(Payment):
    bank = str
    dueDate = date.today()
    cvv = int

    def __init__(self, id, amount, bank, dueDate, cvv):
        super().__init__(id, amount)
        self.bank = bank
        self.dueDate = dueDate
        self.cvv = cvv
