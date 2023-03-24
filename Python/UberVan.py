from car import Car 

class UberVan(Car):
    typerCarAccepted = []
    seatsMaterial = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super().__init__(license, driver)
        self.typerCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial