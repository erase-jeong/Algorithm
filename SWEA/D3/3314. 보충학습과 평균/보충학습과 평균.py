T=int(input())
for tc in range(1,T+1):
    scores=list(map(int,input().split()))
    sum_value=0
    for i in scores:
        if(i<40):
            i=40
        sum_value+=i

    print(f'#{tc} {sum_value//5}')