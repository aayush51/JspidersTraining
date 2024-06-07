package EarlyBinding.PartsMobile;

public class Camera {
	
	int megaPixels;
	String resolution;
	
	public Camera() {

	}
	
	Camera(int megaPixels,String resolution){
		this.megaPixels = megaPixels;
		this.resolution = resolution;
	}
	
	public void displayCamera()
	{
		System.out.println("Camera Details: ");
		System.out.println("MegaPixels: " + megaPixels);
		System.out.println("Resolution: " + resolution);
	}
	

}
