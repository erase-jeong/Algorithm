def solution(num_list):
    count=0
    for a in num_list:
        while 1:
            if a==1:
                break
            
            if a%2==0:
                a=a//2
                count+=1
            
            else:
                a=(a-1)//2
                count+=1
                
    return count