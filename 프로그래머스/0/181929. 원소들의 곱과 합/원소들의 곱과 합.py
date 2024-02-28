def solution(num_list):
    mul=1
    square_sum=0
    
    for i in num_list:
        mul*=i
    
    for i in num_list:
        square_sum+=i
    
    square_sum=square_sum*square_sum
        
    if mul<square_sum:
        return 1    
    else:
        return 0
