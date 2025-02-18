import sys
from collections import Counter

input=sys.stdin.readline

n=int(input())
arr1=list(map(int,input().split()))
m=int(input())
arr2=list(map(int,input().split()))

count_dict=Counter(arr1)

for m_num in arr2:
    print(count_dict.get(m_num,0),end=" ")