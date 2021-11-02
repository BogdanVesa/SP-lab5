package sabloane;

public class JPGImageLoader implements ImageLoader {
	String txt;

	public JPGImageLoader(String imageName) {
		// TODO Auto-generated constructor stub
		this.txt = imageName;
	}

	@Override
	public void load(String txt) {
		// TODO Auto-generated method stub
		System.out.println("image is jpg");
	}



}
