N=int(input())  #통화의 개수 N
callList=list(map(int,input().split()))

ySum=0
mSum=0
for i in range(N):
    #영식 요금제
    if callList[i]<30:
        ySum+=10
    else:
        ySum+=10+(callList[i]//30)*10

    #민식 요금제
    if callList[i]<60:
        mSum+=15
    else:
        mSum+=15+(callList[i]//60)*15


if ySum>mSum:
    print(f"M {mSum}")
elif ySum==mSum:
    print(f"Y M {ySum}")
else:
    print(f"Y {ySum}")


