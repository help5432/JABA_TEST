package TEST01;

public class Test03 {

	public static void main(String[] args) {
	
		//메서드가 정의된 클래스의 인스턴스를 생성한 후,
		//해당 인스턴스를 통해 메서드를 호출해야 합니다.
		Car C01 = new Car();
		
		int result = C01.b(); 
		System.out.println(result);	
	}
}

class Car{
	//매서드 시그니처(매서드 명 , 파라미터 타입 , 갯수)
	//같은 클래스안에 시그니처가 동일한 함수를 2개 선언할수 없다
	// 클래스가 다르면 상관없다
	int c(int x , int y) // 매서드 매개변수 매서드 
	//매서드 내부에서 사용할수있는 변수
	{
		int result = x+y; // 매서드 내부에서 실행되는코드
		return result; // 매서드를 호출한쪽에 되돌려줄값 return 값이 없다면 void 를쓴다 , void 라도 리턴을 사용할수있다.
	}
	int b() {
	
		Car C01 = new Car(); //클래스 객체
		
		int result = C01.c(20,30);
		return result; // Car.b() 리턴값
		
		
			
 // 같은 클래스에서는 객체생성없이(Car C02 = new Car();)그냥 사용한다.
		
	}
}

