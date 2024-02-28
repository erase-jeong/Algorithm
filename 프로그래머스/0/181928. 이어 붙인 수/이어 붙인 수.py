def solution(num_list):
    odd=''
    even=''
    for i in range(len(num_list)):
        if num_list[i]%2==1:
            odd+=str(num_list[i])
        else:
            even+=str(num_list[i])
            
    answer = 0
    answer=int(odd)+int(even)
    return answer