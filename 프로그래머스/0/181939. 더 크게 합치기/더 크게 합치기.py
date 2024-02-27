def solution(a, b):
    a_b=int(str(a)+str(b))
    b_a=int(str(b)+str(a))
    return max(a_b, b_a)