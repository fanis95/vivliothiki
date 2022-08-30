// icsd13126, biniakou theofanis, askisi 3

public class copy {
    protected book b;
    
    public copy (book b)
    {
        this.b = b;
        System.out.println("New copy -> " + b.getTitle() + ", "+ 
                b.getAuthor() + ", " + b.getLang());
    }
    
    public Object getBook () // epistrefei to biblio san antikeimeno
    {
        return b;
    }
    
    public String toString()
    {
        return "Copy of " + b.toString() + "\n";
    }
}
