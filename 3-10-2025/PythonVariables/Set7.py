#Remove duplicate elements from sets

set1 = {10,20,30,40,50}
set2 = {30,40,50,60,70,80}

print(set1)
print(set2)

set1.symmetric_difference_update(set2)
print(set1)