T=int(input())
for tc in range(1,T+1):
    A,B,C=map(int,input().split())

    bread1=min(A,B)
    bread2=max(A,B)

    cnt=C//bread1
    print(f'#{tc} {cnt}')