T=10

for testcase in range(1,T+1):
    testNo=int(input())
    search=input()
    str=input()


    ans=str.count(search)

    print(f'#{testNo} {ans}')