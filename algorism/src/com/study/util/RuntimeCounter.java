package com.study.util;
/**
 * 타임체크를 하기위한 클래스
 * @author netcomo
 */
public class RuntimeCounter {
	long start ;
	long end ;
	/**
	 * 타임 체크 스타트
	 * @version 0.1
	 * @see <pre>
	 * 2018.06.27 kim jinho
	 */
	public void runStart(){
		start = System.currentTimeMillis();
	}
	/**
	 * 타임 체크 결과 출력
	 * @version 0.1
	 * @see <pre>
	 * 2018.06.27 kim jinho
	 */
	public void runend(){
		end = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
}
