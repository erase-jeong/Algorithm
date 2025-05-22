N=int(input())

#약수란? : 어떤 정수를 나누어 떨어지게 만드는 수
#즉, 어떤 수 A를 나눴을 때 나머지가 0이 되는 수 B가 있다면 B는 A의 약수이다.
for i in range(1,N+1):
    if N%i==0:print(i,end=" ")