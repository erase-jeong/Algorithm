import java.util.*;

class Solution {
    public int solution(String[] order) {
        int amount=0;
        for(int i=0;i<order.length;i++){
            if(order[i].equals("anything")) amount+=4500;
            else if(order[i].contains("americano")) amount+=4500;
            else if(order[i].contains("cafelatte")) amount+=5000;
        }
        return amount;
    }
}

/*
아메리카노 : 5000
카페라떼 : 4500
종류+메뉴 -> 종류 무시
메뉴 -> 메뉴고려
아무거나 -> 아메리카노
*/