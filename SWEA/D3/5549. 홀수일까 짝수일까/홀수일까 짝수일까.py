T=int(input())
for tc in range(1,T+1):
    input_integer=int(input())
    if(input_integer%2==1):
        print(f'#{tc} Odd')
    else:
        print(f'#{tc} Even')