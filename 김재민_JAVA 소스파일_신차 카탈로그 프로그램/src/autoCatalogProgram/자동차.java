package autoCatalogProgram;

import java.util.Scanner; // 스캐너 클래스 불러오기

import 쓰레드패키지.배경음악쓰레드;
import 쓰레드패키지.저장불가효과음;

public class 자동차 {

	// 가격 변수
	int 기본가격; // 기본가격
	int 추가옵션포함가격; // 최종가격
	boolean 옵션선택중;

	// 선택내용 저장용 배열
	static String[] 선택차량내용저장1; // 선택차량을 저장
	static String[] 선택차량내용저장2; // 선택차량을 저장

	static int 선택차량저장순서=1;

	// 자동차의 구성요소
	String 브랜드; // 브랜드
	String 모델; // 모델
	String 등급; // 등급
	String 엔진종류; // 엔진종류
	String 최대출력; // 최대출력
	String 최대토크; // 최대토크
	String 미션; // 변속기
	String 타이어; // 타이어
	String 차체중량; // 차체중량
	String 연비; // 연비
	String 승차인원; // 승차인원
	String 에어백; // 에어백
	String 크루즈컨트롤; // 크루즈컨트롤
	String 차세제어장치; // 차세제어장치
	String LED램프; // LED램프
	String 주간주행등; // 주간주행등
	String 머플러; // 머플러
	String 스티어링휠; // 스티어링휠
	String 기어노브; // 기어노브
	String 계기판; // 계기판
	String 앞좌석전동시트; // 앞좌석 전동시트
	String 앞좌석열선시트; // 앞좌석 열선시트
	String 앞좌석통풍시트; // 앞좌석 통풍시트
	String 풀오토에어컨; // 풀오토 에어컨
	String 스마트키; // 스마트키
	String ECM룸미러; // ECM룸미러
	String 네비게이션; // 네비게이션
	String 블루투스; // 블루투스

	// 추가옵션 관련 변수
	String 추가옵션1; // 추가선택옵션1
	int 추가옵션1가격; // 추가선택옵션1의 가격
	String 추가옵션2; // 추가선택옵션1
	int 추가옵션2가격; // 추가선택옵션1의 가격
	String 추가옵션3; // 추가선택옵션1
	int 추가옵션3가격; // 추가선택옵션1의 가격

	int 입력받은추가옵션;
	String 선택한추가옵션1;
	String 선택한추가옵션2;
	String 선택한추가옵션3;

	// 저장 관련 변수
	int 저장여부선택;
	static String 견적저장이름1;
	static String 견적저장이름2;


	public void 자동차변수세팅() { // 생성자
		저장여부선택 = 1; // 저장여부는 '1번 저장하기'를 기본 값으로 설정
		
		
		선택한추가옵션1 = (""); // 선택한 추가옵션이 없는 것을 기본값으로 설정
		선택한추가옵션2 = ("");
		선택한추가옵션3 = ("");

		옵션선택중 = true; // 별도로 선택종료를 선택하기 전에는 true를 기본값으로 설정

	}
	
	
	
