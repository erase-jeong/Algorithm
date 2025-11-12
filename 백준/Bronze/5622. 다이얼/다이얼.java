import java.util.*;

public class Main {
    public static void main(String args[]){
        //문자열로 입력받기
        Scanner sc=new Scanner(System.in);
        //time 변수 만들기
        int time=0;

        //문자열 앞에서부터 순회하면서 각 변수마다 얼마나 걸리는지 확인하기
        String word=sc.nextLine();

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='A' || word.charAt(i)=='B' || word.charAt(i)=='C'){
                time+=3;
            } else if(word.charAt(i)=='D' || word.charAt(i)=='E' || word.charAt(i)=='F'){
                time+=4;
            }else if(word.charAt(i)=='G' || word.charAt(i)=='H' || word.charAt(i)=='I'){
                time+=5;
            }else if(word.charAt(i)=='J' || word.charAt(i)=='K' || word.charAt(i)=='L'){
                time+=6;
            }else if(word.charAt(i)=='M' || word.charAt(i)=='N' || word.charAt(i)=='O'){
                time+=7;
            }else if(word.charAt(i)=='P' || word.charAt(i)=='Q' || word.charAt(i)=='R'|| word.charAt(i)=='S'){
                time+=8;
            }else if(word.charAt(i)=='T' || word.charAt(i)=='U' || word.charAt(i)=='V'){
                time+=9;
            }else if(word.charAt(i)=='W' || word.charAt(i)=='X' || word.charAt(i)=='Y'|| word.charAt(i)=='Z'){
                time+=10;
            }
        }

        System.out.println(time);


    }
}