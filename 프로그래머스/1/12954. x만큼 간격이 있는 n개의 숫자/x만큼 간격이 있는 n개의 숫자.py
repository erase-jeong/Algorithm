def solution(x, n):
    answer = []
    k=x
    for i in range(n):
        answer.append(k)
        k+=x
    return answer