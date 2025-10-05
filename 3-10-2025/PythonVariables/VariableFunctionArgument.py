#Variable Function Argument in Python

def cloud_list(*cloudname):
    print("Cloud service Name: ",cloudname[0])
    print("Cloud service Name: ", cloudname[1])
    print("Cloud service Name: ", cloudname[2])

def cloud_technology_names(*clouds):
    print("Cloud Technologies are: ")
    for name in clouds:
        print(name)

cloud_list('AWS','GCP','Microsoft Azure')
cloud_technology_names('AWS','GCP','Microsoft Azure')

def student_details(**stu):
    print("Student Name: ",stu["name"])
    print("Student Section: ", stu["section"])

student_details(name = "Glen Maxwell", section = "A grade")