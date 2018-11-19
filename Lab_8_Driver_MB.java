        /********************************************************************************************************************
        * Lab_8_MB.java
        * Author: Downrightmike
        * CIS 131
        * 
        * 
        ********************************************************************************************************************/
        import java.util.Scanner;

public class Lab_8_Driver_MB {       
        public static void main(String[] args) {           
           // The driver program will instantiate 3 objects of the Book, Magazine, and Newsletter classes then add all of them 
           //     to an ArrayList of the Publication class.
        //Book
        //Book book1 = new Book("Title", "Publisher", "PubDate", "Subject", "0000000001", "n00000001", "Author", "Pages", "Copyright Year", "Edition" );
        Book book1 = new Book("Title1", "Publisher1", "PubDate1", "Subject1", "1000000001", "n00000001", "Author1", "Pages1", "Copyright Year1", "Edition1" );
        Book book2 = new Book("Title2", "Publisher2", "PubDate2", "Subject2", "0000000002", "n00000002", "Author2", "Pages2", "Copyright Year2", "Edition2" );
        Book book3 = new Book("Title3", "Publisher3", "PubDate3", "Subject3", "3000000003013", "n00000003", "Author3", "Pages3", "Copyright Year3", "Edition3" );
        
       

        //Magazine
        //Magazine mag1 = new Magazine("Title", "Publisher", "PubDate", "Subject", "Frequency", "Editer" );
        Magazine mag1 = new Magazine("Title", "Publisher", "PubDate", "Subject", "weekly", "Editer" );
        Magazine mag2 = new Magazine("Title2", "Publisher2", "PubDate2", "Subject2", "weekly", "Editer2" );
        Magazine mag3 = new Magazine("Title3", "Publisher3", "PubDate3", "Subject3", "weekly", "Editer3" );

        //Newsletter
        //Newsletter news1 = new Newsletter("Title", "Publisher", "PubDate", "Subject",  "Frequency", "Editer", "Owner" );
        Newsletter news1 = new Newsletter("Title", "Publisher", "PubDate", "Subject",  "Daily", "Editer", "Owner" );
        Newsletter news2 = new Newsletter("Title2", "Publisher2", "PubDate2", "Subject2",  "Daily", "Editer2", "Owner2" );
        Newsletter news3 = new Newsletter("Title3", "Publisher3", "PubDate3", "Subject3",  "Daily", "Editer3", "Owner3" );


           // Next the driver will pass the ArrayList to a method that uses the Java for each or enhanced for loop statement
           //     to iterate through the ArrayList and invoke the toString method of each object it encounters. 
           book1.toString();
           mag1.toString();
           news1.toString();
           book2.toString();
           mag2.toString();
           news2.toString();
           book3.toString();
           mag3.toString();
           news3.toString();
          
           // When a Book object is encountered, it should invoke the Book toString() method. When a Periodical object is encountered,
           //     it should invoke the Periodical toString() method.
        
       
    
        //New Student class print out
        System.out.println("book1: \n" + book1.toString());
        System.out.println("book2: \n" + book2.toString());
        System.out.println("book3: \n" + book3.toString());
        
        System.out.println("mag1: \n" + mag1.toString());
        System.out.println("mag2: \n" + mag2.toString());
        System.out.println("mag3: \n" + mag3.toString());
        
        System.out.println("news1: \n" + news1.toString());
        System.out.println("news2: \n" + news2.toString());
        System.out.println("news3: \n" + news3.toString());
        
    }
}