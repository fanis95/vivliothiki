// icsd13126, biniakou theofanis, askisi 3

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class library {
    protected String name;
    protected ArrayList<copy> copies = new ArrayList<>();
    
    public library(String name)
    {
        this.name = name;
        System.out.println("The library " + name + " has opened!");
    }
    
    public String getName() // epistrefei to onoma ths vivliothikis
    {
        return name;
    }
    
    public String getNbOfCopies() // epistrefei twn arithmo twn antigrafwn
    {
        return "\no arithmos twn antigrafwn pou uparxoun sthn vivliothiki"
                + " einai: " + copies.size() + "\n";
    }
    
    public void stock(book b,Integer number) // to dhlwnw san integer etsi wste h methodos na
                                                //sunexisei na doylevei sthn periptwsh p o xristis
                                                    //den dwsei arithmo antigrafwn
    {
        if (number == null) // an o xristis den exei dwsei ton arithmo twn antigrafwn,prosthetw 
                                // mia fora to vivlio sthn lista twn antigrafwn
        {
            copy c = new copy(b);
            copies.add(c);
        }
        else //prosthetw sthn lista oses fores thelei o xristis kapoio vivlio 
            for (int i=0;i<number;i++)
            {
                copy c = new copy(b);
                copies.add(c);
            }
    }
    
    public Set listCopies(String lang) // epistrefw set, etsi wste na min uparxoun duplwtupa
    {
        int i;
        Set<book> s = new HashSet<>();
        
        
        if (lang != null) // an o xristis exei dwsei glwssa kai oxi null
        {
            System.out.println("antigrafa p einai grammena se " + lang);
            
            for (i=0;i<copies.size();i++) // diasxizw olh thn lista me ta antigrafa tis vivliothikis
            {
                book b = (book) copies.get(i).getBook();
                if (b.getLang().equals(lang)) //an to vivlio sthn lista einai afto p psaxnoyme
                    s.add(b); // to prosthetw sthn set
            }
        }
        else // an o xristis exei dwsei null, metaferw olh thn lista
        {
            for (i=0;i<copies.size();i++)
            {
                book b = (book) copies.get(i).getBook();
                s.add(b);
            }
        }
        
        return s;
    }
    
    public String countCopies(book b)
    {
        int i;
        int counter = 0; // me thn counter tha metraw posa antigrafa exei ena biblio
        
        
        for (i=0;i<copies.size();i++)//diasxizw olh thn lista me ta antigrafa
        {
            book b2 = (book) copies.get(i).getBook();
            if (b2.equals(b)) // an isxuei, vrika ena antigrafo tou bibliou pou edwse o xristis
                counter++;//to afxanw kata ena
        }
            
        return "vrethikan " + counter + " antigrafa tou vivliou : \n" + b.toString();
    }
    
    public void printAuthor (Boolean tf) // boolean me kefalaio B gia na borei na parei 
                                                    // kai null timh
    {
        int i;
        Set<String> authors = new HashSet<>(); // tha valw ola ta onomata se set, gia na min krathsw
                                                 //ta diplwtupa
        
        if (tf == null) // an o xristis sthn metavliti boolean evale null
        {
            for (i=0;i<copies.size();i++) // diasxizw olh thn lista me ta antigrafa
            {
                book b = (book) copies.get(i).getBook();
                authors.add(b.getAuthor());//kai antigrafw xwris duplwtupa ola ta vivlia
            }
            System.out.println("onomata suggrafewn twn opoiwn ta biblia uparxoun ws antigrafa"
                    + " sthn bibliothiki");
            //edw emfanizw to katallhlo mhnuma kai molis teleiwsei h if kai ta else if
            //tha emfanizw thn set sto telos
        }
        else if (tf == true) // an o xristis sthn metavliti boolean evale true
        {
            for (i=0;i<copies.size();i++) // diasxizw olh thn lista me ta antigrafa
            {
                book b = (book) copies.get(i).getBook();
                author a = b.getObjAuthor();
                
                if (b.getAuthor().equals(a.getName()) && a.getPrize() == true)//an o suggrafeas 
                                                                                //exei vraveftei
                    authors.add(a.getName());//ton metaferw sthn set
            }
            System.out.println("onomata suggrafewn twn opoiwn ta biblia uparxoun ws antigrafa"
                    + " sthn bibliothiki kai exoun brabeutei");
        }
        
        else
        {
            for (i=0;i<copies.size();i++)
            {
                book b = (book) copies.get(i).getBook();
                author a = b.getObjAuthor();
                
                if (b.getAuthor().equals(a.getName()) && a.getPrize() == false)//an o suggrafeas 
                                                                                //den exei vrafeftei
                    authors.add(a.getName());//ton metaferw sthn set
            }
            System.out.println("onomata suggrafewn twn opoiwn ta biblia uparxoun ws antigrafa"
                    + " sthn bibliothiki kai den exoun brabeutei");
        }
        
        //edw ginetai h emfanish ths set, h opoia exei gemisei analoga thn timh
        //pou edwse o xristis sthn metavliti boolean
        authors.stream().forEach((s) -> {
            System.out.println(s);
        });
    }
}
