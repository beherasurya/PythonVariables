import pandas as pd

df = pd.read_csv("data.csv",index_col = "Name")
print(df.iloc[0:12:2,0:3])