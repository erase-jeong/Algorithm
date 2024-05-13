def solution(my_string):
    str=''
    for i in range(len(my_string)):
        if my_string[i].islower():
            #print("소문자입니다")
            #my_string[i]=my_string[i].upper()
            str+=my_string[i].upper()
        else:
            #print("대문자입니다.")
            #my_string[i]=my_string[i].lower()
            str+=my_string[i].lower()
    
    return str