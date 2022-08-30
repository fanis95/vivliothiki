// icsd13126, biniakou theofanis, askisi 3

public class author {
    protected String name;
    protected boolean prize;
    
    public author (String name, boolean prize)
    {
        this.name = name;
        this.prize = prize;
    }    
            
    public String getName() // epistrefei to onoma tou suggrafea
    {
        return name;
    }
    
    public boolean getPrize() // epistrefei bool timh analoga an exei brabeftei h suggrafeas h oxi
    {
        return prize;
    }
    
    
}
