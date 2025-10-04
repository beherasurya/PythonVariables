#Recursion in Python

def find_factorial(number):
    if(number == 0 ):
        return 1
    else:
        return number * find_factorial(number -1)

print("1! = ",find_factorial(1))
print("6! = ",find_factorial(6))
print("5! = ",find_factorial(5))