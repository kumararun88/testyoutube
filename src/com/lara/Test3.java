package com.lara;

public class Test3 {
	
	
	public static void main(String[] args) {
		
		int number=121;
		
		int r;
		int reverse=0;
		
		while(number!=0)
		{
			r= number %10;
			
			reverse=reverse * 10 + r;
			
			number=number/10;
			
			
				
		
		System.out.println("reverse number is"+reverse);
		
		if(number==reverse)
		{
			System.out.println(" it is plaindrome");
		}else{
			System.out.println(" it is not plain drome");
		}
		
	}

}
}