package com.study.algorithm;

public class Quest014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
양의 정수 n에 대하여, 다음과 같은 계산 과정을 반복하기로 합니다.

n → n / 2 (n이 짝수일 때)
n → 3 n + 1 (n이 홀수일 때)

13에 대하여 위의 규칙을 적용해보면 아래처럼 10번의 과정을 통해 1이 됩니다.

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
아직 증명은 되지 않았지만, 이런 과정을 거치면 어떤 수로 시작해도 마지막에는 1로 끝나리라 생각됩니다. 
(역주: 이것은 콜라츠 추측 Collatz Conjecture이라고 하며, 이런 수들을 우박수 hailstone sequence라 부르기도 합니다)

그러면, 백만(1,000,000) 이하의 수로 시작했을 때 1까지 도달하는데 가장 긴 과정을 거치는 숫자는 얼마입니까?

참고: 계산 과정 도중에는 숫자가 백만을 넘어가도 괜찮습니다.
*/
		long max = 0;
		long result = 0;
		
		for (long i = 2; i <= 1000000; i++) {
			
			long count = 1;
			long temp  = i;
			
			while (true) {
				
				if (i==1) {
					System.out.print(" i : " + temp + " ");
					System.out.println(result + " : " + max);
					break;
				}else if (i%2 ==0) {
					i = i/2;
					count++;
					
				}else {
					i = 3*i+1;
				}	
				
			}
			if (max < count) {
				max = count ; 
				result = temp ;
				
			}
			i = temp;
		}
		
		System.out.println(result + ":  :  :" + max);
		//837799:  :  :330

	}

}
