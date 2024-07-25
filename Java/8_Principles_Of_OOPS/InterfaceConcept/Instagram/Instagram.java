package InterfaceConcept.Instagram;

public interface Instagram {
	
	void post(String type);
	
	void comment(String name,String type);
	
	void like(String name);
	
	static void greeting(String name)
	{
		System.out.println("Hey " + name+ "! Welcome To Instagram");
	}
	void message(String name,String msg);
	
	void story(String type);
}
