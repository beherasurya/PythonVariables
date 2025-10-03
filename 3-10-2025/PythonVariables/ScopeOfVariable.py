# Local scope in Python

b = 200
# Defining a function in Python
def demo():
    a = 100
    print(a)

# Defining a function for global Variable in python
def demo2():
    print(b)
# Make a local variable as global by using global keyword in Python
def demo3():
    global c
    c= 300
    print(c)

demo3()
print(c)
#As b is a global variable we can access it outside the function in python
print(b)
# This function contains global Variable b
demo2()

#Calling the function
demo()










