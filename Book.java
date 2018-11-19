/********************************************************************************************************************
* Book.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
import java.util.List; //.ArrayList;
import java.util.ArrayList;

public class Book extends Publication{
    private String ISBN = "";
    private String LCCN = "";
    private String author = "";
    private String pages= "";
    private String year = "";
    private String edition = "";
   
public Book(){
    super("", "", "", "");  // Pass these parameters to the Publication constructor.
    this.ISBN = "";
    this.LCCN = "";
    this.author = "";
    this.pages = "";
    this.year = "";
    this.edition = "";
    
}//end of  default constructor
public Book(String title, String publisher, String publicationDate, String subject, String ISBN, String LCCN, String author, String pages, String year, String edition){
    super(title, publisher, publicationDate, subject);  // Pass these parameters to the Publication constructor.
    this.ISBN = ISBN;
    this.LCCN = LCCN;
    this.author = author;
    this.pages = pages;
    this.year = year;
    this.edition = edition;
}//end of loaded constructor


//////////////////////Define Setter mutator methods//////////////
@Override
public void setISBN(String nISBN){
    //this.ISBN = nISBN;
    //remove any hyphens
    nISBN.replaceAll( "-", "" );
    nISBN.replaceAll( "/", "" );
    nISBN.replaceAll( " ", "" );

    //must be a 10 or 13 digit ISBN
    if ( nISBN.length() != 13 ){
        if(nISBN.length() != 10 ){
            System.out.println("Please enter a valid 10 or 13 digit ISBN.");
             }
        } else {
        for(int i = 0; i < bookList.size(); i++){
          if(bookList.contains(nISBN)){
            System.out.println("This ISBN is already registered. Please confirm the ISBN you are trying to enter.");
            System.out.println("Unable to add duplicate entries.");
            return;
            } else{ this.ISBN = nISBN; }
        }
    }
}
@Override
public void setLCCN(String nLCCN ){
    //this.LCCN = nLCCN;
        //remove any hyphens or /
        //There are 3 competing formats, this will standardize them to the "Normalized LCCN" format used by Library of Congress and MARC.
        nLCCN.replaceAll( " ", "" );
        nLCCN.replaceAll( "-", "" );
        nLCCN.replaceAll( "/", "" );

        //must be a 9 digit LCCN
        if ( nLCCN.length() != 9 ){
            System.out.println("Please enter a valid 9 digit Library of Congress Number.");
            } else {
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).equals(nLCCN)){
                System.out.println("This Library of Congress number is already registered. Please confirm the LCCN you are trying to enter.");
                System.out.println("Unable to add duplicate entries.");
                return;
            } else { this.LCCN = nLCCN; }
        }
    }
}
@Override
public void setAuthor(String nAuthor){// These will allow duplicates
    this.author = nAuthor;
}
@Override
public void setPages(String nPages){
    this.pages = nPages;
}
@Override
public void setYear(String nYear){
    this.year = nYear;
}
@Override
public void setEdition(String nEdition){
    this.edition = nEdition;
}

//Magazine 
public  void setFrequency(String nFrequency){};
public  void setEditor(String nEditor){};
//Newsletter
public void setOwner(String nOwner ){}

//////////////////////// Define "getter" accessor methods.///////
public String getISBN(){
    return this.ISBN;
}
public String getLCCN(){
    return this.LCCN;
}
public String getAuthor(){
    return this.author;
}
public String getPages(){
    return this.pages;
}
public String getYear(){
    return this.year;
}
public String getEdition(){
    return this.edition;
}


////////////////////////////toString Override////////////////////
@Override
    public String toString(){
        StringBuffer strBuf = new StringBuffer("Book Data: \n");
        
         
        strBuf.append("ISBN :          ");
        strBuf.append(this.ISBN) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Library of Congress number :          ");
        strBuf.append(this.LCCN) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Author :          ");
        strBuf.append(this.author) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Number of Pages :          ");
        strBuf.append(this.pages) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Copyright Year :          ");
        strBuf.append(this.year) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Edition :          ");
        strBuf.append(this.edition) ;
        strBuf.append( "\n\n") ;    


        return strBuf.toString() ;
    }
}//end of class  
