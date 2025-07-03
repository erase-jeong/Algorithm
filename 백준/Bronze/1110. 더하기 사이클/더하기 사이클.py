n=int(input())
num=n
cnt=0

while True: #while 1과 동일
    a=num//10 #10의 자리 수
    b=num%10 # 1의 자리수
    c=(a+b)%10 #각 자리수를 더한값의 일의 자리
    num=(b*10)+c #새로운 num이 만들어진다.

    cnt=cnt+1 #사이클 수 +1
    #print(f'num : {num}, cnt:{cnt}')
    if(num==n):
        break

print(cnt)