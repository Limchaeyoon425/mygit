import java.util.Scanner;

public class HW2_5 {
   
   //constant capacity and maximum speed
   public static final double C = 60.0; 
   public static final double M = 40.0;
   
   Scanner sc = new Scanner(System.in);
   
   //private variable
   private double f; //fuel amount
   private double s; //current speed
   private double e; //efficiency 
   
   //implement private variables' getter and setter
   public void setAmount(double Amount)
   {
      f = Amount;
      
   }
   
   public Double getAmount()
   {
      return f;
   }
   public void setCurrent(double Current)
   {
      s = Current;
      
   }
   
   public Double getCurrent()
   {
      return s;
   }
   
   public void setEfficiency(double Efficiency)
   {
      e = Efficiency;
   }
   
   public Double getEfficiency()
   {
      return e;
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      HW2_5 test = new HW2_5();
      test.setAmount(80);
      test.setEfficiency(60);
      test.setCurrent(30);
      

      System.out.println("Tank capacity : "+C);
      System.out.println("Efficiency : "+test.getEfficiency());
      System.out.println("Maximum speed : "+M);
      
      //print error if the amount fuel is greater than capacity and if the current speed is greater than max speed.
      if(test.getCurrent() > M)
         System.out.println("Current speed exceeds Max speed! Error!");
      else
         System.out.println("Current speed : " + test.getCurrent());
      
      if(test.getAmount() > C)
         System.out.println("Fuel amount exceeds Capacity! Error!");
      else
         System.out.println("Fuel amount : "+test.getAmount());      
   }

}