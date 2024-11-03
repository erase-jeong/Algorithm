T=int(input())
for tc in range(1,T+1):
    input_str=set(input())
    if(len(input_str)==2):
        print(f'#{tc} Yes')
    else:
        print(f'#{tc} No')

