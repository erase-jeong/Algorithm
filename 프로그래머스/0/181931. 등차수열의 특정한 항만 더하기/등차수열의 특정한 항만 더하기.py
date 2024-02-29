def solution(a, d, included):
    answer=0
    
    #seque=a+(n-1)*d
    #seque=nd+a-d
    k=1
    for i in included:
        if i==1:
            answer+=k*d+a-d
        k+=1

    return answer