public class OperatorChallenge{
   public static void main(String[] args){
      double myfirst = 20.00d;
      double mysecond = 80.00d;
      double add = 100d * (myfirst+mysecond);
      System.out.println("My Addition Value : "+add);
      double remainder = add%40d;
      System.out.println("My Remainder Value : "+remainder);
      boolean bool;
      if(remainder==0)
         bool = true;
      else
         bool = false;
         
         System.out.println("My Boolean Value : "+bool);
      
      if(!bool)
         System.out.println("Got Some Remainder");
   }
}
