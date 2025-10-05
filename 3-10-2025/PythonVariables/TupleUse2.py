# Accessing Value in Tuple

company_tuple = ("IBM","Wipro","Tcs","Infosys")
print(company_tuple[0],company_tuple[1],company_tuple[2])
if "Tcs" in company_tuple:
    print("Found!")
else: print("Not Found!")

print("Access Tuple through Index: ",company_tuple[3])
print("Access Tuple through -Ve Index: ",company_tuple[-3])