// icsd13126, biniakou theofanis, askisi 3

public class book {
    protected String title;
    protected author a;
    protected String lang;
    
    public book(String title, author a, String lang) // an dinetai h glwssa tote arxikopoiw 
                                                        // oles tis metavlites
    {
        this.title = title;
        this.a = a;
        this.lang = lang;
    }
    
    public book(String title, author a) // an den dinetai h glwssa, tote arxikopoiw thn glwssa me english
    {
        this.title = title;
        this.a = a;
        this.lang = "english";
    }
    
    
    public String getTitle() // epistrefei ton titlo tou bibliou
    {
        return title;
    }
    
    public String getAuthor() // epistrefei to onoma tou suggrafea
    {
        return a.getName();
    }
    
    public author getObjAuthor() // epistrefw ton suggrafea san antikeimeno
    {
        return a;
    }
    
    public String getLang() // epistrefei thn glwssa sthn opoia einai grammenh to vivlio
    {
        return lang;
    }
    
    @Override
    public String toString ()
    {
        return "tilos: " + title + ", onoma suggrafea: " + a.getName() + 
                ", glwssa: " + lang + "\n";
    }
}
