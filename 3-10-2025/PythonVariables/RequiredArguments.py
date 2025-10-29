# Required Arguments in Python

def calculate_rectangle_area(length, width):
    print("Area of Rectangle: ",length*width)

calculate_rectangle_area(10,20)
calculate_rectangle_area(10,2)

def student_details(sname,srank,sgrade):
    print("Student Name: ",sname)
    print("Student Rank: ", srank)
    print("Student Grade: ", sgrade)

student_details(sname = "Mahesh Babu", srank = 3, sgrade = "A+")
student_details(srank = 1,sname = "Ram charan",  sgrade = "B+")