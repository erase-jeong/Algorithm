T=int(input())
for test_case in range(1,T+1):
    s=list(input())

    for i in range(len(s)):
        if s[i]=='b':
            s[i]='d'
        elif s[i]=='d':
            s[i]='b'
        elif s[i]=='p':
            s[i]='q'
        else:
            s[i]='p'
        
    s.reverse()
    s=''.join(s)
    print("#%d %s"%(test_case,s))