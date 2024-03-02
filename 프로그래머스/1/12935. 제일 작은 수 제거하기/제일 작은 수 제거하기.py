def solution(arr):
    arr.pop(arr.index(min(arr)))
    return arr if not arr==[] else [-1]
    