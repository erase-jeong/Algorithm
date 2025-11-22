import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<N+1;tc++) {
			int num=Integer.parseInt(br.readLine());
			int result=0;
			
			for(int i=1;i<num+1;i++) {
				if(i%2==0) result-=i;
				else result+=i;
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}
