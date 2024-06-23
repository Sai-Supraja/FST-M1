class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer= manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " started moving")
 
    def stop(self):
        print(self.manufacturer + " " + self.model + " stopped moving")
 
car1 = Car("Suzuki", "Swift", "2015", "Manual", "White")
car2 = Car("Toyota", "Corolla", "2012", "Manual", "Black")
car3 = Car("Maruti", "800", "2013", "Automatic", "Red")
 
car1.accelerate()
car1.stop()
