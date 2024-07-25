package InterfaceConcept.Instagram;

public class InstaImp2 extends InstaImp1 {
	
	public InstaImp2() {
		
	}
	
	public InstaImp2(String name, int pin) {
		super(name, pin);
	}
	
	@Override
	public void message(String name, String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		System.out.println(name+" messaged!");
		System.out.println("Message Sent!");
	}
	
	@Override
	public void story(String type) {
		// TODO Auto-generated method stub
		System.out.println("Story Updated!");
	}
	
}
