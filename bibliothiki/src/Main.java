// icsd13126, biniakou theofanis, askisi 3

import java.util.HashSet;
import java.util.Set;


public class Main {

    
    public static void main(String[] args) {
        
        //ftiaxnw thn vivliothiki
        library l = new library("new library");
        
        //dimiourgw 3 suggrafeis
        author a1 = new author("author1",true);
        author a2 = new author("author2",false);
        author a3 = new author("author3",true);
        //dimiourgw 4 biblia
        book b1 = new book("book1",a1,"greek");
        book b2 = new book("book2",a2,"english");
        book b3 = new book("book3",a2);
        book b4 = new book("book4",a3,"italian");
        
        //dimiourgw antigrafa twn parapanw vivliwn
        l.stock(b1,5);
        l.stock(b2,3);
        l.stock(b3,6);
        l.stock(b4,2);
        
        //elegxos ths getNbOfCopies
        System.out.println(l.getNbOfCopies());
        
        //elegxos ths listCopies
        Set<book> antigrafa = new HashSet<>(l.listCopies("greek"));
        antigrafa.stream().forEach((s) -> { // emfanish ths set 
            System.out.println(s);
        });
        
        
        //elegxos ths countCopies
        System.out.println(l.countCopies(b4));
        
        
        //elegxos ths printAuthor
        l.printAuthor(true);
        
        
    }
    
}
