package sabloane;



public class Table implements Element{
    String title;
    Element parent;

    public Table(String title)
    {
        this.title = title;
    }
    public void print()
    {
        System.out.println("table: "+this.title);
    }

}
