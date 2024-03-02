def solution(s):
    return True if len(s) in (4,6) and s.isdigit() else False

'''
def solution(s):
    for i in s:
        if i=='0' or i=='1' or i=='2' or i=='3'or i=='4' or i=='5' or i=='6' or i=='7' or i=='8' or i=='9':
            continue
        else:
            return False
    return True
'''