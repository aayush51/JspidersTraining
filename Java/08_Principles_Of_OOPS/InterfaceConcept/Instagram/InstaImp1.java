package InterfaceConcept.Instagram;

public abstract class InstaImp1 implements Instagram {
	String user;
	int pin;
	
	public InstaImp1() {
		
	}
	
	public InstaImp1(String user, int pin) {
		this.user = user;
		this.pin = pin;
		System.out.println("Account Created!");
	}
	
	public void post(String type) {
		System.out.println(type);
		System.out.println("Posted!");
	}
	
	public void comment(String name , String type) {
		System.out.println(type);
		System.out.println(name+" Commented!");
	}
	
	public void like(String name) {
		System.out.println(name+" Liked the post!");
	}

}
