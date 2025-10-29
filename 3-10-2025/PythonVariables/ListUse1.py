#Use of List in Python


class GroceryDetails:
    number_list = [10, 30, 40, 50, 60, 70]
    float_list = [10.0, 2.0, 4.6, 55.12]
    name_list = ["Blr", "Mum", "Pun", "Hyd", "Chn"]

    def print_details(self):
        print("number list: ",self.number_list)
        print("number list: ", self.float_list)
        print("number list: ", self.name_list)

obj1 = GroceryDetails()
obj1.print_details()
