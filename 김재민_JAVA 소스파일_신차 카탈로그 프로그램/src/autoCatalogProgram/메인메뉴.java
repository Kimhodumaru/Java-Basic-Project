package autoCatalogProgram;

import java.util.ArrayList;

import java.util.Scanner;

import 쓰레드패키지.견적내기효과음쓰레드;
import 쓰레드패키지.배경음악쓰레드;

public class 메인메뉴 {
	

	int 메뉴선택;
	
 	static String [] 견적임시저장;
 	static String [] 사용자견적1;
 	static String [] 사용자견적2;
 	static boolean 견적저장확인1 = false;
 	static boolean 견적저장확인2 = false;
 	
 	
	
	
	public void 서비스이용안내() {	// 메인 화면에서 서비스 이용 안내를 출력하는 메서드

		System.out.println("\n\n================== 서비스 이용 안내 ==================");
		System.out.println("");
		System.out.println("                            ▶ 로그인을 하시면 견적을 비교해 볼 수 있습니다 ◀");
		System.out.println("                         ▶ 견적은 최대 2개까지 저장하여 비교해 볼 수 있습니다 ◀");
		System.out.println("                         ▶ 견적지우기를 통해 새로운 견적을 저장 할 수 있습니다 ◀");
		System.out.println("");
		System.out.println("================================================\n\n");
	}
	
	
	
	
	public void 메인메뉴출력 () { 	// 로그인 여부에 따라 메뉴룰 출력해주는 메서드
		
		로그인 사용자 = new 로그인();
		
	
		
		if (사용자.로그인상태 == false) {
			System.out.println("┏────────────────────────메   뉴───────────────────────┓");
			System.out.println("┃           1.견적내기 2.견적비교 3.로그인  4.견적지우기                    ┃");
			System.out.println("┗───────────────────────────────────────────────────┛\n");
			
			
		} else {
			System.out.println("┏─────────────────────────메   뉴───────────────────────┓");
			System.out.println("┃           1.견적내기 2.견적비교 3.로그아웃 4.견적지우기                    ┃");
			System.out.println("┗────────────────────────────────────────────────────┛\n");
		
	}
	}
	public void 메인메뉴선택 () { // 메뉴를 선택하면 나타나는 피드백이다
		
		
		로그인 사용자 = new 로그인();	// 로그인 정보를 사용하기 위해 로그인클래스의 객체를 생성한다
				
		System.out.println("메뉴를 선택하세요 : "); // 메뉴를 선택할 수 있도록 안내멘트 제공
		Scanner sc = new Scanner(System.in); // 스캐너로 입력 값을 받는다
		메뉴선택 = sc.nextInt(); // 선택한 메뉴 값을 저장한다.

		if (사용자.로그인상태 == false) { // 로그아웃 상태일 때 메뉴를 보여준다
		
			
			switch (메뉴선택) {	// 어떤 메뉴를 선택했는지에 따라 다른 기능을 사용할 수 있다
			case 1:
					
				
				
				// 견적내기 효과음쓰레드
				견적내기효과음쓰레드 견적내기 = new 견적내기효과음쓰레드();
				try {
					견적내기.견적내기효과음매서드();
					Thread.sleep(1000); // 3초에 한번씩 재생하도록 설정
				} catch (Exception e) {

				} // catch 종료
				
				
				System.out.println("\n━━━━━━━━━━━━━견적 내기를 시작합니다━━━━━━━━━━━━━\n\n");
				견적내기 견적 = new 견적내기();
				견적.차량선택();
				
				
				// IG 2.4 모던
				if(견적.브랜드==1 && 견적.모델==1 && 견적.트림==1) {
				그랜저IG모던 IG모던 = new 그랜저IG모던();
				IG모던.그랜저IG모던스펙(); // 객체 특성 적용
				IG모던.자동차변수세팅();	// 필요한 변수를 초기화시켜준다
				IG모던.차량정보보여주기();
				IG모던.추가옵션선택하기();
				IG모던.선택차량전체내용출력();
				견적임시저장 = IG모던.선택차량저장();
				
				
				
				}
				
				// IG 3.0 프리미엄
				if(견적.브랜드==1 && 견적.모델==1 && 견적.트림==2) {
					그랜저IG프리미엄 IG프리미엄 = new 그랜저IG프리미엄();
					IG프리미엄.그랜저IG프리미엄스펙(); // 상속받은 클래스 객체에 스펙 적용
					IG프리미엄.자동차변수세팅();
					IG프리미엄.차량정보보여주기();
					IG프리미엄.추가옵션선택하기();
					IG프리미엄.선택차량전체내용출력();
					견적임시저장 =IG프리미엄.선택차량저장();	
					
				}
				
				// 싼타페 TM 모던
				if(견적.브랜드==1 && 견적.모델==2 && 견적.트림==1) {
				
					싼타페TM모던 TM모던 = new 싼타페TM모던();
					TM모던.싼타페TM모던스펙(); // 상속받은 클래스 객체에 스펙 적용
					TM모던.자동차변수세팅();
					TM모던.차량정보보여주기();
					TM모던.추가옵션선택하기();
					TM모던.선택차량전체내용출력();
					견적임시저장 =TM모던.선택차량저장();	
				}
				
				// 싼타페 TM 프레스트지
				if(견적.브랜드==1 && 견적.모델==2 && 견적.트림==2) {

					싼타페TM프레스티지 TM프레스티지 = new 싼타페TM프레스티지();
					TM프레스티지.싼타페TM프레스티지스펙(); // 상속받은 클래스 객체에 스펙 적용
					TM프레스티지.자동차변수세팅();
					TM프레스티지.차량정보보여주기();
					TM프레스티지.추가옵션선택하기();
					TM프레스티지.선택차량전체내용출력();
					견적임시저장 =TM프레스티지.선택차량저장();
				}
				
				// K5 럭셔리
				if(견적.브랜드==2 && 견적.모델==1 && 견적.트림==1) {
					
					K5럭셔리 럭셔리 = new K5럭셔리();
					럭셔리.K5럭셔리스펙(); // 상속받은 클래스 객체에 스펙 적용
					럭셔리.자동차변수세팅();
					럭셔리.차량정보보여주기();
					럭셔리.추가옵션선택하기();
					럭셔리.선택차량전체내용출력();
					견적임시저장 =럭셔리.선택차량저장();	
				}
				
				// K5 인텔리전트
				if(견적.브랜드==2 && 견적.모델==1 && 견적.트림==2) {
				
					K5인텔리전트 인텔리전트 = new K5인텔리전트();
					인텔리전트.K5인텔리전트스펙(); // 상속받은 클래스 객체에 스펙 적용
					인텔리전트.자동차변수세팅();
					인텔리전트.차량정보보여주기();
					인텔리전트.추가옵션선택하기();
					인텔리전트.선택차량전체내용출력();
					견적임시저장 =인텔리전트.선택차량저장();	
				}
				// 쏘렌토 모던
				if(견적.브랜드==2 && 견적.모델==2 && 견적.트림==1) {
				
					쏘렌토럭셔리 쏘럭셔리 = new 쏘렌토럭셔리();
					쏘럭셔리.쏘렌토럭셔리스펙(); // 상속받은 클래스 객체에 스펙 적용
					쏘럭셔리.자동차변수세팅();
					쏘럭셔리.차량정보보여주기();
					쏘럭셔리.추가옵션선택하기();
					쏘럭셔리.선택차량전체내용출력();
					견적임시저장 =쏘럭셔리.선택차량저장();
				}
				
				// 쏘렌토 마스터
				if(견적.브랜드==2 && 견적.모델==2 && 견적.트림==2) {

					쏘렌토마스터 쏘마스터 = new 쏘렌토마스터();
					쏘마스터.쏘렌토마스터스펙(); // 상속받은 클래스 객체에 스펙 적용
					쏘마스터.자동차변수세팅();
					쏘마스터.차량정보보여주기();
					쏘마스터.추가옵션선택하기();
					쏘마스터.선택차량전체내용출력();
					견적임시저장 =쏘마스터.선택차량저장();
				}
				
				if (견적저장확인1==false && 견적저장확인2==false) {
					사용자견적1=견적임시저장;
					}	
								
				if (견적저장확인1==true && 견적저장확인2==false) {
					사용자견적2=견적임시저장;
					견적저장확인2=true;
				}	
				
				견적저장확인1=true;
				
				break;
				
			
			case 2:
				
				System.out.println("\n━━━━━━━━━━━━━로그인 후에 이용가능합니다.━━━━━━━━━━━━\n\n");
				
				
				break;
				
			case 3:	
		
				사용자.로그인상태전환();
				if( 사용자.로그인상태 == false) {
					System.out.println("\n▷ 로그아웃 되었습니다 ◁\n");
				}
				if( 사용자.로그인상태 == true) {
					System.out.println("\n▷ 로그인 되었습니다 ◁\n");
				}
				break;
				
				
			case 4: 
				견적저장확인1=false;
				견적저장확인2=false;
				
				System.out.println("견적내용이 모두 삭제되었습니다");
	
			
			}	// 로그아웃 상태일 때, switch 종료

		} else { // 로그인 상태일 때 메뉴를 보여준다
			
			switch (메뉴선택) {
			case 1:
				
				
				// 견적내기 효과음쓰레드
				견적내기효과음쓰레드 견적내기 = new 견적내기효과음쓰레드();
				try {
					견적내기.견적내기효과음매서드();
					Thread.sleep(1000); // 3초에 한번씩 재생하도록 설정
				} catch (Exception e) {

				} // catch 종료
				
				
				System.out.println("\n━━━━━━━━━━━━━견적 내기를 시작합니다━━━━━━━━━━━━━\n\n");
				견적내기 견적 = new 견적내기();
				견적.차량선택();
				
				
				// IG 2.4 모던
				if(견적.브랜드==1 && 견적.모델==1 && 견적.트림==1) {
				그랜저IG모던 IG모던 = new 그랜저IG모던();
				IG모던.그랜저IG모던스펙(); // 객체 특성 적용
				IG모던.자동차변수세팅();	// 필요한 변수를 초기화시켜준다
				IG모던.차량정보보여주기();
				IG모던.추가옵션선택하기();
				IG모던.선택차량전체내용출력();
				견적임시저장 = IG모던.선택차량저장();
				
				
				
				}
				
				// IG 3.0 프리미엄
				if(견적.브랜드==1 && 견적.모델==1 && 견적.트림==2) {
					그랜저IG프리미엄 IG프리미엄 = new 그랜저IG프리미엄();
					IG프리미엄.그랜저IG프리미엄스펙(); // 상속받은 클래스 객체에 스펙 적용
					IG프리미엄.자동차변수세팅();
					IG프리미엄.차량정보보여주기();
					IG프리미엄.추가옵션선택하기();
					IG프리미엄.선택차량전체내용출력();
					견적임시저장 =IG프리미엄.선택차량저장();	
					
				}
				
				// 싼타페 TM 모던
				if(견적.브랜드==1 && 견적.모델==2 && 견적.트림==1) {
				
					싼타페TM모던 TM모던 = new 싼타페TM모던();
					TM모던.싼타페TM모던스펙(); // 상속받은 클래스 객체에 스펙 적용
					TM모던.자동차변수세팅();
					TM모던.차량정보보여주기();
					TM모던.추가옵션선택하기();
					TM모던.선택차량전체내용출력();
					견적임시저장 =TM모던.선택차량저장();	
				}
				
				// 싼타페 TM 프레스트지
				if(견적.브랜드==1 && 견적.모델==2 && 견적.트림==2) {

					싼타페TM프레스티지 TM프레스티지 = new 싼타페TM프레스티지();
					TM프레스티지.싼타페TM프레스티지스펙(); // 상속받은 클래스 객체에 스펙 적용
					TM프레스티지.자동차변수세팅();
					TM프레스티지.차량정보보여주기();
					TM프레스티지.추가옵션선택하기();
					TM프레스티지.선택차량전체내용출력();
					견적임시저장 =TM프레스티지.선택차량저장();
				}
				
				// K5 럭셔리
				if(견적.브랜드==2 && 견적.모델==1 && 견적.트림==1) {
					
					K5럭셔리 럭셔리 = new K5럭셔리();
					럭셔리.K5럭셔리스펙(); // 상속받은 클래스 객체에 스펙 적용
					럭셔리.자동차변수세팅();
					럭셔리.차량정보보여주기();
					럭셔리.추가옵션선택하기();
					럭셔리.선택차량전체내용출력();
					견적임시저장 =럭셔리.선택차량저장();	
				}
				
				// K5 인텔리전트
				if(견적.브랜드==2 && 견적.모델==1 && 견적.트림==2) {
				
					K5인텔리전트 인텔리전트 = new K5인텔리전트();
					인텔리전트.K5인텔리전트스펙(); // 상속받은 클래스 객체에 스펙 적용
					인텔리전트.자동차변수세팅();
					인텔리전트.차량정보보여주기();
					인텔리전트.추가옵션선택하기();
					인텔리전트.선택차량전체내용출력();
					견적임시저장 =인텔리전트.선택차량저장();	
				}
				// 쏘렌토 모던
				if(견적.브랜드==2 && 견적.모델==2 && 견적.트림==1) {
				
					쏘렌토럭셔리 쏘럭셔리 = new 쏘렌토럭셔리();
					쏘럭셔리.쏘렌토럭셔리스펙(); // 상속받은 클래스 객체에 스펙 적용
					쏘럭셔리.자동차변수세팅();
					쏘럭셔리.차량정보보여주기();
					쏘럭셔리.추가옵션선택하기();
					쏘럭셔리.선택차량전체내용출력();
					견적임시저장 =쏘럭셔리.선택차량저장();
				}
				
				// 쏘렌토 마스터
				if(견적.브랜드==2 && 견적.모델==2 && 견적.트림==2) {

					쏘렌토마스터 쏘마스터 = new 쏘렌토마스터();
					쏘마스터.쏘렌토마스터스펙(); // 상속받은 클래스 객체에 스펙 적용
					쏘마스터.자동차변수세팅();
					쏘마스터.차량정보보여주기();
					쏘마스터.추가옵션선택하기();
					쏘마스터.선택차량전체내용출력();
					견적임시저장 =쏘마스터.선택차량저장();
				}
				
				
				
				
				
				
				if (견적저장확인1==false && 견적저장확인2==false) {
					사용자견적1=견적임시저장;
					}	
								
				if (견적저장확인1==true && 견적저장확인2==false) {
					사용자견적2=견적임시저장;
					견적저장확인2=true;
				}	
				
				견적저장확인1=true;
				
				break;
				
			
			case 2:
				
				System.out.println("\n━━━━━━━━━━━━━견적 비교를 시작합니다━━━━━━━━━━━━━\n\n");
				
				
				if (견적저장확인1==true &&견적저장확인2==false ) {
					System.out.println("견적명 : "+자동차.견적저장이름1+"\n");
					for(int d=0; d<사용자견적1.length; d++) {
						System.out.println(사용자견적1[d]);
					}
					
				}	// 	견적저장확인1 if문 종료
				
			if (견적저장확인1==true && 견적저장확인2==true) {
				System.out.println("견적명 : "+자동차.견적저장이름1+"\n");			
				for(int d=0; d<사용자견적1.length; d++) {
					System.out.println(사용자견적1[d]);
				}
				
				System.out.println("\n\n\n\n 두 개의 견적을 비교해보세요. \n\n\n");
				
				System.out.println("견적명 : "+자동차.견적저장이름2+"\n");	
				for(int b=0; b<사용자견적2.length; b++) {
								System.out.println(사용자견적2[b]);
								}
					
					
					}	// 견적저장확인2 if문 종료
				
				
				
				
				if (견적저장확인1==false && 견적저장확인2==false) {
					System.out.println("저장 된 견적이 없습니다.");
				}

			break;
				
			case 3:	
		
				사용자.로그인상태전환();
				if( 사용자.로그인상태 == false) {
					System.out.println("\n\n▷ 로그아웃 되었습니다 ◁\n\n");
				}
				if( 사용자.로그인상태 == true) {
					System.out.println("\n\n▷ 로그인 되었습니다 ◁\n\n");
				}
				break;
			
			case 4: 
				자동차.선택차량저장순서=1;
				견적저장확인1=false;
				견적저장확인2=false;
				
				System.out.println("견적내용 모두 삭제되었습니다");
				
				break;
		
			
			}	//메뉴선택 switch 종료

		}

		
	}	//mainMenuChoice 매서드 종료
		
	}	// MainMenu 클래스 종료

	
	
	