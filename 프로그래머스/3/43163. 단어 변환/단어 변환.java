import java.util.*;

class Solution {
    static boolean useWord[];
    static int n;
    static List<Integer> lst=new ArrayList<>();
    
    public int solution(String begin, String target, String[] words) {
        useWord=new boolean[words.length];
        n=begin.length();  
        dfs(0,begin,target,words);
        
        if(lst.isEmpty()) return 0;
        
        Collections.sort(lst);
        return lst.get(0);

    }
    
    public static void dfs(int depth,String now, String target, String[] words){
        if(now.equals(target)){
            lst.add(depth);
            return; //목표 도달
        } 
        
        for(int i=0;i<words.length;i++){
            if(!useWord[i] && diffOne(now,words[i])){
                useWord[i]=true;
                dfs(depth+1,words[i],target,words);
                useWord[i]=false;
            }
        }
        
        //return; //못 찾았으면 -1 반환
    }
    
    public static boolean diffOne(String one, String two){
        //단어의 길이만큼 순회
        //하나 다른 경우 찾아내기
        int same=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(one.charAt(i)==two.charAt(i)) same++;
        }
        
        if(same==n-1) return true;
        else return false;
    }
}

