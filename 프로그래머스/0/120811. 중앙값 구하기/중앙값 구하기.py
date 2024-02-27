def solution(array):
    index=int((len(array)-1)/2)
    array.sort()
    
    return array[index]