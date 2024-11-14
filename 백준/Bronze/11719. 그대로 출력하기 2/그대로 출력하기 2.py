import sys
input = sys.stdin.read  # 여러 줄의 입력을 EOF까지 한꺼번에 읽음

data = input().splitlines()  # 개행을 유지한 채 각 줄을 리스트로 받음
for line in data:
    print(line)  # 각 줄을 그대로 출력