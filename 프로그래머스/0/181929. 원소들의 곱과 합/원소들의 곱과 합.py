def solution(num_list):
    mul=1
    square_sum=0
    
    for i in num_list:
        mul*=i
        square_sum+=i
        
    if mul<square_sum*square_sum: return 1    
    else:  return 0
