package com.study.algorithm;

public class Quest004_backup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
		예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.

		600851475143의 소인수 중에서 가장 큰 수를 구하세요.

*/	
		long num = 600851475143L ; 
		
		long count = 2;
		
		long temp = 1;
		
		long result = 0;
		
		String result2 = "";	
		
		
		while (count<600851475143L)
		{
			//System.out.print("계산중 " + count + "\n");
			if(num%count == 0)
			{
				boolean check = true;
				
				for(long i =2; i< count/2+1;  i++)
				{
					if(count%i == 0)
					{
						check = false;
						break;
					}
						
					//System.out.print("\n검색중 " + count + " :" + i   );
					
				}
				
				if(check)
				{
					temp = count;
					result2 += count + " , ";
					System.out.print("\n\n 검색중 가장 큰 소수는 : " + temp);
					count = 2;
					
				}
					
			}
			count = count +2;
//			System.out.print("\n\n 검색중인수는 : " + count);
			
		}
		
		result = temp;
		
		System.out.print("\n\n가장큰 소수는 : " + result);
		
		
		
		
	}
}
