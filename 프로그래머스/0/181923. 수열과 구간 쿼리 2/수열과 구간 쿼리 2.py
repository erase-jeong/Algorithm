def solution(arr, queries):
    answer=[]
    for s,e,k in queries:
        sample=[]
        for i in range(s,e+1):
            if arr[i]>k:
                sample.append(arr[i])
                              
        if sample:
            answer.append(min(sample))
        else:
            answer.append(-1)
    return answer