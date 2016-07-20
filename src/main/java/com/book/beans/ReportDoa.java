package com.book.beans;

/*Name: Jonathan Kevin Selvadurai
 * 
 * 
 */


public class ReportDoa {
 
	
	final static int totalNumOfBooks=2500;
	
    public ReportDoa(){
	  
    }

   
   public String precentageRead(int numberBooksRead){
        double bookPrecent=((double)numberBooksRead)/(totalNumOfBooks);
        String precentHtml=bookPrecent+"%";
        return precentHtml;
   } 
   
   
        

    



}
