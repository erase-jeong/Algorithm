import java.io.EOFException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();

        //String[] weeks={'SUN','MON','TUE','WED','TUE','FRI','SAT'};

        int m[]={31,28,31,30,31,30,31,31,30,31,30,31};

        String[] weeks={"SUN","MON","TUE","WED","THU","FRI","SAT"};

        if(x==1){
            System.out.println(weeks[y%7]);
        }
        else{
            int day_index=y;
            for(int i=0;i<x-1;i++){
                day_index+=m[i];
            }
            System.out.println(weeks[day_index%7]);
        }

    }
}