package autoCatalogProgram;

import 쓰레드패키지.로그인쓰레드;

public class 로그인 {
	 static boolean 로그인상태 ; // 현재 로그인/비로그인 여부
	 String 로그인아이디; // 로그인 아이디
	 int 로그인비밀번호; // 로그인 패스워드
	 String 이름= "재민" ;	// 회원 이름
	 String 전화번호 ;	// 전화번호

	 public void 로그인상태전환() {	// 현재 로그인 상태를 확인
		
		  	Runnable 로그인쓰레드인스턴스 = new 로그인쓰레드();	// Runnable 인터페이스를 구현하는 클래스의 객체 생성하고, 로그인쓰레드 생성자를 실행한다
			Thread 로그인대기 = new Thread(로그인쓰레드인스턴스);	  // 생성자 Thread(Runnable target)
			로그인대기.start();	//  로그인대기 객체의 run매서드를 실행시킨다
			
			
			try {	// 로그인대기 인스턴스의 run 매소드가 실행되는 동안 다른 매소드의 작동을 정지시키기 위해서 사용
				로그인대기.join();	// join매서드는 인스턴스의 스레드가 동작중일때 메인메서드의 실행을 정지시킨다
			}
			catch(InterruptedException e) {	// ()안에 해당하는 예외가 발생했을때 실행한다
				e.printStackTrace();
				
			}
		 
				로그인상태 = !로그인상태 ; 
		 
	 }	// loginStateCheck 매서드 종료 
	 
	 
	 
	public void 로그인상태안내() {	// 현재 로그인 상태를 출력해준다
					
		if (로그인상태 == false) { // 비로그인 상태일 때는 방문자님으로 호칭하기 위함
			System.out.println("\n");
			System.out.println("┏───────────────────────────────────────────────┓");
			System.out.println("┃        안녕하세요. 방문자님. 현재 로그아웃 상태 입니다.      ┃");
			System.out.println("┗───────────────────────────────────────────────┛");
		} else { // 로그인 상태일 때는, 고객의 이름을 불러주기 위함
			System.out.println("\n");
			System.out.println("┏───────────────────────────────────────────────┓");
			System.out.println("┃          안녕하세요. "+이름+"님. 현재 로그인 상태 입니다                 ┃");
			System.out.println("┗───────────────────────────────────────────────┛");
		}	// else 닫기

	}	//	'로그인상태안내' 매서드 닫기

}	// '로그인' 클래스 닫기

