import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.nextLine();
        int cnt=0;
        String word="";

        for(int i=0;i<str1.length();i++){
            word+=str1.charAt(i);
            cnt+=1;
            //word+=str1[i];

            if(cnt==10){
                System.out.println(word);
                cnt=0;
                word="";
            }
            else if(i==str1.length()-1){
                System.out.println(word);
            }
        }



    }
}

