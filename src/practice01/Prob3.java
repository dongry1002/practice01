package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("숫자입력 >");
		int a=scanner.nextInt();
		
		boolean check=true;
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=a;i++){
		
			if(i%2==0){
				
				sum1+=i;
				check=true;
			}
			
			
			else{
				
				sum2+=i;
				check=false;
			}
		
		}
		if(check){
		System.out.println("결과값"+sum1);
		}
		else{System.out.println("결과값"+sum2);
		}
		
		
		
	}

}
