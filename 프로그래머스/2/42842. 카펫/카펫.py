def solution(brown,yellow):
    s=brown+yellow
    #약수 구하기
    for i in range(1,s+1):
        if s%i==0:
            k=s//i
            if i>=k:
                #a.append([i,k])
                if (i-2)*(k-2)==yellow:
                    return([i,k])