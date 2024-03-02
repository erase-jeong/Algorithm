def solution(s):
    if (len(s)%2)==0: #글자 길이가 짝수라면
        return s[len(s)//2-1:len(s)//2+1]
    
    else: #글자 길이가 홀수라면
        return s[len(s)//2]
        
    answer = ''
    return answer