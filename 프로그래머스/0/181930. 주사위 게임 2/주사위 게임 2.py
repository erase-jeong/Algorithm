def solution(a, b, c):
    sq1=0
    sq2=0
    sq3=0
    
    sq1=a+b+c
    sq2=a*a+b*b+c*c
    sq3=a*a*a+b*b*b+c*c*c
    
    if a==b==c:
        return sq1*sq2*sq3
    
    elif a!=b and b!=c and c!=a:
        return sq1

    else:
        return sq1*sq2