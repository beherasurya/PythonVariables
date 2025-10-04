#Init Function in Python

class StudentDetails:

    def __init__(self,sname,ssub,sgrade):
        self.sname = sname
        self.ssub = ssub
        self.sgrade = sgrade

    def student_info(self):
        print("Student Name: ",self.sname)
        print("Student Subject: ", self.ssub)
        print("Student Grade: ", self.sgrade)

#Creating 3 objects of StudentDetails Class in Python
student1 = StudentDetails("Rakesh Yadav","Physics","A+")
student2 = StudentDetails("Mahesh Babu","Sports","B")
student3 = StudentDetails("David Malan","Arts","C")

student1.student_info()
student2.student_info()
student3.student_info()
