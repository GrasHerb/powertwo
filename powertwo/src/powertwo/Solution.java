package powertwo;

import java.util.Scanner;

public class Solution {
	public static Scanner Input = new Scanner( System.in );
	

	public static void main(String[] args) {	
		int result = 2; int n = Input.nextInt();;
		for (int i = n; i>0;i--) {
			result=result*2;
		}
		System.out.println("2^"+n+"="+result);
	}

}
