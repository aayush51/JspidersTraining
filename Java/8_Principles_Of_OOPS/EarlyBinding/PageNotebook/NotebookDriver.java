package EarlyBinding.PageNotebook;

public class NotebookDriver {
	
	public static void main(String[] args) {

		Notebook n1 = new Notebook("Classmate", 200, 100, true, false, false, false, 10, 8);
		n1.displayNotebook();

		System.out.println("-----------------------------------");

		n1.p1.displayPage();
	}

}
