from account import Account
from User import User
from Driver import Driver

from car import Car
from UberX import UberX

from payment import Payment
from Paypal import Paypal
from Cash import Cash
from Card import Card



if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("AMS234", Account(0, "Andres Herrera", "ANDA876", "gmail", "1234"))
    print(vars(car))
    print(vars(car.driver))
    uberX_1= UberX("FHGYUF789413", "Nestor Rios", "Audi", "A4")
    print(vars(uberX_1))
    payment1 = Paypal(1, 200, "A", "Garis")
    print(vars(payment1))
    payment2 = Cash(2, 200, 1300)
    print(vars(payment2))
    payment3 = Card(3, 200, "Banorte", "2025", 455)
    print(vars(payment3))

    user0 = User(0, "Filepeto", "Credit Card", "hola@ttt.com", " holaquehace")
    print(vars(user0))
    driver0 = Driver(0, "Toreto", "El Barrio", "rapido@furioso.com", "lafamiliaesprimero")
    print(vars(driver0))