def solution(n,lost,reserve):
    answer=0
    clo_cnt=[]
    for i in range(n+2):
        clo_cnt.append(1) #default 1
    
    clo_cnt[0]=-99 #0번 인덱스는 사용 x
    clo_cnt[n+1]=-99 #n+1번 인덱스 사용 x
    
    
    for i in range(1,n+1):
        if i in lost:
            clo_cnt[i]-=1
        if i in reserve:
            clo_cnt[i]+=1
    
    for i in range(n+1):
        if clo_cnt[i]==2:
            if clo_cnt[i-1]==0:
                clo_cnt[i-1]+=1
                clo_cnt[i]-=1
            elif clo_cnt[i+1]==0:
                clo_cnt[i+1]+=1
                clo_cnt[i]-=1

    numbers=[x for x in clo_cnt if x!=-99 and x!=0]
    
    return len(numbers)