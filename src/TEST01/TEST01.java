package TEST01;

public class TEST01 {

	public static void main(String[] args) {
		// 메인이 있는 클래스만 퍼블릭이 붙고 나머지는 x 일단기억
	//객체를 만드는 방법 변수 = 객체값;
		// 클래스명 , 참조변수 = new 클래스명();
	ClassA ca = new ClassA();	//객체내의 값을 사용하는방법 
	System.out.println(ca.x); // ca 안에있는 변수호출
//	ca.f1();  //ca 클래스안의 매서드 호출  == 객체변수라고도함 
	ca.x  = 30;  //클래스안의 변수명 수정
	System.out.println(ca.x); // 값 30 나옴
	}  
}

class ClassA{
	int x =10;  // 변수 x
	
	
	void f1() {  //f1 매서드
		System.out.println("f1()");
		
	}
	
}
/*클래스로 객체를 만드는 방법
 * 자료형 참조변수 = new 클래스명();
 * 참조변수 = 클래스로 만들어진 객체값(인스턴스) 저장할 공간
 * (주소를 저장하는 공간) 그값이 위치한 !!주소!!를 저장하는것
 * 일반변수는 !!값을!! 저장하는 공간이지만
 * 
 * new : 메모리 할당
 * 클래스명(): 클래스로 객체 만들어라
 * 
 */
 		