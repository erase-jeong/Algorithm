x,y=map(int,input().split())
m={
            1:31,
            2:28,
            3:31,
            4:30,
            5:31,
            6:30,
            7:31,
            8:31,
            9:30,
            10:31,
            11:30,
            12:31
            }

days=['SUN','MON','TUE','WED','THU','FRI','SAT']




if(x==1):
    print(days[y%7])
else:
    day_index=y
    for i in range(1,x):
        day_index+=m[i]
    print(days[day_index%7])
