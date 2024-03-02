def solution(n):
    arr=[]
    for x in range(1,n+1):
        if n%x==1:
            arr.append(x)
    return arr[0]