/********************************************************************************************************************
* Newsletter.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
import java.util.List; //.ArrayList;
import java.util.ArrayList;

public class Newsletter extends Publication{
    final String[] FREQUENCY = { "Daily", "Weekly", "Bi-weekly", "Monthly", "Quarterly", "Yearly"};
    private String frequency = "";
    private String editor = "";
    private String owner = "";

   
public Newsletter(){
    super("", "", "", "");  // Pass these parameters to the Publication constructor.
    this.frequency = "";
    this.editor = "";
    this.owner = "";

}//end of  default constructor
public Newsletter(String title, String publisher, String publicationDate, String subject, String frequency, String editor, String owner){
    super(title, publisher, publicationDate, subject);  // Pass these parameters to the Publication constructor.
    this.frequency = frequency;
    this.editor = editor;
    this.owner = owner;
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
@Override
public void setOwner(String nOwner ){
    this.owner = nOwner;
}

//////////////////////// Define "getter" accessor methods.///////
public String getFrequency(){
    return this.frequency;
}
public String getEditor(){
    return this.editor;
}
public String getOwner(){
    return this.owner;
}

////////////////////////////toString Override////////////////////
@Override
    public String toString(){
        StringBuffer strBuf = new StringBuffer("Newsletter Data: \n");
        
         
        strBuf.append("Publication frequency : ");
        strBuf.append(this.frequency) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Editor :          ");
        strBuf.append(this.editor) ;
        strBuf.append( "\n\n") ;    
         
        strBuf.append("Owner :          ");
        strBuf.append(this.owner) ;
        strBuf.append( "\n\n") ;    
         

        return strBuf.toString() ;
    }
}//end of class  
