def solution(A,B):
    A.sort()
    B.sort(reverse=True)
    #B.sort()
    #B=B[::-1]
    print(f'A : {A}')
    print(f'B : {B}')
    
    for i in range(len(A)):
        A[i]=A[i]*B[i]
    
    answer = 0
    for i in A:
        print(i)
        answer+=i


    return answer

