import math

L=int(input())
A=int(input()) #국어 풀어야 하는 양
B=int(input()) #수학 풀어야 하는 양
C=int(input()) # 국어 MAX
D=int(input()) # 수학 MAX

print(L-max(math.ceil(A/C),math.ceil(B/D)))
