# Default Argument in Python

def student_details(sname,srank = 89,scollege = "Harvard University"):
    print("Student Name: ",sname)
    print("Student Rank: ", srank)
    print("Student College: ", scollege)

student_details(sname = "Allu Arjun", srank = 3, scollege = "Cambridge University")
student_details(sname = "Mahesh Babu")