# Class in Python

class Bike:

    name = "Yamaha"
    color = "Blue"
    price = "2.5L"

    def vehicle_details(self):
        print("Bike Name: ",self.name)
        print("Bike Color: ",self.color)
        print("Bike Price: ",self.price)

bike_obj1 = Bike()
bike_obj2 = Bike()

print("Bike Name: ",bike_obj1.name)
print("Bike Color: ",bike_obj1.color)
print("Bike Price: ",bike_obj1.price)

bike_obj2.vehicle_details()