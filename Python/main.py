from car import Car
from account import Account

if __name__ == "__name__":
    print("Hola mundo")
    
    car = Car("AKP863", Account("Nestor Rios", "YJIT6510"))
    print(vars(car))
    print(vars(car.driver))