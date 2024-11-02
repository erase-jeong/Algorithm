T=int(input())
days=['SUN','MON','TUE','WED','THU','FRI','SAT']
for tc in range(1,T+1):
    day=input()
    print(f'#{tc} {7-days.index(day)}')