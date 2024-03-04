def solution(s):
    #문자열을 정수로 변환
    numbers=s.split()
    numbers=[int(num) for num in numbers]
    maxV=max(numbers)
    minV=min(numbers)
    ss=''
    ss+=str(minV)
    ss+=' '
    ss+=str(maxV)
    
    return ss