	// 선택한 자동차의 정보를 보여주는 매서드
	public void 차량정보보여주기() { // 선택한 견적 정보를 보여주기 위한 매서드

		System.out.println("\n───────────────────────────────────\n");
		System.out.println("선택하신 " + 브랜드 + " " + 모델 + " " + 등급 + "의 기본스펙 입니다.\n");
		System.out.println("\n───────────────────────────────────\n\n");

		System.out.println("기본 가격 : " + 기본가격 + "만원");
		System.out.println("브랜드 : " + 브랜드);
		System.out.println("모델 : " + 모델);
		System.out.println("등급 : " + 등급);
		System.out.println("최대 출력 : " + 최대출력);
		System.out.println("최대 토크 : " + 최대토크);
		System.out.println("변속기 : " + 미션);
		System.out.println("타이어 : " + 타이어);
		System.out.println("차체 중량 : " + 차체중량);
		System.out.println("공식 연비 : " + 연비);
		System.out.println("승차 정원 : " + 승차인원);
		System.out.println("에어백 : " + 에어백);
		System.out.println("크루즈컨트롤 : " + 크루즈컨트롤);
		System.out.println("차세제어장치 : " + 차세제어장치);
		System.out.println("LED램프 : " + LED램프);
		System.out.println("주간주행등 : " + 주간주행등);
		System.out.println("머플러 : " + 머플러);
		System.out.println("스티어링휠 : " + 스티어링휠);
		System.out.println("기어 노브 : " + 기어노브);
		System.out.println("계기판 : " + 계기판);
		System.out.println("앞좌석 전동시트 : " + 앞좌석전동시트);
		System.out.println("앞좌석 열선시트 : " + 앞좌석열선시트);
		System.out.println("앞좌석 통풍시트 : " + 앞좌석통풍시트);
		System.out.println("풀오토 에어컨 : " + 풀오토에어컨);
		System.out.println("스마트키 : " + 스마트키);
		System.out.println("네비게이션 : " + 네비게이션);
		System.out.println("블루투스 : " + 블루투스);
		System.out.println("\n\n  추가옵션은 다음과 같습니다.");
		System.out.println("\n───────────────────────────────────\n");
		System.out.println("선택 옵션1 : " + 추가옵션1 + " (가격: " + 추가옵션1가격 + "만원" + ")");
		System.out.println("선택 옵션2 : " + 추가옵션2 + " (가격: " + 추가옵션2가격 + "만원" + ")");
		System.out.println("선택 옵션3 : " + 추가옵션3 + " (가격: " + 추가옵션3가격 + "만원" + ")");
		System.out.println("\n───────────────────────────────────\n");

	}

	// 선택한 자동차의 추가 옵션을 선택하는 매서드
	public void 추가옵션선택하기() { // 추가선택옵션을 선택하여 견적에 포함시켜주는 매서드

		while (옵션선택중) { // 옵션체크가 끝날 때까지 선택할 수 있다

			Scanner sc = new Scanner(System.in); // 스캐너를 통해 값을 받을 수 있다

			System.out.println("\n───────────────────────────────────\n");
			System.out.println("       원하시는 추가옵션이 있을 경우 선택해 주세요(숫자입력)");
			System.out.println("\n───────────────────────────────────");
			System.out.println("1. " + 추가옵션1 + " (금액 : " + 추가옵션1가격 + "만원" + ")");
			System.out.println("2. " + 추가옵션2 + " (금액 : " + 추가옵션2가격 + "만원" + ")");
			System.out.println("3. " + 추가옵션3 + " (금액 : " + 추가옵션3가격 + "만원" + ")");
			System.out.println("0. 선택완료");
			System.out.println("────────────────────────────────────\n");
			입력받은추가옵션 = sc.nextInt();

			if (입력받은추가옵션 == 1) { // 선택한 옵션이 1일 때
				선택한추가옵션1 = 추가옵션1; // 옵션1 내용을 따로 저장한다
				System.out.println("\n\n──────────────────────────────────");
				System.out.println("\n       옵션 1 : " + 추가옵션1 + "이(가) 추가 되었습니다.\n");
				System.out.println("\n───────────────────────────────────");
			}

			if (입력받은추가옵션 == 2) { // 선택한 옵션이 2일 때
				선택한추가옵션2 = 추가옵션2; // 옵션2 내용을 따로 저장한다
				System.out.println("\n\n──────────────────────────────────");
				System.out.println("\n       옵션 2 : " + 추가옵션2 + "이(가) 추가 되었습니다.");
				System.out.println("\n───────────────────────────────────");

			}

			if (입력받은추가옵션 == 3) { // 선택한 옵션이 3일 때
				선택한추가옵션3 = 추가옵션3; // 옵션3 내용을 따로 저장한다
				System.out.println("\n\n──────────────────────────────────");
				System.out.println("\n       옵션 3 : " + 추가옵션3 + "이(가) 추가 되었습니다.");
				System.out.println("\n───────────────────────────────────");

			}

			if (입력받은추가옵션 == 0) { // 추가옵션 선택 완료(0번)을 입력하면 while문을 끝낼 수 있도록 옵션선택중를 false로 초기화 한다.
				옵션선택중 = false;
			}

		}

	}

