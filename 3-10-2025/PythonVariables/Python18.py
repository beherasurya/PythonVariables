import pandas as pd

df = pd.read_csv("data.csv")
# print(df.mean(numeric_only=True))
# print(df.sum(numeric_only=True))
# print(df.min(numeric_only=True))
# print(df.max(numeric_only=True))
# print(df.count())

# print(df["Height"].mean())
# print(df["Height"].sum())
# print(df["Height"].min())
# print(df["Height"].max())
# print(df["Height"].count())

#Group by Data
group1 = df.groupby("Type1")
# print(group1["Height"].mean())
# print(group1["Height"].sum())
# print(group1["Height"].min())
# print(group1["Height"].max())
print(group1["Height"].count())