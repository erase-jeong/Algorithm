T=int(input())
for tc in range(1,T+1):
    input_number=input().strip() #숫자를 문자열로 입력받음

    #마지막 자릿수로 짝수/홀수 판단
    if input_number[-1] in '13579': #홀수이면
        print(f'#{tc} Odd')
    else: #짝수이면
        print(f'#{tc} Even')