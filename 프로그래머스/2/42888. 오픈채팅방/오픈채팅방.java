import java.util.*; 

class Solution {
    public String[] solution(String[] record) {
        //String[] answer = {};
        HashMap<String,String> map=new HashMap<>(); //userId, name 조합
        List<String> lst=new ArrayList<>();
        
        for(int i=0;i<record.length;i++){
            String[] arr=record[i].split(" ");
            if(arr[0].equals("Enter")){
                map.put(arr[1],arr[2]);
            }else if(arr[0].equals("Change")){
                map.put(arr[1],arr[2]);
            }
        }
     
        //이렇게 하면 최종 name상태가 된다.
        //System.out.println("map : "+map);
        
        for(int i=0;i<record.length;i++){
            String[] arr=record[i].split(" ");
            String name=map.get(arr[1]);
            if(arr[0].equals("Enter")){
                lst.add(name+"님이 들어왔습니다.");
            }else if(arr[0].equals("Leave")){
                lst.add(name+"님이 나갔습니다.");
            }
        }
        
        //리스트를 배열로 변환
        String[] answer=new String[lst.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=lst.get(i);
        }
      
        return answer;
    }
}

/*
[닉네임 변경 방법]
- 채팅방을 나간 후, 새로운 닉네임으로 다시 들어간다.
- 채팅방에서 닉네임을 변경한다.

- 스트링 문자열 처리

Enter이나 Leave가 들어오면 => 결과를 출력해야한다.
Change가 들어오면 => 결과를 출력하지는 않는다. 

결국 중심은 uid1234 가운데 애가 메인이다.
1^5 => O(N^2)은 절대 불가
nlogn 이나 logN으로 끝내야 한다

- 채팅방을 나간 후 , 새로운 닉네임으로 다시 들어간다.
- 채팅방에서 닉네임을 변경한다. 

둘 중 어떤 케이스인지를 먼저 파악하고, 그 다음에 해야한다.


*/
