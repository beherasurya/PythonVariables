# String functions in Python

val1 = "India is the best"
print(val1.casefold())
print(val1.capitalize())

word1 = "India"
print(word1.center(20,"#"))
print(val1.count("is",0,15))

#Join function in Python
names = ["Rakesh", "Rajesh","Roshan","Rahul"] #List in Python
names2 = {"Rakesh", "Rajesh","Roshan","Rahul"} #Tuple in Python
var1 = "&&"
res = var1.join(names)
print(res)
print(names2)

print(val1.replace("is","bigCountry",1))
countries = "India,Australia,England,Srilanka,Pakistan"
print(countries.split(","))

print(val1.startswith("India"))
#strip function in Python
word = "   contains Whitespace      "
print(word.strip())