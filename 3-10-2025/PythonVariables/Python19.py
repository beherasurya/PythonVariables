#Data Cleaning in Pandas

import pandas as pd

# 75% of time we need to clean our Data because of incomplete work or irrelevant Data

df = pd.read_csv("data.csv")
# new_df = df.drop(columns=["Legendary", "No"])
# print(new_df)

# new_df = df.dropna(subset = ["Type2"]) #Dropna means Drop Not Available
# new_df = df.fillna({"Type2": "None"})

# df["Type1"] = df["Type1"].replace({"Grass":"GRASS","Fire":"FIRE","Water":"WATER"})

#Standarized Text
# df["Name"] = df["Name"].str.lower()
# df["Legendary"] = df["Legendary"].astype(bool)

#Remove duplcates
df_new = df.drop_duplicates()
print(df_new.to_string())
