def solution(phone_number):
    answer = ''
    tmp=len(phone_number)-4
    for i in range(tmp):
        answer+='*'
    for i in range(tmp,len(phone_number)):
        answer+=phone_number[i]
    return answer