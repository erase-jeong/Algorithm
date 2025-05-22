T=int(input())
for i in range(1,T+1):
    P,Q,R,S,W=map(int,input().split())
    A,B=0,0

    A=W*P #A회사 : 1리터당 P원

    #B회사
    if W<=R:
        B=Q
    else:
        B=Q+(W-R)*S

    print(f"#{i} {min(A,B)}")