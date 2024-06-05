def solution(x1, x2, x3, x4):
    if x1==False and x2==False:
        s1=False
    else:
        s1=True
    
    if x3==False and x4==False:
        s2=False
    else:
        s2=True
    
    
    if s1==True and s2==True:
        result=True
    else:
        result=False
        
    return result