#Add set into another set in Python

set1 = {10,20,30,40}
print(set1)
set2 = {70,80,90}
print(set2)

set1.update(set2)
print(set1)

set1.remove(80)
print(set1)
set1.discard(10)
print(set1)