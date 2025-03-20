def dfs(numbers, target, index, current_sum):
    if index == len(numbers):  # 모든 숫자를 사용한 경우
        return 1 if current_sum == target else 0  # 타겟 넘버 달성 여부 체크
    
    # 현재 숫자를 더하는 경우와 빼는 경우를 모두 탐색 (재귀)
    return (dfs(numbers, target, index + 1, current_sum + numbers[index]) +
            dfs(numbers, target, index + 1, current_sum - numbers[index]))

def solution(numbers, target):
    return dfs(numbers, target, 0, 0)

