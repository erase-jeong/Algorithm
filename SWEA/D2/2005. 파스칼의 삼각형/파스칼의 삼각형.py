T=int(input())
for tc in range(1,T+1):
    N=int(input())

    ps=[[] for _ in range(N)]

    print(f'#{tc}')
    for i in range(N):
        for j in range(i+1):
            if(j==0 or j==i):
                ps[i].append(1)
            else:
                ps[i].append(ps[i-1][j-1]+ps[i-1][j])

        print(" ".join(map(str,ps[i])))