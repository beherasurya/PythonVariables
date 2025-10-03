# Decion Making in python by using if,elif and else

studentAge = int(input("Enter your Age"))

def votingEligible(age):
    if age>18:
        return "Student can Vote"
    elif  age < 18:
        return "Student cannot Vote"
    else:
        return "Student Can Vote as his age is 18"

eligibility = votingEligible(studentAge)
print(eligibility)