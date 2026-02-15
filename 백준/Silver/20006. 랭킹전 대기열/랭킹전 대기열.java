import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int p=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        ArrayList<Room> rooms=new ArrayList<>();  //전체 방 목록

        for(int i=0;i<p;i++){
            //입력
            st=new StringTokenizer(br.readLine());
            int level=Integer.parseInt(st.nextToken());
            String nick=st.nextToken();

            boolean entered=false; //방에 들어갔는지 체크

            //(1)이미 있는 방들을 순서대로 확인  --> 반복문 도는거여서 시간복잡도 확인하기
            for(Room r : rooms){
                //들어갈 수 있는 방을 찾으면?
                if(r.canEnter(m,level)){
                    r.players.add(new Player(level,nick)); //입장
                    entered=true;
                    break; //들어갔으니 더 이상 다른 방 볼 필요 없음
                }
            }

            //(2)들어갈 방이 없었다면? -> 새 방 생성
            if(!entered){
                rooms.add(new Room(level, nick));
            }
        }


        //출력
        for(Room room : rooms){
            //1. 방 상태 확인
            //방의 인원수(room.players.size())가 정원(m)과 같으면 시작
            if(room.players.size()==m){
                System.out.println("Started!");
            }else{
                System.out.println("Waiting!");
            }

            //2. 플레이어 정렬 (중요!)
            //아까 Player 클래스에 compareTo를 만들어뒀기 때문에 이게 작동함.
            Collections.sort(room.players);

            //3. 플레이어 목록 출력
            for(Player pp:room.players){
                System.out.println(pp.level+" "+pp.nick);
            }
        }
    }

    static class Player implements Comparable<Player>{
        int level;
        String nick;

        public Player(int level, String nick){
            this.level=level;
            this.nick=nick;
        }

        //나중에 닉네임 순으로 정렬해야 하므로 미리
        @Override
        public int compareTo(Player o){
            return this.nick.compareTo(o.nick);
        }
    }

    static class Room{
        int baseLevel;
        ArrayList<Player> players=new ArrayList<>(); //방에 들어온 사람들 목록

        //생성자 : 방을 만들 때는 '첫 번째 사람' 이 무조건 필요하겠죠?
        public Room(int level, String nick){
            this.baseLevel=level; //기준 레벨 설정
            this.players.add(new Player(level,nick));
        }

        //이 방에 새로운 사람이 들어올 수 있는지 체크하는 기능
        //m : 방 정원, userLevel : 들어올 사람 레벨
        public boolean canEnter(int m, int userLevel){
            //1) 정원이 찼으면 불가
            if(players.size()>=m) return false;

            //2) 레벨 제한 (-10 ~ +10)
            if(userLevel>=baseLevel-10 && userLevel<=baseLevel+10){
                return true;
            }
            return false;
        }
    }
}