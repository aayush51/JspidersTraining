package PracticePrograms;
public class ShortestPath {
	
	public static float getShortestPath(String path) {
		int x = 0 , y = 0 ;
		for(int i=0 ; i<path.length() ; i++) {
			if(path.charAt(i) == 'N') {
				y++;
			}
			else if(path.charAt(i) == 'E') {
				x++;
			}
			else if(path.charAt(i) == 'S') {
				y--;
			}
			else if(path.charAt(i) == 'W') {
				x--;
			}
		}
		int X2 = x*x;
		int Y2 = y*y;
		float distance = (float) Math.sqrt(X2+Y2);
		return distance ;
		
}
	
	public static void main(String[] args) {
		
		String path = "WNEENESEENNEEEEE";
		System.out.println(getShortestPath(path));
		
	}

}
