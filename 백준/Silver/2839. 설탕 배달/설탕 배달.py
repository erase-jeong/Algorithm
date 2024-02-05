sugar=int(input())

count=0

while sugar>=0:
    if sugar%5==0: #5의 배수이면
        count+=(sugar//5)  #5로 나눈 몫을 구함
        print(count)
        break

    sugar-=3
    count+=1

else:
    print(-1)