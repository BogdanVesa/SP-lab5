package sabloane;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
	String title;
	List<Author> authors = new ArrayList<Author>();
	List<Element> sections = new ArrayList<Element>();
	
	public Book(String title) {
		super();
		this.title = title;
	}

	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		this.authors.add(author);
	}

	public void addContent(Element element) {
		// TODO Auto-generated method stub
		this.sections.add(element);
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title);
		this.authors.forEach(author -> {
			author.print();
		});
		this.sections.forEach(section ->{
			section.print();
		});
	}
	
	
}