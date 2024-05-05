home_to_school=int(input())
school_to_pc=int(input())
pc_to_ac=int(input())
ac_to_home=int(input())

hap=home_to_school+school_to_pc+pc_to_ac+ac_to_home

min=hap//60
sec=hap%60

print(min)
print(sec)