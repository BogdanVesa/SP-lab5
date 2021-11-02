package sabloane;

public class ImageProxy implements Element, Picture{
	String url;
	Dimension dim;
	Image realImg;
	
	
	public ImageProxy(String url) {
		super();
		this.url = url;
	}

	
	Image loadImage() {
		if(realImg == null) {
			realImg = new Image(url);
		}
		return realImg;
	}

	@Override
	public String url() {
		// TODO Auto-generated method stub
		return this.url;
	}


	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return this.dim;
	}


	@Override
	public PictureContent content() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.url);
	}
	
	
}
