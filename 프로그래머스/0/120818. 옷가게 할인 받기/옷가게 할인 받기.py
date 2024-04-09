def solution(price):
    if price>=500000:
        return int(price*0.8)
    
    elif price>=300000:
        return int(price*0.9)
    
    elif price>=100000:
        return int(price*0.95)
    else: #10만원 미만일 떄 (즉, 할인을 받지 않을 때)
        return price