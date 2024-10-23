package this_keyword;

public class Driver {
	
	public static void main(String[] args) {

		Pencil p = new Pencil(12);
		System.out.println(p.nonstaticPrice);
		System.out.println(Pencil.staticPrice);
	}

}
