package 쓰레드패키지;

import java.io.File;

public class 로그인쓰레드 implements Runnable {	//Runnable 인터페이스를 구현하도록 하는 방법 {

	public void 로그인쓰레드() {	// 로그인쓰레드 생성자
		
	}
	public void run() {		//run 매서드를 만들었다
		
		System.out.print("로그인 상태가 전환 됩니다 ");
		
		for(int i=0; i<5; i++ ) {	// 5번 반복한다
		
		System.out.print("▶");	// ▷를 출력한다
		 try {	
			 Thread.sleep(500);	// 1초 딜레이
			 
		 } catch(Exception e) {
			 
		 }	//catch문 종료
		
		 }	// for문 종료
		System.out.println(" 완료!");	// ▷를 출력한다
		
		
		
		}	// 'run'매서드 종료
	
	
}	// '로그인쓰레드' 클래스 종료
