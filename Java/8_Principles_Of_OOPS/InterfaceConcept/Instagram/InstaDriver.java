package InterfaceConcept.Instagram;

public class InstaDriver {
	
	public static void main(String[] args) {
		Instagram insta = new InstaImp2("Raju",1234);
		insta.post("Im So Happy");
		insta.like("Angel Priya");
		insta.comment("Angel Priya", "Really?");
		insta.message("Angel Priya", "Hi Angel");
		insta.message("Angel Priya", "ARE YOU THERE?");
				
		
	}

}
