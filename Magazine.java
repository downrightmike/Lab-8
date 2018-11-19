/********************************************************************************************************************
* Magazine.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
import java.util.List; //.ArrayList;
import java.util.ArrayList;

public class Magazine extends Publication{
    final String[] FREQUENCY = { "Daily", "Weekly", "Bi-weekly", "Monthly", "Quarterly", "Yearly"};
    private String frequency = "";
    private String editor = "";

   
public Magazine(){
    super("", "", "", "");  // Pass these parameters to the Publication constructor.
    this.frequency = "";
    this.editor = "";

}//end of  default constructor
public Magazine(String title, String publisher, String publicationDate, String subject, String frequency, String editor){
    super(title, publisher, publicationDate, subject);  // Pass these parameters to the Publication constructor.
    this.frequency = frequency;
    this.editor = editor;
}//end of loaded constructor

//////////////////////Define Setter mutator methods//////////////
@Override
public void setFrequency(String nFrequency){
    //this.frequency = nFrequency;
    for(int i = 0; i < FREQUENCY.length; i++){
        if(FREQUENCY[i].equals(nFrequency)){
            this.frequency = nFrequency;
        } else { 
            System.out.println("Please enter a valid publication frequecy"); 
            System.out.println("Recognized options are: Daily, Weekly, Bi-weekly, Monthly, Quarterly, Yearly"); 
        }
    }
}
@Override
public void setEditor(String nEditor ){
    this.editor = nEditor;
}

//////////////////////// Define "getter" accessor methods.///////
public String getFrequency(){
    return this.frequency;
}
public String getEditor(){
    return this.editor;
}

////////////////////////////toString Override////////////////////
@Override
    public String toString(){
        StringBuffer strBuf = new StringBuffer("Magazine Data: \n");
        
         
        strBuf.append("Publication frequency : ");
        strBuf.append(this.frequency) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Editor :          ");
        strBuf.append(this.editor) ;
        strBuf.append( "\n\n") ;    
         

        return strBuf.toString() ;
    }
}//end of class  
