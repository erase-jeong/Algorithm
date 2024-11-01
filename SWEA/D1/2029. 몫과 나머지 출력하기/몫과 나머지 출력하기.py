T=int(input())

for testcase in range(1,T+1):
    a,b=map(int,input().split())
    print(f'#{testcase} {a//b} {a%b}')