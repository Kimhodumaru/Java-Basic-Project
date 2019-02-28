package autoCatalogProgram;

import java.io.File;
import java.io.IOException;


import 쓰레드패키지.접속화면쓰레드;

import 쓰레드패키지.로딩음악쓰레드;
import 쓰레드패키지.배경음악쓰레드;


public class 메인홈 {

	public static void main(String[] args) throws IOException { // 메인매서드
		 
		
		
		// 아스키아트로 접속화면 출력하는 스레드
		Runnable 메인화면쓰레드객체 = new 접속화면쓰레드();	// Runnable 인터페이스를 구현하는 클래스의 객체 생성하고, 로그인쓰레드 생성자를 실행한다
		Thread 메인화면 = new Thread(메인화면쓰레드객체);	  // 생성자 Thread(Runnable target)
		메인화면.start();	//  로그인대기 객체의 run매서드를 실행시킨다
		
		// 접속화면이 모두 출력되면 효과음이 나오는 스레드 // 이것을 실행하는 동안 다음 실행을 중지한다. 그 전에 실행된 것은 멀티쓰레로 동작한다
		File Clap =new File("C:\\Users\\Jaemin Kim\\Desktop\\test.wav");
		로딩음악쓰레드.PlaySound(Clap);
		
		
		/*
		// 배경음악 1번 재생
		배경음악쓰레드 test = new 배경음악쓰레드();
		try {
			test.배경음악재생매서드();
			Thread.sleep(1000); // 3초에 한번씩 재생하도록 설정
		} catch (Exception e) {

		} // catch 종료
		*/
		
		
		
		
		
		
		while(true) {	// 지정한 작업이 끝나면 메인 메뉴로 돌아올 수 있도록 while문을 사용
				
			
		로그인 사용자 = new 로그인(); // 로그인클래스의 객체 생성(user)
		사용자.로그인상태안내();  // 로그인상태 출력하여 안내
		
		
		
		메인메뉴 menu = new 메인메뉴();	// 메인메뉴 클래스의 객체 생성
		menu.서비스이용안내();	// 메인홈에서 이용안내문을 출력하는 매서드 실행
		menu.메인메뉴출력();	// 메인홈 메뉴를 출력하는 매서드 실행
		menu.메인메뉴선택();	// 메인홈에서 메뉴를 선택하는 매서드 실행		
		
		
		}	// while 종료
		
	}	// 메인매서드 종료

}	// 클래스 종료1
