class Outer { 
   // Simple nested inner class 
   class Inner { 
      public void show() { 
           System.out.println("In a nested class method"); 
      } 
   } 
} 
class InnerClass { 
   public static void main(String[] args) { 
       Outer out = new Outer();
       Outer.Inner in = out.new Inner(); 
       in.show(); 
   } 
}