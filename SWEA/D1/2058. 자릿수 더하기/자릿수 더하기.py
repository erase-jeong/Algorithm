N=int(input())
#최대 네자리
#각 자리수 나누면서...

il=N%10
sib=((N%1000)%100)//10
bak=(N%1000)//100
chan=N//1000

print(il+sib+bak+chan)