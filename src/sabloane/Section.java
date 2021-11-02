package sabloane;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Cloneable {
	String title;
	List<Element> elements= new ArrayList<Element>();
	Element clone;

	public Section() {
		
	}
	public Section(String title) {
		super();
		this.title = title;
	}
	
	
	@Override
	public void print() {
		System.out.println(title);
		this.elements.forEach(element ->{
			element.print();
		});
		
	}


	public void add(Element e) {
		// TODO Auto-generated method stub
		try {
			this.clone = (Element) this.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.elements.add(e);
	}

	public void remove(Element e) {
		// TODO Auto-generated method stub
		this.elements.remove(e);
	}

	public Element get(int i) {
		// TODO Auto-generated method stub
		return this.elements.get(i);
	}
	
	 @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }



}