	// 선택한 자동차의 기본스펙과 최종견적을 출력하는 매서드
	public void 선택차량전체내용출력() { // 선택한 추가옵션을 안내해주고 합계 가격을 출력한다

		System.out.println("\n\n\n────────────────────────────────\n");
		System.out.println("          고객님께서 선택하신 차종의 최종 견적입니다.");
		System.out.println("\n\n\n");
		System.out.println("선택하신 차량은 " + 브랜드 + "의 " + 모델 + " 차량이며, 등급은 " + 등급 + "입니다.\n" + " \n차량의 기본 가격은 " + 기본가격
				+ "만원 입니다.\n\n");
		System.out.println("\n\n          기본사양은 다음과 같습니다\n\n");
		System.out.println("기본 가격 : " + 기본가격 + "만원");
		System.out.println("브랜드 : " + 브랜드);
		System.out.println("모델 : " + 모델);
		System.out.println("등급 : " + 등급);
		System.out.println("최대 출력 : " + 최대출력);
		System.out.println("최대 토크 : " + 최대토크);
		System.out.println("변속기 : " + 미션);
		System.out.println("타이어 : " + 타이어);
		System.out.println("차체 중량 : " + 차체중량);
		System.out.println("공식 연비 : " + 연비);
		System.out.println("승차 정원 : " + 승차인원);
		System.out.println("에어백 : " + 에어백);
		System.out.println("크루즈컨트롤 : " + 크루즈컨트롤);
		System.out.println("차세제어장치 : " + 차세제어장치);
		System.out.println("LED램프 : " + LED램프);
		System.out.println("주간주행등 : " + 주간주행등);
		System.out.println("머플러 : " + 머플러);
		System.out.println("스티어링휠 : " + 스티어링휠);
		System.out.println("기어 노브 : " + 기어노브);
		System.out.println("계기판 : " + 계기판);
		System.out.println("앞좌석 전동시트 : " + 앞좌석전동시트);
		System.out.println("앞좌석 열선시트 : " + 앞좌석열선시트);
		System.out.println("앞좌석 통풍시트 : " + 앞좌석통풍시트);
		System.out.println("풀오토 에어컨 : " + 풀오토에어컨);
		System.out.println("스마트키 : " + 스마트키);
		System.out.println("네비게이션 : " + 네비게이션);
		System.out.println("블루투스 : " + 블루투스);
		System.out.println("\n\n\n────────────────────────────────\n");
		System.out.println("\n\n추가 선택하신 옵션은 아래와 같습니다.\n");

		// 최종 가격을 출력하기 위해 기본가격으로 초기화
		추가옵션포함가격 = 기본가격; // 초기 합계가격은 기본가격으로 초기화

		if (선택한추가옵션1 != "") { // 옵션1을 선택하여 추가옵션1choice에 값이 있을 경우
			System.out.println("추가옵션 1번 " + 추가옵션1 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션1가격 + "만원 입니다.");

			추가옵션포함가격 = 추가옵션포함가격 + 추가옵션1가격; // 합계가격에 옵션가격을 더해준다
		}

		if (선택한추가옵션2 != "") { // 옵션2을 선택하여 추가옵션2choice에 값이 있을 경우
			System.out.println("추가옵션 2번 " + 추가옵션2 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션2가격 + "만원 입니다.");
			추가옵션포함가격 = 추가옵션포함가격 + 추가옵션2가격; // 합계가격에 옵션가격을 더해준다
		}

		if (선택한추가옵션3 != "") { // 옵션3을 선택하여 추가옵션3choice에 값이 있을 경우
			System.out.println("추가옵션 3번 " + 추가옵션3 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션3가격 + "만원 입니다.\n");
			추가옵션포함가격 = 추가옵션포함가격 + 추가옵션3가격; // 합계가격에 옵션가격을 더해준다
		}

		System.out.println("\n\n추가 옵션을 포함한 합계 가격은 " + 추가옵션포함가격 + "만원 입니다."); // 전체 가격을 출력해준다.
		System.out.println("\n\n\n────────────────────────────────\n");
	}

	
	
	
	// 해당 내용을 저장해 놓을지, 다시 견적을 내볼 수 있게 할 지 물어봄
	public String[] 선택차량저장() { // 견적 내용의 저장 여부를 묻는다

		System.out.println("\n────────────────────────────────\n");
		System.out.println("    해당 내용을 견적에 저장 할까요?\n\n");
		System.out.println("     1.저장한다    2.저장하지 않는다\n");
		System.out.println("\n────────────────────────────────\n");

		Scanner sc0 = new Scanner(System.in); // 스캐너 객체 생성
		저장여부선택 = sc0.nextInt(); // 저장할지 다시 견적을 낼 지 결정한다

		if (저장여부선택 == 1) { // 1번 견적 저장하기를 선택한 경우

			switch (선택차량저장순서) { // 몇 번째 저장인지를 확인하기 위해 사용

			case 1: // 1번째 저장하는 경우

				System.out.println("\n\n" + 선택차량저장순서 + "번째 견적을 저장하기 위해 이름을 입력하세요 : "); // 견적 이름 저장
				Scanner sc1 = new Scanner(System.in); // 견적 이름을 저장하기 위해 스캐너 객체 생성
				견적저장이름1 = sc1.next(); // 스캐너매소드를 이용하여 견적내용 저장

				// 배열에 견적내용 저장
				String[] 선택차량내용저장1 = { // 견적 내용

						"브랜드 : " + 브랜드, // 브랜드
						"모델 : " + 모델, // 모델
						"등급 : " + 등급, // 등급
						"엔진종류 : " + 엔진종류, // 엔진종류
						"최대출력 : " + 최대출력, // 최대출력
						"최대토크 : " + 최대토크, // 최대토크
						"변속기 : " + 미션, // 변속기
						"타이어 : " + 타이어, // 타이어
						"차체중량 : " + 차체중량, // 차체중량
						"연비 : " + 연비, // 연비
						"승차인원 : " + 승차인원, // 승차인원
						"에어백 : " + 에어백, // 에어백
						"크루즈컨트롤 : " + 크루즈컨트롤, // 크루즈컨트롤
						"차세제어장치 : " + 차세제어장치, // 차세제어장치
						"LED램프 : " + LED램프, // LED램프
						"주간주행등 : " + 주간주행등, // 주간주행등
						"머플러 : " + 머플러, // 머플러
						"스티어링휠 : " + 스티어링휠, // 스티어링휠
						"기어노브 : " + 기어노브, // 기어노브
						"계기판 : " + 계기판, // 계기판
						"앞좌석 전동시트 : " + 앞좌석전동시트, // 앞좌석 전동시트
						"앞좌석 열선시트 : " + 앞좌석열선시트, // 앞좌석 열선시트
						"앞좌석 통풍시트 : " + 앞좌석통풍시트, // 앞좌석 통풍시트
						"풀오토 에어컨 : " + 풀오토에어컨, // 풀오토 에어컨
						"스마트키 : " + 스마트키, // 스마트키
						"ECM룸미러 : " + ECM룸미러, // ECM룸미러
						"네비게이션 : " + 네비게이션, // 네비게이션
						"블루투스 : " + 블루투스,
						"",	// 선택옵션1
						"",	// 선택옵션2
						"",	// 선택옵션3
						"",	// 기본가격
						""}; // 최종가격

				System.out.println("\n────────────────────────────────\n");
				System.out.println("     1번 견적을 '" + 견적저장이름1 + "'으로 저장 하였습니다.\n");
				System.out.println("     견적 내용은 다음과 같습니다.\n\n");

				for (int i = 0; i < 선택차량내용저장1.length; i++) { // 저장한 견적 반복문을 이용하여 순차적으로 배열인덱스를 지나가게 한다

					System.out.println(선택차량내용저장1[i]); // 순차적으로 배열의 내용을 출력시킨다
				}

				System.out.println("\n────────────추가 선택 옵션───────────────\n");
				if (선택한추가옵션1 != "") { // 옵션1을 선택하여 추가옵션1choice에 값이 있을 경우
					System.out.println("추가옵션 1번 " + 추가옵션1 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션1가격 + "만원 입니다.");
					선택차량내용저장1[28]= ("추가옵션 1번 " + 추가옵션1 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션1가격 + "만원 입니다.");

					추가옵션포함가격 = 추가옵션포함가격 + 추가옵션1가격; // 합계가격에 옵션가격을 더해준다
				}
				if (선택한추가옵션2 != "") { // 옵션2을 선택하여 추가옵션2choice에 값이 있을 경우
					System.out.println("추가옵션 2번 " + 추가옵션2 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션2가격 + "만원 입니다.");
					선택차량내용저장1[29]= ("추가옵션 2번 " + 추가옵션2 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션2가격 + "만원 입니다.");
					추가옵션포함가격 = 추가옵션포함가격 + 추가옵션2가격; // 합계가격에 옵션가격을 더해준다
				}
				if (선택한추가옵션3 != "") { // 옵션3을 선택하여 추가옵션3choice에 값이 있을 경우
					System.out.println("추가옵션 3번 " + 추가옵션3 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션3가격 + "만원 입니다.\n");
					선택차량내용저장1[30]= ("추가옵션 3번 " + 추가옵션3 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션3가격 + "만원 입니다.\n");
					추가옵션포함가격 = 추가옵션포함가격 + 추가옵션3가격; // 합계가격에 옵션가격을 더해준다
				}
				선택차량내용저장1[31]=("\n기본 가격 : " + 기본가격 + "만원");
				선택차량내용저장1[32]= ("추가 옵션을 포함한 합계 가격은 " + 추가옵션포함가격 + "만원 입니다.\n");
				
				System.out.println("\n──────────────────────────────────\n\n");
				System.out.println("추가 옵션을 포함한 합계 가격은 " + 추가옵션포함가격 + "만원 입니다."); // 전체 가격을 출력해준다.
				System.out.println("\n──────────────────────────────────\n\n");

				선택차량저장순서 = 2;
				
				
				return 선택차량내용저장1;

			// 2번째 저장 일 경우
			case 2:

				System.out.println("\n\n" + 선택차량저장순서 + "번째 견적을 저장하기 위해 이름을 입력하세요 : "); // 견적 이름 저장
				Scanner sc2 = new Scanner(System.in); // 견적 이름을 입력받기 위해 스캐너 객체 생성
				견적저장이름2 = sc2.next(); // 스캐너클래스의 next메서드를 이용하여 2번째 견적을 저장한다

				String[] 선택차량내용저장2 = { // 2번째 배열에 저장한다

						"브랜드 : " + 브랜드, // 브랜드
						"모델 : " + 모델, // 모델
						"등급 : " + 등급, // 등급
						"엔진종류 : " + 엔진종류, // 엔진종류
						"최대출력 : " + 최대출력, // 최대출력
						"최대토크 : " + 최대토크, // 최대토크
						"변속기 : " + 미션, // 변속기
						"타이어 : " + 타이어, // 타이어
						"차체중량 : " + 차체중량, // 차체중량
						"연비 : " + 연비, // 연비
						"승차인원 : " + 승차인원, // 승차인원
						"에어백 : " + 에어백, // 에어백
						"크루즈컨트롤 : " + 크루즈컨트롤, // 크루즈컨트롤
						"차세제어장치 : " + 차세제어장치, // 차세제어장치
						"LED램프 : " + LED램프, // LED램프
						"주간주행등 : " + 주간주행등, // 주간주행등
						"머플러 : " + 머플러, // 머플러
						"스티어링휠 : " + 스티어링휠, // 스티어링휠
						"기어노브 : " + 기어노브, // 기어노브
						"계기판 : " + 계기판, // 계기판
						"앞좌석 전동시트 : " + 앞좌석전동시트, // 앞좌석 전동시트
						"앞좌석 열선시트 : " + 앞좌석열선시트, // 앞좌석 열선시트
						"앞좌석 통풍시트 : " + 앞좌석통풍시트, // 앞좌석 통풍시트
						"풀오토 에어컨 : " + 풀오토에어컨, // 풀오토 에어컨
						"스마트키 : " + 스마트키, // 스마트키
						"ECM룸미러 : " + ECM룸미러, // ECM룸미러
						"네비게이션 : " + 네비게이션, // 네비게이션
						"블루투스 : " + 블루투스,
						"",	// 선택옵션1
						"",	// 선택옵션2
						"",	// 선택옵션3
						"",	// 기본가격
						""}; // 최종가격
				

				System.out.println("\n────────────────────────────────\n");
				System.out.println("     2번 견적을 '" + 견적저장이름2 + "'으로 저장 하였습니다.\n");
				System.out.println("     견적 내용은 다음과 같습니다.\n\n");

				for (int i = 0; i < 선택차량내용저장2.length; i++) { // 저장한 견적 반복문을 이용하여 순차적으로 배열인덱스를 지나가게 한다

					System.out.println(선택차량내용저장2[i]); // 순차적으로 배열의 내용을 출력시킨다

				}
				System.out.println("\n────────────추가 선택 옵션───────────────\n");
				if (선택한추가옵션1 != "") { // 옵션1을 선택하여 추가옵션1choice에 값이 있을 경우
					System.out.println("추가옵션 1번 " + 추가옵션1 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션1가격 + "만원 입니다.");
					선택차량내용저장2[28]= ("추가옵션 1번 " + 추가옵션1 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션1가격 + "만원 입니다.");

					추가옵션포함가격 = 추가옵션포함가격 + 추가옵션1가격; // 합계가격에 옵션가격을 더해준다
				}
				if (선택한추가옵션2 != "") { // 옵션2을 선택하여 추가옵션2choice에 값이 있을 경우
					System.out.println("추가옵션 2번 " + 추가옵션2 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션2가격 + "만원 입니다.");
					선택차량내용저장2[29]= ("추가옵션 2번 " + 추가옵션2 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션2가격 + "만원 입니다.");
					추가옵션포함가격 = 추가옵션포함가격 + 추가옵션2가격; // 합계가격에 옵션가격을 더해준다
				}
				if (선택한추가옵션3 != "") { // 옵션3을 선택하여 추가옵션3choice에 값이 있을 경우
					System.out.println("추가옵션 3번 " + 추가옵션3 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션3가격 + "만원 입니다.\n");
					선택차량내용저장2[30]= ("추가옵션 3번 " + 추가옵션3 + "을(를) 추가 하셨습니다. " + "옵션가격은 " + 추가옵션3가격 + "만원 입니다.\n");
					추가옵션포함가격 = 추가옵션포함가격 + 추가옵션3가격; // 합계가격에 옵션가격을 더해준다
				}
				
				선택차량내용저장2[31] = ("\n기본 가격 : " + 기본가격 + "만원");
				선택차량내용저장2[32] = ("추가 옵션을 포함한 합계 가격은 " + 추가옵션포함가격 + "만원 입니다.\n");
				
				System.out.println("\n──────────────────────────────────\n\n");
				System.out.println("추가 옵션을 포함한 합계 가격은 " + 추가옵션포함가격 + "만원 입니다."); // 전체 가격을 출력해준다.
				System.out.println("\n──────────────────────────────────\n\n");

				선택차량저장순서 = 0; // 2번째 견적이 저장되면 3번째 견적이 생성 될 수있도록 3으로 변경해준다
				return 선택차량내용저장2;

			// 저장 할 수 있는 배열이 없는 경우
			case 0 : // 3개의 배열변수를 모두 사용하였음으로 저장이 불가함을 알린다

				// 배경음악 1번 재생
				저장불가효과음 test = new 저장불가효과음();
				try {
					test.저장불가효과음매서드();
					Thread.sleep(1000); // 3초에 한번씩 재생하도록 설정
				} catch (Exception e) {

				} // catch 종료
				
				
				System.out.println("\n──────────────────────────────────\n\n");
				System.out.println("\n더 이상 견적을 저장 할 수 없습니다.\n ");
				System.out.println("\n──────────────────────────────────\n\n");
				break;

			} // saveCount if 종료

			if (저장여부선택 == 2) { // 2번 저장하지 않음을 선택하면 저장하지 않고 종료 한다

				System.out.println("\n저장되지 않았습니다."); // 저장하지 않았음을 알려준다
			}

		} // 저장여부선택 if문 종료
		return null;

	} // 선택차량저장 매서드 종료
	public void 견적초기화() {
		
		
		선택차량저장순서=1;
	}
	
	

} // 자동차 클래스 종료
