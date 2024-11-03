T=int(input())
for tc in range(1,T+1):
    N,K=map(int,input().split())
    N_scores=list(map(int,input().split()))
    N_scores.sort(reverse=True)
    sum_value=0
    for i in range(K):
        sum_value+=N_scores[i]
    print(f'#{tc} {sum_value}')