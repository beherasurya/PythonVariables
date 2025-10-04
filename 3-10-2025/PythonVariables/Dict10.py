# Delete element from Python and return the value

dict_fruits = {
    
    "name": "Apple",
    "price": 500,
    "quantity": 10
}

print(dict_fruits)
res = dict_fruits.pop("quantity")
print("Deleted Value from Dict : ",res)