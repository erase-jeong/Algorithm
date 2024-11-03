T=int(input())
for tc in range(1,T+1):
    str1=list(input())

    if(str1.count('o')>=8 or str1.count('x')<=7):
        print(f'#{tc} YES')
    else:
        print(f'#{tc} NO')