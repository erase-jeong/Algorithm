def solution(myString, pat):
    myString = myString.replace("A","C")
    myString = myString.replace("B","D")
    myString = myString.replace("C","B")
    myString = myString.replace("D","A")

    return 1 if pat in myString else 0
