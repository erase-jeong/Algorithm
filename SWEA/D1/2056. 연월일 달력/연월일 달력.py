T=int(input())

month_end=[-1,31,28,31,30,31,30,31,31,30,31,30,31]

for i in range(1,T+1):
    date=input()
    year=date[0:4]
    month=date[4:6]
    day=date[6:8]

    # 날짜가 유효한 경우
    if len(date)==8 and int(month)<=12 and int(day)<=month_end[int(month)] :
        print(f"#{i} {year}/{month}/{day}")

    # 날짜가 유효하지 않은 경우
    else:
        print(f"#{i} -1")