import pandas as pd

dict1 = {
    "name":["Rock","John","Punk"],
    "age":[30,40,50]
}

data1 = pd.DataFrame(dict1)
print(data1)
data1["Job"] = ["Eng","N/A","Manager"]
print(data1)

new_row = pd.DataFrame([{"name": "Peter","age":50,"Job":"Wrestler"},
                        {"name": "Daniel","age":50,"Job":"Wrestler"}],index = ["3","4"])
data2 = pd.concat([data1,new_row])
print(data2)