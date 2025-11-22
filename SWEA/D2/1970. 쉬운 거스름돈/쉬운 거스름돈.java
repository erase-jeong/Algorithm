import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int tc=1;tc<=t;tc++) {
			int num=Integer.parseInt(br.readLine());
			int[] moneys= {50000,10000,5000,1000,500,100,50,10};
			int[] result=new int[8];
			
			for(int i=0;i<8;i++) {
				result[i]=num/moneys[i];
				num%=moneys[i];
			}
			
			System.out.println("#"+tc);
			for(int i=0;i<8;i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();

		}
	}
}