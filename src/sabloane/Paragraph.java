package sabloane;



public class Paragraph implements Element{
    String txt;
    Element parent;
    AlignStrategy align = new AlignCenter();
    
    public Paragraph(String txt)
    {
        this.txt = txt;
    }
    public void print()
    {
        System.out.print("paragraph: ");
        this.align.Render(this.txt);
    }
	public void setAlignStrategy(AlignStrategy align) {
		// TODO Auto-generated method stub
		this.align = align;
	}

}