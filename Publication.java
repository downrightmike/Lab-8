/********************************************************************************************************************
* Publication.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
import java.util.List; //.ArrayList;
import java.util.ArrayList;        
public abstract class Publication{
    private String title;
    private String publisher;
    private String publicationDate;
    private String subject;

    //add an ArrayList of Book, Magazine and Newsletter
    protected ArrayList<Book> bookList;
    protected ArrayList<Magazine> magazineList;
    protected ArrayList<Newsletter> newsLetterList;

    //Add Book object
    private Book BookObj;
    private Magazine MagazineObj;
    private Newsletter NewsletterObj;

    protected Publication(){ //no arg constructor //Not able to create objects directly if protected. Subclasses are OK to use.
    this.title = "";
    this.publisher = "";
    this.publicationDate = "";
    this.subject = "";
    //Add Book object
    bookList = new ArrayList<Book>();
    magazineList = new ArrayList<Magazine>();
    newsLetterList = new ArrayList<Newsletter>();
    }
        
    protected Publication(String newTitle, String newPublisher, String newPublicationDate, String newSubject){ 
        this.title = newTitle;
        this.publisher = newPublisher;
        this.publicationDate = newPublicationDate;
        this.subject = newSubject;
        bookList = new ArrayList<Book>();  
        magazineList = new ArrayList<Magazine>();
        newsLetterList = new ArrayList<Newsletter>();
      }

        // Define "setter" a.k.a. mutator methods.
   public void setTitle(String newTitle ){
        this.title = newTitle;
   }
   public void setPublisher(String newPublisher ){
        this.publisher = newPublisher;
   }
   public void setpublicationDate(String newPublicationDate ){
        this.publicationDate = newPublicationDate;
   }
   public void setsubject(String newSubject ){
       this.subject = newSubject;
   }

   public void addBook(Book BookObj){
    
    for(int i = 0; i < bookList.size(); i++){
           if(bookList.contains(this.BookObj)){
             bookList.add(this.BookObj);
        } else {
           System.out.println("\nThe book object is null. \n");
     }
    }

}//end of addBook

/////////////////////////////////////////////////////////////////////////////////////////////////
    // Define "getter" a.k.a. accessor methods.
       public String getTitle(){
        return this.title ;  }
       public String getpublisher(){
        return this.publisher ;  }
       public String getpublicationDate(){
        return this.publicationDate;  }
       public String getsubject(){
        return this.subject;  }

///////End of Class Getters///////////


///////Any abstract or empty methods for polymorphism////////////////
//Book
public void setISBN(String nISBN){}
public void setLCCN(String nLCCN ){}
public void setAuthor(String nAuthor){}
public void setPages(String nPages){}
public void setYear(String nYear){}
public void setEdition(String nEdition){}
//Magazine 
public abstract void setFrequency(String nFrequency);
public abstract void setEditor(String nEditor);
//Newsletter
public void setOwner(String nOwner ){}

///////toString Override//////////////
@Override
    public String toString(){
        StringBuffer strBuf = new StringBuffer("Publication Data: \n");
        
        strBuf.append("***********************************\n");   
        strBuf.append("Title :  ");
        strBuf.append(this.title) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Publisher :              ");
        strBuf.append(this.publisher) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Subject :        ");
        strBuf.append(this.subject) ;
        strBuf.append( "\n") ;    
        if(bookList.size() > 0){
            strBuf.append("Books ");
            for(int i = 0; i < bookList.size(); i++){
            strBuf.append(bookList.get(i));
            strBuf.append( "\n") ;
            }
        }
        if(magazineList.size() > 0){
            strBuf.append("Magazines ");
            for(int i = 0; i < magazineList.size(); i++){
            strBuf.append(magazineList.get(i));
            strBuf.append( "\n") ;
            }
        }
        if(newsLetterList.size() > 0){
            strBuf.append("Newsletters ");
            for(int i = 0; i < newsLetterList.size(); i++){
            strBuf.append(newsLetterList.get(i));
            strBuf.append( "\n") ;
            }
        }
        strBuf.append( "***********************************") ;    
        
        return strBuf.toString() ;
     }
    
}