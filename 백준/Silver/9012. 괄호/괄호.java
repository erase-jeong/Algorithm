import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        /*
        for(int i=0;i<n;i++){
            String word=sc.nextLine();
            //System.out.println(word);
        }
         */

        for(int k=0;k<n;k++){
            String word=sc.nextLine();
            Stack<Character> st=new Stack<>();

            st.push(word.charAt(0));

            //System.out.println("st : "+st);

            for(int i=1;i<word.length();i++){

                if(word.charAt(i)==')'){

                    if(!st.isEmpty()){
                        if(st.peek()=='('){
                            st.pop();
                        }else{
                            st.push(word.charAt(i));
                        }
                    }
                    else{
                        st.push(word.charAt(i));
                    }

                }else{
                    st.push(word.charAt(i));
                }


                //System.out.println(st);

            }

            if(st.isEmpty()==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }

        
    }
}