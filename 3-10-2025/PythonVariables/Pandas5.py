import pandas as pd

arr1 = [10,20,30]
data1 = pd.Series(arr1,index=['a','b','c'])
print(data1)
print(data1.loc['a'])