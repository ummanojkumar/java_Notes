public class leap_Year
 {
   public static void main(String[] args){
      int year;
    
       year=40000;


      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
      System.out.println(" year "+year+ " is a leap year");
      else
      System.out.println(" year "+year+ " is not a leap year");


   }
}