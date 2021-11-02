package sabloane;

public class BMPImageLoader implements ImageLoader {
	String txt;
	

	public BMPImageLoader(String imageName) {
		// TODO Auto-generated constructor stub
		this.txt= imageName;
	}

	@Override
	public void load(String txt) {
		// TODO Auto-generated method stub
		System.out.println("this image is BMP");		
	}



}
