#Select Data on the basis of row in Pandas
import pandas as pd

df = pd.read_csv("data.csv")
print(df.loc[0]) #Selection on basis of Index