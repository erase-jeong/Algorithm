n = list(map(int, input()))

num_check = [0]*10

for i in n:
    if i == 6 or i == 9:
        num_check[6] += 1  # 6과 9를 모두 6에 더함
    else:
        num_check[i] += 1

# 6과 9의 합계를 반으로 나누고, 올림 처리
num_check[6] = (num_check[6] + 1) // 2

# 가장 많이 필요한 숫자의 개수 = 필요한 세트 수
print(max(num_check))