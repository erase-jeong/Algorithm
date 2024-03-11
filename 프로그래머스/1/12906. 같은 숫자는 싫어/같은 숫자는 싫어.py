def solution(arr):
    answer = []

    for i in range(len(arr)):
        if i==len(arr)-1:
            answer.append(arr[i])
            pass
        elif arr[i]==arr[i+1]:
            pass
        else:
            answer.append(arr[i])
    return answer