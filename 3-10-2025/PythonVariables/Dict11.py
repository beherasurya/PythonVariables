#Iterating through Dictionary

dict_fruits = {

    "name": "Apple",
    "price": 500,
    "quantity": 10
}

for fruit in dict_fruits:
    print(fruit,":",dict_fruits[fruit])

print("string rep %s"% str(dict_fruits))
print(len(dict_fruits))

dict_fruits2 = dict_fruits.copy()
print(dict_fruits2)