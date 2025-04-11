def solution(phone_book):
    phone_map={}
    
    #1. 전화번호들을 딕셔너리에 저장
    for i in range(len(phone_book)):
        phone_map[phone_book[i]]=i
    
    #2. 각 전화번호의 접두어가 딕셔너리에 존재하는지 확인
    for i in range(len(phone_book)):
        number=phone_book[i]
        for j in range(1,len(number)): #j=1부터 시작해야 접두어가 의미 있음
            prefix=number[:j]
            if prefix in phone_map:
                return False
    
    return True