package TEST01;



public class TEST02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		
		Tv t2 = new Tv();
		t1.channel =0;
		System.out.println("채널변경전" +t1.channel);
		
		t2.channel =30;
		System.out.println("채널변경후" +t2.channel);
 	
 	
}
}
class Tv{ //클래스 tv , 맴버변수 channel
 	int channel;	
	

	}

