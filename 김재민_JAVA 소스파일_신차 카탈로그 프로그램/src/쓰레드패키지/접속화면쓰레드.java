package 쓰레드패키지;


public class 접속화면쓰레드 implements Runnable {	//Runnable 인터페이스를 구현하도록 하는 방법 {

	
	public void run() {		//run 매서드를 만들었다
		
		System.out.print("$$                                                                                                                  $$$$$$$$$$$\r\n" + 
				"$                                                                                                                      $$$$$$$$\r\n" + 
				"                                                                                                                         $$$$$$\r\n" + 
				"                                                                                                                          \"$$$$\r\n" + 
				"                                                                                                                            $$$\r\n" + 
				"                                                                                                                             $$\r\n" + 
				"                                                                                                                              $\r\n" + 
				"                           ,                          LLLLLL                                                                  $\r\n" + 
				"                           LLLLLLLLLLLLLLLLLLLLL      LLLLLL\r\n" + 
				"                           LLLLLLLLLLLLLLLLLLLL/      LLLLLL\r\n" + 
				"                                         LLLLLLLLLLLLLLLLLLL\r\n" + 
				"                                        LLLLLLLLLLLLLLLLLLLL\r\n" + 
				"                                       LLLLLL>        LLLLLL                                      /LLLLL/\r\n" + 
				"                                     /LLLLLLLLLLLLLLLLLLLLLL           LLLLLLLLLLLLLLLLLL         .LLLLL/\r\n" + 
				"                                   jLLLLLLLLLLLLLLLLLLLLLLLL           LLLLLLLLLLLLLLLLLL          LLLLL/\r\n" + 
				"                                .LLLLLLLLLLLLLLLLLLLLLLLLLLL           ///////////LLLLLLL          LLLLL/\r\n" + 
				"                             LLLLLLLLL>               LLLLLL                      LLLLLL           LLLLL/\r\n" + 
				"                           XLLLLLLL.                  LLLLLL                     LLLLLL-    LLLLLLLLLLLL/\r\n" + 
				"                              X                       LLLLLL                   LLLLLLL-     LLLLLLLLLLLL/\r\n" + 
				"                                                      LLLLLL                 LLLLLLLLLLL           LLLLL/\r\n" + 
				"                                                      LLLLLL              ,LLLLLLLLLLLLLLLu        LLLLL/\r\n" + 
				"                                                                       XLLLLLLLL{    LLLLLLLLL-    LLLLL/\r\n" + 
				"                                   ;LLLLLL                          LLLLLLLLL-          LLLLL,     LLLLL/\r\n" + 
				"                                    LLLLLL                            LLLL                         LLLLL/\r\n" + 
				"                                    LLLLLL                                                         LLLLLL\r\n" + 
				"                                    LLLLLL                                                         LLLLLL\r\n" + 
				"                                    LLLLLL                                      ;\r\n" + 
				"                                    LLLLLL^                                     LLLLLLLLLLLLLLLLLLLLLLLL/\r\n" + 
				"                                    LLLLLLLLLLLLLLLLLLLLLLLL                    LLLLLLLLLLLLLLLLLLLLLLLL/\r\n" + 
				"                                    LLLLLLLLLLLLLLLLLLLLLLLL                                       LLLLL/\r\n" + 
				"                                                                                                   LLLLL/\r\n" + 
				"                                                                                                   LLLLL/\r\n" + 
				"                       xxxxx,                                                                      LLLLL/\r\n" + 
				"                       xxxxx,                                                                      LLLLL/\r\n" + 
				"                       xxxxx,                                                                      LLLLL/\r\n" + 
				"                       xxxxx,\r\n" + 
				"                       xxxxx,\r\n" + 
				"                       xxxxx,                                         xxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                       xxxxx,                                         xxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                       xxxxx,                                         xxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                       xxxxxxxxxxxxxxxxxxxxxxxxxx,                    xxxxx\r\n" + 
				"                       xxxxxxxxxxxxxxxxxxxxxxxxxx,                    xxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                       xxxxxxxxxxxxxxxxxxxxxxxxxx,                    xxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                                  xxxxx                               xxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                                  xxxxx                               xxxxx\r\n" + 
				"                                  xxxxx                               xxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx               xxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx               xxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"\r\n" + 
				"                                                               xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                                                               xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                                                               xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n" + 
				"                                                                                                                              >\r\n" + 
				"                                                                                                                              $\r\n" + 
				"                                                                                                                             1$\r\n" + 
				"$                                                                                                                            $$\r\n" + 
				"$$                                                                                                                         \"$$$\r\n" + 
				"$$$                                                                                                                       $$$$$\r\n" + 
				"$$$$$                                                                                                                   }$$$$$$\r\n" + 
				"$$$$$$$                                                                                                               W$$$$$$$$\r\n" + 
				"$$$$$$$$$$                                                                                                         k$$$$$$$$$$$\r\n" + 
				"$$$$$$$$$$$$$$%                                                                                               \\$$$$$$$$$$$$$$$$ ");
		
		System.out.print("\n\n사이트에 접속 중입니다");
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
