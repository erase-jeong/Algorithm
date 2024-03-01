def solution(arr, k):
    if k%2==0:
        for i,ch in enumerate(arr):
            arr[i]=ch+k
    else:
        for i,ch in enumerate(arr):
            arr[i]=ch*k
    return arr