package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		
		
		//String Method Test
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine(); //c와 달리 null 문자가 없다
		
//		System.out.println(s.length());
		int S= s.length();
		for(int i=0; i<S;i++){
			
			for(int j=0; j<=i ; j++){
			 System.out.print(s.charAt(j));
			}
			System.out.println();
		}

	}
}
