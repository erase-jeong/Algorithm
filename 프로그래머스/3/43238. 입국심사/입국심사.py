def solution(n,times):
    start=1
    end=max(times)*n
    
    answer=end
    
    while start<=end:
        mid=(start+end)//2
        
        people_count=sum(mid//time for time in times)
        
        if people_count>=n:
            answer=mid
            end=mid-1
        else:
            start=mid+1
            
    return answer