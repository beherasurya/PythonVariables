#Filter Data based on conditions
import pandas as pd

df = pd.read_csv("data.csv")
# res_df = df[df["Height"] >=2] #Filter data based on Given Height
# print(res_df)

# weight_df = df[df["Weight"]>100] #Filter data based on Given Weight
# print(weight_df)

# legendary_df = df [df["Legendary"] == True] #Filter data based on Given Column Name
# print(legendary_df)

# water_pokemon = df[(df["Type1"] == "Water") | (df["Type2"] == "Water")] #Filter data using or
# print(water_pokemon)

fire_pokemon = df[(df["Type1"] == "Fire") & (df["Type2"] == "Flying") ]
print(fire_pokemon)

