package sabloane;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    String url;
    Dimension dim;
    PictureContent content;

    public Image(String imageName)
    {
    	this.url = imageName;
    	try {
    	TimeUnit.SECONDS.sleep(5);
    	} catch (InterruptedException e) {
    	e.printStackTrace();
    	}
    }
    public void print()
    {
        System.out.println("Image: "+url);
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
		return this.content;
	}


}
